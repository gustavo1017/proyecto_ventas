/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.pruebas;
import ventas.dao.impl.*;
import ventas.daos.*;
import ventas.entidades.*;


/**
 *
 * @author Gustavo
 */
public class Prueba01 {
    
    
    public static void main(String[] args){
           DistritosDao dao = new DistritoDaoImplStmt();
        for(Distrito distrito:dao.findAll()){
            System.out.print(distrito.getId()+"\t");
            System.out.println(distrito.getNombre());
        }
        
        System.out.println();
        ClienteDao objClienteDAO = new ClienteDaoImplStmt();
        for(Cliente cliente:objClienteDAO.findAll()){
            System.out.print(cliente.getDoc_cli()+"\t");
            System.out.print(cliente.getNom_cli());
            System.out.print(cliente.getDir_cli());
            System.out.println(cliente.getId_dis());
        }
        
        
    }
}
