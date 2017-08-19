/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author esau_br
 */
public class Arbol
        
  {
    Nodo raiz;
    
    public Arbol()
      {
        this.raiz= null;
      }
   public void InsertarNodo(Object obj)
           //metodo de insersion de Objetos al Arbol, utilizando los punteros de izquierdo o derecho.
     {
        Nodo nuevo = new Nodo(obj);
        String str1=obj.toString();
        String str2;
            
           if(raiz==null)
             {
               raiz = nuevo;
               
             } else 
                {
                   Nodo auxiliar = raiz;
                   Nodo padre ;
                   str2= auxiliar.toString();
                           while(true)
                             {
                               padre = auxiliar;
                                
                               if(str1.compareTo(str2)<0)
                                 {
                                   auxiliar = auxiliar.hIzq;
                                   if(auxiliar==null)
                                     {
                                       padre.hIzq = nuevo;
                                       return;
                                     }
                                 } else 
                                    {
                                     auxiliar = auxiliar.hDer;
                                     
                                     if(auxiliar == null)
                                       {
                                         padre.hDer=nuevo;
                                            return;                                         
                                       }
                                    }
                               
                             }
                }
       
       
     }
   
   public boolean vacio()
     {
       return raiz==null;       
     }
   
   public void RecorreInOrden(Nodo nodo)
     {
       String hilera= null;
       if(nodo!=null)
       {
           RecorreInOrden(nodo.hIzq);
           hilera = hilera + ", ["+nodo.toString()+']';
           RecorreInOrden(nodo.hDer);           
       }
       JOptionPane.showMessageDialog(null, hilera,"Recorrido InOrden",JOptionPane.OK_OPTION);
     }
   
   public void RecorrePreOrden(Nodo nodo)
     {
       String hilera = null;
       if(nodo!=null)
       {
            hilera = hilera + ", ["+nodo.toString()+']';
            RecorrePreOrden(nodo.hIzq);
            RecorrePreOrden(nodo.hDer);
       }
       JOptionPane.showMessageDialog(null, hilera,"Recorrido InOrden",JOptionPane.OK_OPTION);
     }
    
   
     public void RecorrePosOrden(Nodo nodo)
     {
       String hilera = null;
       if(nodo!=null)
       {
            RecorrePosOrden(nodo.hIzq);
            RecorrePosOrden(nodo.hDer);
            hilera = hilera + ", ["+nodo.toString()+']';
       }
       JOptionPane.showMessageDialog(null, hilera,"Recorrido InOrden",JOptionPane.OK_OPTION);
     }
 
  }
