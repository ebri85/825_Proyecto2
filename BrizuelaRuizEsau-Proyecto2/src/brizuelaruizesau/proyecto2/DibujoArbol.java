/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brizuelaruizesau.proyecto2;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author esau_br
 */
public class DibujoArbol extends JPanel
  {
    
    private Arbol arbDib;
    private HashMap posNodos= null;
    private HashMap subArbTam = null;
    private boolean dirty = true;
    private int padresAhijos = 20, hijoAhijo = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;
    
    public DibujoArbol(Arbol arbDib)
      {
        this.arbDib = arbDib;
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.BLUE);
        posNodos = new HashMap();
        subArbTam = new HashMap();
        dirty = true;
        repaint();
      }
    
    private void Posicion()
      {
        posNodos.clear();
        subArbTam.clear();
        Nodo raiz = this.arbDib.raiz;
        
        if(raiz!=null)
        {
            TamSubArbol(raiz);
            CalcPosicion(raiz,Integer.MAX_VALUE,Integer.MAX_VALUE,0);
            
        }
        
      }
    
    private Dimension TamSubArbol(Nodo nodo)
      {
        if(nodo==null)
        
            return new Dimension(0,0);
         Dimension ladoDer = TamSubArbol(nodo.hDer);
         Dimension ladoIzq = TamSubArbol(nodo.hIzq);
         
         int altura = fm.getHeight() + padresAhijos + Math.max(ladoIzq.height,ladoDer.height);
         int ancho = ladoIzq.width + hijoAhijo+ ladoDer.width;
         
         Dimension d = new Dimension(ancho,altura);
         subArbTam.put(nodo,d);
         
         return d;         
        
      }
    
    private void CalcPosicion(Nodo nodo, int izq, int der, int top)
      {
        if(nodo==null)
            return;
        
        Dimension ladoIzq = (Dimension) subArbTam.get(nodo.hIzq);
        if (ladoIzq == null)
            ladoIzq = empty;
        
        Dimension ladoDer = (Dimension) subArbTam.get(nodo.hDer);
        if(ladoDer == null)
            ladoDer = empty;
        
        int centro = 0;
        
        if(der != Integer.MAX_VALUE )
            centro = der - ladoDer.width - hijoAhijo/2;
        else if(izq != Integer.MAX_VALUE)
            centro = izq + ladoIzq.width + hijoAhijo/2;
        
        int ancho = fm.stringWidth(nodo.toString());
        
        posNodos.put(nodo, new Rectangle(centro - ancho/2 - 3,top,ancho+6,fm.getHeight()));
        
          CalcPosicion(nodo.hIzq,Integer.MAX_VALUE,centro- hijoAhijo/2,top+fm.getHeight()+padresAhijos);
          CalcPosicion(nodo.hDer, centro + hijoAhijo/2, Integer.MAX_VALUE, top+fm.getHeight()+padresAhijos);
          
      }
    
    private void dibujarArbol(Graphics2D g,Nodo nodo, int puntoX,int puntoY, int yoffs)
      {
        if(nodo==null)
            return;
        Rectangle r = (Rectangle) posNodos.get(nodo);
        g.draw(r);
        g.drawString(nodo.toString()+"",r.x+3,r.y+yoffs);
            
        if(puntoX != Integer.MAX_VALUE)
            
        g.drawLine(puntoX,puntoY,(int)(r.x+r.width/2),r.y);
          dibujarArbol(g, nodo.hIzq, (int)(r.x+r.width/2),r.y+r.height,yoffs);
          dibujarArbol(g, nodo.hDer, (int)(r.x+r.width/2),r.y+r.height,yoffs);

      }
    
    @Override
    public void paint(Graphics g)
      {
        super.paint(g);
   
        
        fm = g.getFontMetrics();
        
        if(dirty)
        {
            Posicion();
            dirty = false;
        }
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(getWidth()/2,padresAhijos);
        
          dibujarArbol(g2d,this.arbDib.raiz,Integer.MAX_VALUE, Integer.MAX_VALUE, fm.getLeading()+fm.getAscent());
        fm =null;
      }

    
  }
