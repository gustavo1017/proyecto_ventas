/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.daos;
import java.util.List;
import ventas.entidades.Distrito;
/**
 *
 * @author Gustavo
 */
public interface DistritosDao {
     public void create(Distrito distrito);
    
    public Distrito find(int id);
    public List<Distrito> findAll();
    
    public void updatea(Distrito distrito);
    
    public void delete(Distrito distrito);
}
