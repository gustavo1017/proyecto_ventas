/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.util;
import java.util.*;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Gustavo
 */
public class DBConnection {
    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static Driver driver = null;
    private static String JDBC_FILE_NAME = "jdbc";
    
    
   public static Properties loadProperties(String file){
        Properties prop = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        Enumeration e = bundle.getKeys();
        
        String key = null;
        
        while(e.hasMoreElements()){
             key = (String)e.nextElement();
             prop.put(key, bundle.getObject(key));
        }
        JDBC_DRIVER = prop.getProperty("driver");
        JDBC_URL = prop.getProperty("url");
        JDBC_USER = prop.getProperty("user");
        JDBC_PASS = prop.getProperty("pass");
        return prop;
        
    }
   
      public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        loadProperties(JDBC_FILE_NAME);
        ds.setDriverClassName(JDBC_DRIVER);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        ds.setUrl(JDBC_URL);
        //Definimos el tamaño del pool de conexiones
        ds.setInitialSize(5);
        return ds;

    }
    
    public static  Connection getConnection() throws SQLException{
      
       return getDataSource().getConnection();
    }
    
    
}
