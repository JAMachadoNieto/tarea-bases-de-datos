/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author leisy
 */
public class Peptido {
    public String id;
    public String secuencia;
    public String nombre_principal;
    public int longitud;
    public double peso_molecular;
    public int carga_neta;
    public double hidrofobicidad;
    public boolean es_natural;
    public String estado_verificacion;
    public FuenteOrganismo organismo_fuente=null;
    
    public Peptido(String id, String secuencia, String nombre_principal, int longitud, double peso_molecular, int carga_neta,
                   double hidrofobicidad, boolean es_natural, String estado_verificacion, FuenteOrganismo organismo_fuente){
        this.id=id;
        this.secuencia=secuencia;
        this.nombre_principal = nombre_principal;
        this.longitud=longitud;
        this.peso_molecular=peso_molecular;
        this.carga_neta=carga_neta;
        this.hidrofobicidad=hidrofobicidad;
        this.es_natural=es_natural;
        this.estado_verificacion=estado_verificacion;
        this.organismo_fuente = organismo_fuente;
    }
}
