/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.entidades;

/**
 *
 * @author Gustavo
 */
public class Cliente {
    private String doc_cli;
    private String nom_cli;
    private String dir_cli;
    private int id_dis;
    public Cliente(){}
    public Cliente(String doc_cli, String nom_cli, String dir_cli, int id_dis ){
        this.doc_cli=doc_cli;
        this.nom_cli=nom_cli;
        this.dir_cli=dir_cli;
        this.id_dis=id_dis;
    }
    
    public String getDoc_cli() {
        return doc_cli;
    }

    public void setDoc_cli(String doc_cli) {
        this.doc_cli = doc_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getDir_cli() {
        return dir_cli;
    }

    public void setDir_cli(String dir_cli) {
        this.dir_cli = dir_cli;
    }

    public int getId_dis() {
        return id_dis;
    }

    public void setId_dis(int id_dis) {
        this.id_dis = id_dis;
    }
   
}
