/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg2.exercicios;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Lista2Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1, val2;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o 1 Valor:");
        val1 = s.nextInt();
        System.out.println("Informe o 2 Valor");
        val2 = s.nextInt();

        for (int i = val1 + 1; i < val2; i++) {
            System.out.println(i);
        }

    }

}
