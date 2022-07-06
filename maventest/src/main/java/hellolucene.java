import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.MMapDirectory;
import org.apache.lucene.store.NoLockFactory;
import org.apache.lucene.util.QueryBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 


public class hellolucene {

	public static void main(String args[]) throws IOException, ParseException {

		Analyzer analyzer = new StandardAnalyzer();
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		JSONParser parser = new JSONParser();
		
		Directory directory = new MMapDirectory(new File("C:\\Users\\User\\Documents\\GitHub\\csc3010\\LuceneDirectory").toPath(), NoLockFactory.INSTANCE);
		
		try (FileReader reader = new FileReader("./json/glasgow1.json"))
        {
            //Read JSON file
            Object obj = parser.parse(reader); 
            JSONObject JSONList = (JSONObject) obj;
            String yourhead = (String) JSONList.get("content");
            System.out.println(yourhead);         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Document doc1 = new Document();
		doc1.add(new TextField("id", "1", Field.Store.YES));
		doc1.add(new TextField("title", "Lucene in Action", Field.Store.YES));
		doc1.add(new TextField("description", "Lucene is a platform where we can index our data to make it searchable.",
				Field.Store.YES));

		Document doc2 = new Document();
		doc2.add(new TextField("id", "2", Field.Store.YES));
		doc2.add(new TextField("title", "Java in Action", Field.Store.YES));
		doc2.add(new TextField("description",
				"Java is a platform and programming language to build Enterprise Applications", Field.Store.YES));
		
		
		try (IndexWriter indexWriter = new IndexWriter(directory, config)) {
			indexWriter.addDocument(doc1);
			indexWriter.addDocument(doc2);
		}

		QueryBuilder queryBuilder = new QueryBuilder(analyzer);
		Query query = queryBuilder.createPhraseQuery("title", "java", 0);
		int maxHitsPerPage = 10;
		
		try (IndexReader indexReader = DirectoryReader.open(directory)) {
			IndexSearcher indexSearcher = new IndexSearcher(indexReader);

			TopDocs docs = indexSearcher.search(query, maxHitsPerPage);
			ScoreDoc[] hits = docs.scoreDocs;
			System.out.println("Total Hits: " + docs.totalHits);
			System.out.println("Results: ");
			for (int i = 0; i < hits.length; i++) {
				Document d = indexSearcher.doc(hits[i].doc);
				System.out.println("Content: " + d.get("title"));
			}
		}

	}
	
	public static void convert() {
		// take in json file 
		// fit into doc
		
	}

}