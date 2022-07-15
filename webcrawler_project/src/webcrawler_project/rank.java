package webcrawler_project;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.index.MultiFields;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.Terms;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.Weight;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.document.Field;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.Reader;
import java.util.Iterator;
 

public class rank {
	
	public void BackwardsTermQuery(String field, String term) {
		TermQuery backwardsQuery;
		TermQuery forwardsQuery;
	    // A wrapped TermQuery for the reverse string
	    Term backwardsTerm = new Term(field, new StringBuilder(term).reverse().toString());
	    backwardsQuery = new TermQuery(backwardsTerm);
	    // A wrapped TermQuery for the Forward
	    Term forwardsTerm = new Term(field, term);
	    forwardsQuery = new TermQuery(forwardsTerm);
	}

	public static void main(String[] args) {
		try {
			String indexPath="C:\\Users\\sujit\\Desktop\\lucene_indexed"; //Path to create the Lucene Document Index.
		    File fXmlFile = new File("C:\\Users\\sujit\\Desktop\\sample.txt"); //Path to find the document to be indexed.
	
		    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		    Document doc = dBuilder.parse(fXmlFile);
		    doc.getDocumentElement().normalize();
	
		    
		    Directory dir = FSDirectory.open(Paths.get(indexPath));
		    // Access to data structures in Lucene’s inverted index. If we want to look up a term, 
		    // and visit every document it exists in, this is where we’d start. If we wanted to play 
		    // with term vectors, offsets, or anything else stored in the index, we’d look here for that stuff as well
		    IndexReader reader = DirectoryReader.open(dir);
		    // Execute the search (one index searcher can have many readers)
		    IndexSearcher searcher = new IndexSearcher(reader);
		    //How we expect the searcher to perform the search, encompassing both scoring and which documents are 
		    // returned. In this case, we’re searching for “value” in field “field”. This is the 
		    // bit we want to toy with
			Query q = new TermQuery(new Term("url", "iamaurl.com"));
			searcher.search(q, 10);
			
			Weight w = q.createWeight(searcher, null, 0);
			// IndexSearcher level calculations for weight
			//foreach IndexReader idxReader:
			//Scorer s = w.scorer(idxReader);    // collect matches and score them
			
			
			//Query (job is to create weight instance only)-> Weight -> Scorer
			// need to override
			//createWeight()
			//hashCode()
			//equals()
			
			
		}catch (Exception e) {
		    e.printStackTrace();
	    }

	}

}
