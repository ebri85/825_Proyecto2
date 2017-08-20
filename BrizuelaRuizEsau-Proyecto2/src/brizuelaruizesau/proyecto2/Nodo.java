/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.proyecto2;

/**
 *
 * @author esau_br
 */
public class Nodo 
{
    
    Object valor;
    public Nodo hDer,hIzq;
    
    public Nodo(Object valor)//constructor
      {

        this.valor = valor;
        this.hDer= null;//puntero hacia el hijo derecho
        this.hIzq = null;//puntero hacia el hijo Izquierdo
      }

    @Override
    public String toString()
      {
        return (String)valor;//retorna un string del Objecto que se digito
      }
    

  
}



