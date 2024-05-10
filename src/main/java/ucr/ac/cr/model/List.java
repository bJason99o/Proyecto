/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.model;

/**
 *
 * @author alehe
 */
public class List {
    

private int longitud;
private Nodo cabeza;

public List()
{
    longitud = 0;
    cabeza = null;
}

public void insertarPrincipio(int dato)
{
    Nodo nodo = new Nodo(dato);
    nodo.setSiguiente(cabeza);
    cabeza = nodo;
    longitud++;
}

public void insertarFinal(int dato)
{
    Nodo nodo = new Nodo(dato);
    if (cabeza == null) {
        cabeza = nodo;
    } else {
        Nodo puntero = cabeza;
        while (puntero.getSiguiente() != null) {
            puntero = puntero.getSiguiente();
        }
        puntero.setSiguiente(nodo);
    }
    longitud++;
}

public void insertarDespues(int posicion, int valor)
{
    Nodo nodo = new Nodo(valor);
    if (cabeza == null) {
        cabeza = nodo;
    } else {
        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < posicion && puntero.getSiguiente() != null) {
            puntero = puntero.getSiguiente();
            contador++;

        }
        nodo.setSiguiente(puntero.getSiguiente());
        puntero.setSiguiente(nodo);

    }
    longitud++;

}

public int getDato(int posicion)
{
    if (cabeza == null) {
        return -1;
    } else {
        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < posicion && puntero.getSiguiente() != null) {
            puntero = puntero.getSiguiente();
            contador++;
        }
        if (contador != posicion) {
            return -1;
        } else {
            return puntero.getDato();
        }
    }
}

public int getLongitud()
{
    return longitud;
}

public boolean isVacia()
{
    return cabeza == null;
}

public void eliminarPrincipio()
{
    if (cabeza != null) {
        Nodo primer = cabeza;
        cabeza = cabeza.getSiguiente();
        primer.setSiguiente(null);
        longitud--;
    }
}

public void eliminarUltimo()
{
    if (cabeza != null) {
        if (cabeza.getSiguiente() == null) {
            cabeza = null;
            longitud--;
        } else {
            Nodo puntero = cabeza;
            while (puntero.getSiguiente().getSiguiente() != null) {
                puntero = puntero.getSiguiente();
            }
            puntero.setSiguiente(null);
            longitud--;
        }

    }
}

public void eliminarPosicion(int posicion)
{
    if (cabeza != null) {
        if (posicion == 0) {
            Nodo primer = cabeza;
            cabeza = cabeza.getSiguiente();
            primer.setSiguiente(null);
            longitud--;

        } else {
            if (posicion < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (posicion - 1)) {
                    puntero = puntero.getSiguiente();
                    contador++;
                }
                Nodo temp = puntero.getSiguiente();
                puntero.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(null);
                longitud--;
            }
        }

    }

}

public String toString()
{
    String datosLista = "";

    Nodo nodo = null;
    Nodo aux = null;
    if (cabeza != null) {
        nodo = cabeza;
    }
    for (int elemento = 0; elemento < longitud; elemento++) {
        datosLista += "\n" + nodo.getDato();
        aux = nodo.getSiguiente();
        nodo = aux;

    }
    return datosLista;
}
}
    

