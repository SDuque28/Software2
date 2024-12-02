/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.neo4j;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

/**
 *
 * @author SANTIAGO DUQUE
 */
public class Neo4JConnection {
    private static Driver driver;
    
    public static void connect(){
        driver = GraphDatabase.driver("bolt://localhost:7687",AuthTokens.basic("neo4j","universidad2024"));
    } 
    
    public static void close(){
        if (driver != null) driver.close();
    }

    public static Driver getDriver() {
        return driver;
    }
    
}
