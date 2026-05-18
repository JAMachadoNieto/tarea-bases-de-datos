
import classes.DBManagment.DBManager;
import classes.Peptido;
import java.util.ArrayList;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author leisy
 */
public class TareaBasesDeDatos {
    public static void main(String[] args) {
        ArrayList<Peptido> peptidos = new ArrayList<>();
        DBManager db = new DBManager(peptidos);
        
    }
}
