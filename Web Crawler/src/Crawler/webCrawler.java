package Crawler;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class webCrawler implements Runnable {
	private static final int MAX_DEPTH = 3;
	private Thread thread; 
	private String seed_url;
	private ArrayList<String> visitedLinks = new ArrayList<String>();
	private int ID;
	
	
	public webCrawler (String link, int num) {
		System.out.println("Web crawler created");
		seed_url = link;
		ID = num; 
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		crawl(1, seed_url);
		
	}
	
	private void crawl(int level, String url) {
		if (level <= MAX_DEPTH) {
			Document doc = request(url);
			
			if (doc != null) {
				for(Element link : doc.select("a[href]")) {
						String next_link = link.absUrl("href");
					if(visitedLinks.contains(next_link) == false) {
						crawl(level++, next_link);
					}
				}	
			}
		}
	}
	
	private Document request(String url) {
		try {
			Connection con = Jsoup.connect(url);
			Document doc = con.get();
			
			if (con.response().statusCode() == 200) {
				System.out.println("\n**Worker ID: " + ID + " Received webpage at " + url);
				String title = doc.title();
				System.out.println(title);
				visitedLinks.add(url);
				
				return doc;
			}
			return null;
		}
		catch(IOException e) {
			return null;
		}
	}
	
	public Thread getThread() {
		return thread;
	}
}
