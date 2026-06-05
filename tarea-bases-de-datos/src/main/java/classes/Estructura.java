/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author leisy
 */
public class Estructura {
    public String tipoEstructura;
    public String pdbId;
    public String[] metodo;
    public String ciclizacion;

    public Estructura(String tipoEstructura, String pdbId, String[] metodo, String ciclizacion) {
        this.tipoEstructura = tipoEstructura;
        this.pdbId = pdbId;
        this.metodo = metodo;
        this.ciclizacion = ciclizacion;
    }
}