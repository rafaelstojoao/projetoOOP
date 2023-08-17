/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.savegame;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author unifai
 */


public class ConnectionPVP {
    public String url = "jdbc:mysql://localhost:3306/tadspvp";
    private String user = "root";
    private String senha = "";
    
    public Connection con = null;
    public Statement stmt = null;
    
    
    public void conecta(){
        try{
            this.con = DriverManager.getConnection(this.url, this.user, this.senha);
            System.out.println("Conectado");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void grava(String sql) throws SQLException{
        stmt = con.createStatement();
        if(stmt.execute(sql)){
            System.out.println("Gravado.");
        }
    }
    
    public void listdata() throws SQLException{
        stmt = con.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM Jogador");
        while (res.next()) {
            String nome = res.getString("nome");
            System.out.println(nome + "\n");
        }
    }   
}
