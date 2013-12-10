package com.shinodogg.TrySolrJ;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.core.CoreContainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String url = "http://localhost:8983/solr/collection1";
        SolrServer server = new HttpSolrServer(url);
        
        CoreContainer container = new CoreContainer.Initializer().initialize();
        
        
    }
}
