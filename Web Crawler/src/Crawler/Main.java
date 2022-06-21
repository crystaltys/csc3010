package Crawler;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<webCrawler> workers = new ArrayList<>();
		workers.add(new webCrawler("https://www.google.com/search?q=university+of+glasgow", 1));
		workers.add(new webCrawler("https://en.wikipedia.org/wiki/University_of_Glasgow", 2));
	
		for (webCrawler w : workers) {
			try {
				w.getThread().join();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
