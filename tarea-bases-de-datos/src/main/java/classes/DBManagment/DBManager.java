/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.DBManagment;

import classes.Peptido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author leisy
 */
public class DBManager {
    public Connection c = null;
    public Statement stmt = null;
    
    
    public DBManager(ArrayList<Peptido> pepList){
       try {
          Class.forName("org.postgresql.Driver");
          c = DriverManager
             .getConnection("jdbc:postgresql://localhost:5432/peptidos_db",
             "postgres", "123");
       } catch (Exception e) {
          System.err.println(e.getClass().getName()+": "+e.getMessage());
          System.exit(0);
       }
       System.out.println("Opened database successfully");
        FillPepArray(pepList);
    }
    
    public void ExecuteUpdateQuery (String sqlSentence){
        try{
            stmt = c.createStatement();
            stmt.executeUpdate(sqlSentence);
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        } 
        System.out.println("Records created successfully");
    }
    private void FillPepArray(ArrayList<Peptido> pepList){
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
  // public void ExecuteSelectQuery (String sqlSentence, )
}

