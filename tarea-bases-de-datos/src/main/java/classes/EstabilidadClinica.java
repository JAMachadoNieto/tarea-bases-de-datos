/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author leisy
 */
public class EstabilidadClinica {
    public double estabilidadSuero;
    public String estadoClinico;
    public String toxicidadInVivo;
    public String datosProteasas; // JSONB como String

    public EstabilidadClinica(double estabilidadSuero, String estadoClinico,
                              String toxicidadInVivo, String datosProteasas) {
        this.estabilidadSuero = estabilidadSuero;
        this.estadoClinico = estadoClinico;
        this.toxicidadInVivo = toxicidadInVivo;
        this.datosProteasas = datosProteasas;
    }
}