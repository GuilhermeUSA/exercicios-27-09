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
public class exe4 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int num;
  int soma = 0;
   
  do{
      System.out.println("Informe um valor de 1 a 100!:");
      num = s.nextInt();
      
    if(num < 0 || num > 100){
        
        System.out.println("Numero passou de 100!");
    }else if (num%2==0 && num!=0){
        soma += num;
    }
    
    
      System.out.println("A soma é: " + soma);
   
  }while(num!=0);
          
  }
      
  }
  
      
  
  

