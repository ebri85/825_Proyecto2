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
public class Lado
        
  {
    private Nodo nodo;
    private Lado izq,der; //IZQ =false: DER=true
    

    
public void InsertarNodo(Nodo n)   
    {
      String str1= nodo.toString();
      String str2 = n.toString();
      if(nodo==null)
      {
          this.nodo = n;
      } else 
      {
            if(str2.compareTo(str1)<0)
          {
              if(izq ==null)
              {
                  izq = new Lado();
                  izq.InsertarNodo(n);
                } else
                {
                   if(str2.compareTo(str1)>0)
                   {
                       if(der == null)
                       {
                           der = new Lado();
                           der.InsertarNodo(n);
                       }
                   }
                }
          }
      }
    }

public void PreOrden(Nodo n)   
    {
      String str1= nodo.toString();
      String hilera= null;
      String str2 = n.toString();
      if(nodo==null)
      {
          this.nodo = n;
      } else 
      {
            if(str2.compareTo(str1)<0)
          {
              if(izq ==null)
              {
                  izq = new Lado();
                  izq.InsertarNodo(n);
                } else
                {
                   if(str2.compareTo(str1)>0)
                   {
                       if(der == null)
                       {
                           der = new Lado();
                           der.InsertarNodo(n);
                       }
                   }
                }
          }
      }
    }
  }


  }


