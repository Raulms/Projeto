/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;
import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public abstract class Evento{
   public int dia;
   public int mes;
   public int ano;
   public String Titulo;
   
    public static String[] Nome1 ={
     "I ",
     "II ",
     "IV ",
     "V ",
     "VI ",
     "VII "
   };
   
   public static String[] Nome2 = {
    "Simposio",
    "Congresso"
   };
   
   public static String[] Nome3 ={
     " Internacional",
     " "     
   };
   
   public static String[] Nome4 ={
     " de Iniciação Científica",
     " de Pesquisa"     
   };
   
   public static String[] Nome5 ={
     " da UNESP",
     " da USP",
     " da UNICAMP"
   };
   public int ins_dia;
   public int ins_mes;
   public int ins_ano;
}

