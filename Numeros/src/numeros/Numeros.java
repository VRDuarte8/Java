/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        Scanner t = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite um número: ");
            n = t.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = t.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
