/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.proyecto2;

import javax.swing.JFrame;

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

                               if(obj.hashCode()< auxiliar.valor.hashCode())//esto compara el tamano del objecto, 
                                                                            //retorna el tamano segun el tipo de dato
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
           //metodo recursivo para el InOrden
     {
      
       if(nodo!=null)
       {
           RecorreInOrden(nodo.hIzq);
           System.out.println("["+nodo.toString()+']');
           RecorreInOrden(nodo.hDer);           
       }
    
     }
   
   public void RecorrePreOrden(Nodo nodo)
           //metodo recursivo para el PreOrden
     {
       
       if(nodo!=null)
       {
            System.out.println("["+nodo.toString()+']');
            
            RecorrePreOrden(nodo.hIzq);
            RecorrePreOrden(nodo.hDer);
       }
       
     }
    
   
     public void RecorrePostOrden(Nodo nodo)
             //metodo recursivo para el PostOrden
     {
       
       if(nodo!=null)
       {
            RecorrePostOrden(nodo.hIzq);
            RecorrePostOrden(nodo.hDer);
            System.out.println("["+nodo.toString()+']');
       }
       
     }
          
     public void ObtieneDibujo()
             //en este metodo se crea un contendor y se llama al dibujo del arbol binario
       {
           JFrame marco = new JFrame("Arbol Binario");
           DibujoArbol dibArbol = new DibujoArbol(this);
           marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           marco.add(dibArbol);
           marco.setSize(400, 400);
           marco.setVisible(true);
           
       }
 
  }
