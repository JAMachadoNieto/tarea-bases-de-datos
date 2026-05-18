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
    public String sequence;
    public int longitud;
    public double peso_molecular;
    public int carga_neta;
    public double hidrofobicidad;
    public boolean es_natural;
    public String estado_verificacion;
    public String nombre_alternativo;
    public FuenteOrganismo fuentOrg = null;
    
    public Peptido(String id, String sequence, int longitud, double peso_molecular, int carga_neta,
                   double hidrofobicidad, boolean es_natural, String estado_verificacion,
                   String nombre_alternativo ,String nombreCientifico, String reino){
        this.id=id;
        this.sequence=sequence;
        this.longitud=longitud;
        this.peso_molecular=peso_molecular;
        this.carga_neta=carga_neta;
        this.hidrofobicidad=hidrofobicidad;
        this.es_natural=es_natural;
        this.estado_verificacion=estado_verificacion;
        this.nombre_alternativo = nombre_alternativo;
        this.fuentOrg = new FuenteOrganismo(nombreCientifico, reino);
    }
}
