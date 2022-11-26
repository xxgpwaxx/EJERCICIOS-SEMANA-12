/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJEMPLO_04;

/**
 *
 * @author Usuario
 */
public class EJEMPLO_04 {
    Punto dato;
    Nodo enlace;
    public Nodo(Punto p)
    {
        dato = p;
        enlace = null;
        }
        public Nodo(Punto p, Nodo n)
    {
        dato = p;
        enlace = n;
    }
}
