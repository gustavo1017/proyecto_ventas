/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ventas.daos.DistritosDao;
import ventas.entidades.Distrito;
import ventas.util.DBConnection;

/**
 *
 * @author Gustavo
 */
public class DistritoDaoImplStmt implements DistritosDao{
       private Connection cn=null;
    private Statement st;
    private ResultSet rs;
    @Override
    public void create(Distrito distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Distrito find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Distrito> findAll() {
        List<Distrito> lista=new ArrayList<>();
        try{
            cn = DBConnection.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select * from tb_distrito");
            while(rs.next()){
                lista.add(new Distrito(rs.getInt(1),rs.getString(2)));
            }
            cn.close();
        }catch(SQLException ex){
            System.out.println("codigo : "+ex.getErrorCode());
            System.out.println("mensaje : "+ex.getMessage());
            System.out.println("estado : "+ex.getSQLState());
            try {
                cn.close();
                System.out.println("conexion cerrada en el catch");
            } catch (SQLException ex1) {
                System.out.println("No se pudo cerrar la conexion");
            }
        }
        return lista;
    }

    @Override
    public void updatea(Distrito distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Distrito distrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
