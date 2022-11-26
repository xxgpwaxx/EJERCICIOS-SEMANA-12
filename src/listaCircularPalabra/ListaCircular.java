/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaCircularPalabra;

/**
 *
 * @author Usuario
 */
public class ListaCircular {
    private Nodo lc;
    public ListaCircular(){;}
    public void insertar(String entrada){;}
    public void eliminar(String entrada){
            Nodo actual;
            actual = lc;
            while ((actual.enlace != lc) &&
            !(actual.enlace.dato.equals(entrada)))
            {
            if (!actual.enlace.dato.equals(entrada))
            actual = actual.enlace;
            }
            // Enlace de nodo anterior con el siguiente
            // si se ha encontrado el nodo.
            if (actual.enlace.dato.equals(entrada))
            {
            Nodo p;
            p = actual.enlace; // Nodo a eliminar
            if (lc == lc.enlace) // Lista con un solo nodo
            lc = null;
            else
            {
            if (p == lc)
            {
            lc = actual; // Se borra el elemento referenciado por lc,
            // el nuevo acceso a la lista es el anterior
            }
            actual.enlace = p.enlace;
            }
            p = null;
            }
           }
    public void borrarLista() {
            Nodo p;
            if (lc != null)
            {
            p = lc;
            do {
            Nodo t;
            t = p;
            p = p.enlace;
            t = null; // no es estrictamente necesario
            }while(p != lc);
            }
            else
                System.out.println("\n\t Lista vacía.");
            lc = null;
           }
           public void recorrer(){;}
    }
