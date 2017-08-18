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
public class Arbol
        
  {
    Nodo raiz;
    
    public Arbol()
      {
        this.raiz= null;
      }
   public void InsertarNodo(Object obj)
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
                               
                               if(str1.length()<str2.length())
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
    
  }
