/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.DBManagment;

import classes.Peptido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author leisy
 */
public class DBManager {
    public Connection c = null;
    public Statement stmt = null;
    
    
    public DBManager(){
       try {
          Class.forName("org.postgresql.Driver");
          c = DriverManager
             .getConnection("jdbc:postgresql://localhost:5432/peptidos_db",
             "postgres", "admin");
       } catch (Exception e) {
          System.err.println(e.getClass().getName()+": "+e.getMessage());
          System.exit(0);
       }
       System.out.println("Opened database successfully");
    }
    
    public void ExecuteInsertQuery (Peptido newPep) throws SQLException{
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO pÉptido (secuencia, nombre_principal, peso_molecular, carga_neta, hidrofobicidad, es_natural, estado_verificacion, organismo_fuente_id) VALUES (?,?,?,?,?,?,?,?)"); 
            pstmt.setString(1,newPep.secuencia);
            pstmt.setString(2,newPep.nombre_principal);
            pstmt.setDouble(3,newPep.peso_molecular);
            pstmt.setInt(4,newPep.carga_neta);
            pstmt.setDouble(5,newPep.hidrofobicidad);
            pstmt.setBoolean(6,newPep.es_natural);
            pstmt.setString(7,newPep.estado_verificacion);
            pstmt.setInt(8,Integer.parseInt(newPep.organismo_fuente));
            
            pstmt.executeUpdate();
    }
    public void FillPepArray(ArrayList<Peptido> pepList){
       try{
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM vista_peptido_completo");
            
            while(rs.next()){
                Peptido pep = new Peptido(
                    rs.getString("id"), 
                    rs.getString("secuencia"), 
                    rs.getString("nombre_principal"), 
                    rs.getInt("longitud"), 
                    rs.getDouble("peso_molecular"),
                    rs.getInt("carga_neta"),
                    rs.getDouble("hidrofobicidad"),
                    rs.getBoolean("es_natural"),
                    rs.getString("estado_verificacion"),
                    rs.getString("organismo_fuente")
                );
                pepList.add(pep);
            }
            
        } catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    
    }
    public ArrayList<String> pullOrganismoFuente(){
        ArrayList<String> list = new ArrayList<>();
        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre_cientifico FROM fuente_organismo");
        
            while(rs.next()){
                list.add(rs.getString("nombre_cientifico"));
            }
            
            
        } catch(Exception e){
            System.err.println( e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Organismos Fuentes leidos");
        return list;
    }
  // public void ExecuteSelectQuery (String sqlSentence, )
}

