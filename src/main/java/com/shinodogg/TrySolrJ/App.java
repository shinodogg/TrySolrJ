package com.shinodogg.TrySolrJ;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrInputDocument;

public class App 
{
    public static void main( String[] args ) throws SolrServerException, IOException
    {
        String url = "http://localhost:8983/solr/solrbook";
        SolrServer server = new HttpSolrServer(url);
        
//        SolrInputDocument document = new SolrInputDocument();
//        document.addField("url","http://gihyo.jp/ThisIsSample1");
//        document.addField("title","はじめてのSolr");
//        String[] authors = {"山田太郎", "鈴木一郎"};
//        document.addField("author", authors);
//        document.addField("summary", "この書籍はフィクションです");
//        server.add(document);
//        server.commit();
        
        SolrQuery query = new SolrQuery();
        query.setQuery("山田太郎");
        QueryResponse res = server.query(query);
        for(SolrDocument document : res.getResults()) {
        	for(String name : document.getFieldNames()) {
        		System.out.println(name + ": " + document.get(name));
        	}
            System.out.println("----------");
        }
    }
}
