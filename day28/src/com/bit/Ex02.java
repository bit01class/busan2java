package com.bit;

import java.util.Date;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Ex02 {

	public static void main(String[] args) {
		String addr="127.0.0.1";
		MongoClient client=null;
		try {
			client=new MongoClient(addr);
			MongoDatabase db = client.getDatabase("mongodbVSCodePlaygroundDB");
			MongoCollection<Document> coll = db.getCollection("sales");
// insertOne
//			Document doc=new Document();//{item:'efg',price:17.5,quantity:7,date:new Date()}
//			doc.append("item", "efg");
//			doc.append("price", 17.5);
//			doc.append("quantity", 7);
//			doc.append("date", new Date());
//			coll.insertOne(doc);
// deleteOne
//			Document obj=new Document();
//			obj.append("item", "efg");
//			coll.deleteOne(obj);
// updateOne
			Document doc1=new Document();
			doc1.append("item", "abc");
			Document doc2=new Document();
			Document doc3=new Document();
			doc3.append("price", 19.5);
			doc2.append("$set", doc3);
			coll.updateOne(doc1, doc2);
			client.close();
			System.out.println("작성");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
