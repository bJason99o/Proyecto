/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.model;

/**
 *
 * @author alehe
 */
public class Nodo {
    private int dato;
    private Meals comida;
    private Nodo siguiente;

public Nodo(int dato)
{
    this.dato = dato;
    siguiente = null;
}

public int getDato()
{
    return dato;
}

public void setDato(int dato)
{
    this.dato = dato;
}

public Nodo getSiguiente()
{
    return siguiente;
}

public String obtenerMeals(int indice) {
        if (comida != null) {
            switch(indice) {
                case 0: return comida.getIdMeal();
                case 1: return comida.getName();
                case 2: return String.valueOf(comida.getQuantity());
                case 3: return String.valueOf(comida.getPrice());
                default: return "";
            }
        } else {
            return "";
        }
    }

public void setSiguiente(Nodo siguiente)
{
    this.siguiente = siguiente;
}
}
