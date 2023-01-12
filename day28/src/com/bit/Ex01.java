package com.bit;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class Ex01 {

	public static void main(String[] args) {
		byte[] arr= {127,0,0,1};
		InetAddress inet=null;
		ServerAddress addr=null;
		MongoClient client=null;
		try {
			inet = InetAddress.getByAddress(arr);
			addr=new ServerAddress(inet);
			client=new MongoClient(addr);
//			List<String> dbs = client.getDatabaseNames();
//			for(int i=0; i<dbs.size(); i++) {
//				System.out.println(dbs.get(i));
//			}
			MongoDatabase db = client.getDatabase("mongodbVSCodePlaygroundDB");
//			db.createCollection("guest1");
//			db.createCollection("emp");
//			db.createCollection("dept");
			
//			MongoIterable<String> collections = db.listCollectionNames();
//			MongoCursor<String> ite = collections.iterator();
//			while(ite.hasNext())
//				System.out.println(ite.next());
			
			MongoCollection<Document> coll=db.getCollection("sales");
			FindIterable<Document> rs = coll.find();
			MongoCursor<Document> ite = rs.iterator();
			while(ite.hasNext()) {
//				Document doc=(Document) ite.next();
				Document doc=ite.next();
				System.out.print(doc.get("_id")+"\t");
				System.out.print(doc.get("item")+"\t");
				System.out.print(doc.get("price")+"\t");
				System.out.print(doc.get("quantity")+"\t");
				System.out.print(doc.get("date")+"\n");
			}
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}









