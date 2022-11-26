/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnteros;

/**
 *
 * @author Usuario
 */
public class Nodo {
    int dato;
    Nodo enlace;
    public Nodo(int x)
    {
     dato = x;
     enlace = null;
    }
    public int getDato()
    {
     return dato;
    }
    public Nodo getEnlace()
    {
     return enlace;
    }
    public void setEnlace(Nodo enlace)
    {
     this.enlace = enlace;
    }
}
