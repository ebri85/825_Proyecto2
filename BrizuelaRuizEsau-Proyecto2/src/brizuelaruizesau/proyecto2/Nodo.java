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
    
    


    public Nodo(Object valor)
      {

        this.valor = valor;
        this.hDer= null;
        this.hIzq = null;
      }

    @Override
    public String toString()
      {
        return (String)valor;
      }
    

  
}



