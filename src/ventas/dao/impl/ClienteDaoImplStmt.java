/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ventas.daos.ClienteDao;
import ventas.entidades.Cliente;
import ventas.util.DBConnection;


/**
 *
 * @author Gustavo
 */
public class ClienteDaoImplStmt implements ClienteDao {
    private Connection con=null;
    private ResultSet rs;
    private Statement st;
    @Override
    public void create(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
       List<Cliente> lista = new ArrayList<>();
       try{
           con = DBConnection.getConnection();
           st = con.createStatement();
           rs = st.executeQuery("select * from tb_cliente");
           while(rs.next()){
               lista.add(new Cliente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
           }
       }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
              try {
                con.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
       }
        return lista;
        
    }

    @Override
    public void update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
