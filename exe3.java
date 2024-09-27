/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.pkg2.exercicios;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exe3 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in); 
  int val1,val2;
      System.out.println("Informe valor 1:");
      val1= s.nextInt();
      System.out.println("Informe valor 2:");
      val2=s.nextInt();
      
    if(val1<val2){
    for(int i = val1 + 1; i < val2; i++){
        System.out.println(i);  
    }
    }else{
     for(int i = val1 -1;  i < val2; i--){
         System.out.println(i);
     }        
     
           
   }
        
        
       
  } 
}
