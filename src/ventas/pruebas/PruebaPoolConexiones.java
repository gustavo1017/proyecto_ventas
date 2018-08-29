/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.pruebas;
import java.sql.*;
import ventas.util.DBConnection;
import ventas.util.DbConnectionOracle;
/**
 *
 * @author Gustavo
 */
public class PruebaPoolConexiones {
    
    public static void main(String[] argr){
        Connection conn=null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            //Probamos el pool de conexiones de MySql
            conn = DBConnection.getConnection();
            System.out.println("Utilizamos el pool de conexiones de mysql");
            stmt = conn.prepareStatement("SELECT * FROM tb_distrito");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.print(" "+rs.getInt(1));
                System.out.println(" "+rs.getString(2));
 
            }
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        try{
            conn = DbConnectionOracle.getConnection();
            System.out.println("Utilizamos el pool de conexiones de oracle");
            stmt = conn.prepareStatement("SELECT * FROM employees WHERE employee_id IN(100,101,102)");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.print(" "+rs.getInt(1));
                System.out.print(" "+rs.getString(2));
                System.out.println(" "+rs.getString(3));
            }
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
    
}
