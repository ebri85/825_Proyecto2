/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.proyecto2;

import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlElement;

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
        int cantidad =0, cont =1;
        String elemento;
        String nombre;
        Arbol arbol = new Arbol();
        
        
        do 
          {
            try 
              {
               opcion = Integer.parseInt( JOptionPane.showInputDialog(null,
                       "1. Digite la Cantidad de Nodos que va a Tener el Arbol\n"
                        + "2. Agrege los Objetos al Nodo\n"
                        +  "3. Muestra el Arbol con sus Elementos"
               
                        + "0. Salir\n"
                        + "Elige una Opcion...", "Arboles Binarios",JOptionPane.QUESTION_MESSAGE));
               
               switch(opcion)
                 {
                   case 1:
                      cantidad = Integer.parseInt(JOptionPane.showInputDialog(null," Cuantos Nodos desea que tenga el siguiente Arbol?","Solicitude de Tamaño del Arbol"
                                                                                            ,JOptionPane.QUESTION_MESSAGE));
                       break;
                       
                   case 2: 
                            do{
                             elemento = JOptionPane.showInputDialog(null, "Ingrese El Objecto que desee al Arbol", "Agregando el nodo",JOptionPane.QUESTION_MESSAGE);
                       
                            arbol.InsertarNodo((Object)elemento);
                            cont++;
                           
                           }while(cont!=cantidad);
                    
                   break;
                   
                   case 3:
                       
                       break;
                              
                               
                   case 4:
                             
                       break;
                       
                   case 0:
                                
                                System.exit(0);
                                
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
{
    int op=0;
    String menu="";

        menu = "Menu de Manejo de Arbol Binario";
       
        menu+= "1 - Indique la Cantidad de Nodos que va a Manejar el Arbol\n";
        menu+= "2 - Agregue los Objetos del Arbol\n";
        menu+= "3 - Muestre los Recorridos y Arbol Original\n";
        menu+= "4 - Grafico del Arbol\n";
        menu+= "0 - SALIR\n\n";

     JOptionPane.showInputDialog(null,menu);
    return op;
}
    
    
    
    
}



