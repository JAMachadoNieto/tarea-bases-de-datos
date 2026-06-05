/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author leisy
 */
public class Publicacion {
    public String pmid;
    public String titulo;
    public String autores;
    public int anyo;

    public Publicacion(String pmid, String titulo, String autores, int anyo) {
        this.pmid = pmid;
        this.titulo = titulo;
        this.autores = autores;
        this.anyo = anyo;
    }
}