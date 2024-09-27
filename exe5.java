/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.pkg2.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exe5 {
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  Random aleatorio = new Random();
  
  int palpiteuser;
  int escolhido = aleatorio.nextInt(100)+1;
   
   do{
       
     System.out.println("Informe um numero!");
     palpiteuser= s.nextInt();  
     
    if(escolhido > palpiteuser){
        System.out.println("O numero digitado e maior!!");
    }else if(escolhido < palpiteuser){
        System.out.println("O numero e Menor!!");
        
    }else{
        System.out.println("Acerto Miseravi!");
    }
   
   }while(palpiteuser != escolhido);
       
     
   }
     
     
     
 }

