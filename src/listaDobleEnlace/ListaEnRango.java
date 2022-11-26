/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleEnlace;
import java.util.Random;
import java.io.*;
import listaDobleEnlace.*;
/**
 *
 * @author Usuario
 */
public class ListaEnRango {
    public static void main(String [] ar) throws IOException
    {
     Random r;
     int d, x1, x2;
     final int M = 29; // número de elementos de la lista
     final int MX = 999;
     BufferedReader entrada = new BufferedReader(
     new InputStreamReader(System.in));
     ListaDoble listaDb;
     r = new Random();
     listaDb = new ListaDoble();
     for (int j = 1; j <= M ; j++)
     {
     d = r.nextInt(MX) + 1;
     listaDb.insertarCabezaLista(d);
     }

     System.out.println("Elementos de la lista original");
     listaDb.visualizar();
     // rango de valores
     System.out.println("\nRango que va a contener la lista");
     x1 = Integer.parseInt(entrada.readLine());
     x2 = Integer.parseInt(entrada.readLine());
     // crea iterador asociado a la lista
     IteradorLista iterador = new IteradorLista(listaDb);
     Nodo a;
     // recorre la lista con el iterador
     a = iterador.siguiente();
     while (a != null)
     {
     int w;
     w = a.getDato();
     if (!(w >= x1 && w <= x2)) // fuera de rango
     listaDb.eliminar(w);
     a = iterador.siguiente();
     }
     System.out.println("Elementos actuales de la lista");
     listaDb.visualizar();
    }
}
