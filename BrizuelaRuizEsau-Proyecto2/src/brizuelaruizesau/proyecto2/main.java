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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int opcion=0;
        int cantidad =0, cont =0;
        String elemento;
        String nombre;
        Arbol arbol = new Arbol();
        
        
        do 
          {
            try 
              {
               opcion = menu();
               System.out.flush();
               
               
               switch(opcion)
                 {
                   case 1:
                       //case para indicar la cantidad de nodos que va a tener el Arbol Binario
                      cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos Nodos desea que tenga el siguiente Arbol?","Solicitude de Tamaño del Arbol"
                                                                             ,JOptionPane.DEFAULT_OPTION));
                       break;
                       
                   case 2: 
                       //Case para el ingreso de los objectos al Arbol
                       try
                       {
                         do{
                            elemento = JOptionPane.showInputDialog(null, "Ingrese El Objecto que desee al Arbol", "Agregando el nodo",JOptionPane.QUESTION_MESSAGE);
                       
                            arbol.InsertarNodo((Object)elemento);
                            cont++;
                           
                           }while(cont!=cantidad);
                         arbol.ObtieneDibujo();
                    
                       }catch(Exception e)
                       {
                           JOptionPane.showMessageDialog(null,"Error " + e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                       }
                      
                   break;
                   
                   case 3:
                       //Mostrar los datos del árbol en recorrido PreOrden.
                       if(!arbol.vacio())
                       {
                         System.out.println("Recorrido PostOrden");  
                         arbol.RecorrePreOrden(arbol.raiz); 
                         System.out.flush();
                           
                       } else 
                       {
                           JOptionPane.showMessageDialog(null,"El Arbol se encuentra Vacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
                       }                
                       
                       break;
                              
                               
                   case 4:
                       
                       //Mostrar los datos del árbol en recorrido InOrden.
                        if(!arbol.vacio())
                       {
                           System.out.println("Recorrido InOrden");
                            arbol.RecorreInOrden(arbol.raiz);
                            System.out.flush();
                           
                           
                       } else 
                       {
                           JOptionPane.showMessageDialog(null,"El Arbol se encuentra Vacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
                       }    
                     
                      
                       break;
                       
                   case 5:
                       
                       //Mostrar los datos del árbol en recorrido PostOrden.
                       if(!arbol.vacio())
                       {
                           System.out.println("Recorrido PostOrden");
                            arbol.RecorrePostOrden(arbol.raiz);
                            System.out.flush();
                           
                           
                       } else 
                       {
                           JOptionPane.showMessageDialog(null,"El Arbol se encuentra Vacio","ERROR",JOptionPane.INFORMATION_MESSAGE);
                       }       
                       
                       break;
  
                   default:
                       
                       
                       
                       System.exit(0);
                       
                       
                 }
              } catch (NumberFormatException n)
                {
                  JOptionPane.showMessageDialog(null,"Error" + n.getMessage() );
                }
            
                        
          } while(opcion!=0);
        
        
        
    }
    
    public static int menu()
            //metodo que imprime el menu
{
    int op;
    String menu;

        menu = "Menu de Manejo de Arbol Binario\n";
       
        menu+= "1 - Indique la Cantidad de Nodos que va a Manejar el Arbol\n";
        menu+= "2 - Agregue los Objetos del Arbol\n";
        menu+= "3 - Mostrar los datos del árbol en recorrido PreOrden\n";
        menu+= "4 - Mostrar los datos del árbol en recorrido InOrden\n";
        menu+= "5 - Mostrar los datos del árbol en recorrido PostOrden\n"; 
        menu+= "0 - SALIR\n\n";

    op =  Integer.parseInt(JOptionPane.showInputDialog(null,menu));
    return op;
}
    
       
}



