/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleEnlace;

/**
 *
 * @author Usuario
 */
public class ListaDoble {
    Nodo cabeza;
    public ListaDoble insertarCabezaLista(Elemento entrada)
    {
     Nodo nuevo;
    nuevo = new Nodo(entrada);
    nuevo.adelante = cabeza;
    if (cabeza != null )
     cabeza.atras = nuevo;
    cabeza = nuevo;
    return this;
    }
    public ListaDoble insertaDespues(Nodo anterior, Elemento entrada)
    {
    Nodo nuevo;
    nuevo = new Nodo(anterior);
    nuevo.adelante = anterior.adelante;
    if (anterior.adelante != null)
     anterior.adelante.atras = nuevo;
    anterior.adelante = nuevo;
    nuevo.atras = anterior;
    return this;
    }
    // métodos de la clase (implementación en apartado 8.9)
    public ListaDoble(){;}
    public ListaDoble insertarCabezaLista(int entrada){;return null;
}
    public ListaDoble insertaDespues(Nodo anterior, int entrada){;return null;
}
    public void eliminar (int entrada){;}
    public void visualizar() {;}
    public void buscarLista(int destino) {;}
}
