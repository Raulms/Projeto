/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Raul
 */
public class GeradorDeEvento extends Evento{
    private Random g = new Random();
    
    public int lancar(int x) {
        return g.nextInt(x);
    }
    
    public void data(GeradorDeEvento e) {
        e.mes = g.nextInt(12)+1;
        if(e.mes!=2)
         e.dia = g.nextInt(31)+1;
        else e.dia = g.nextInt(31)+1;
        e.ano = g.nextInt(3)+2013;
    }
    
    private String Tit[];
    
   public static void main(String[] args) {
      GeradorDeEvento ev = new GeradorDeEvento();
      GeradorDeEvento ep = new GeradorDeEvento();
      GeradorDeEvento ev2 = new GeradorDeEvento();
      Pesquisa p = new Pesquisa();
      ev.dia = ev.lancar(30);
      ev.data(ev);
      System.out.println(ev.dia+"/"+ev.mes+"/"+ev.ano);
      System.out.println(ev.Nome1[ev.lancar(6)]+ev.Nome2[ev.lancar(2)]+ev.Nome3[ev.lancar(2)]+ev.Nome4[ev.lancar(2)]+ev.Nome5[ev.lancar(3)]);
}
}
