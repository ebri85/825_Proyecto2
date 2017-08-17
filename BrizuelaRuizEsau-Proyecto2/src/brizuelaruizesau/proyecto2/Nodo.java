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
   
    private Object valor;

    public Nodo()
      {
        this.valor = null;
      }
    
    public Nodo(Object valor)
      {
        this.valor = valor;
      }

    @Override
    public String toString()
      {
        return (String) valor;
      }
    
    
    
  
}



