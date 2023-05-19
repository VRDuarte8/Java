/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, cont=0, p=0, i=0, ac=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            
            if (n==0){
                continue;
            }
            
            cont++;
            if (n%2 == 0){
                p++;
            } else i++;
            
            if (n>100){
                ac++;
            }
            
        } while (n != 0);
        float media = s/cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + 
                "<br>Total de Valores: " + cont + 
                "<br>Total de Pares: " + p +
                "<br>Total de Ímpares: " + i +
                "<br>Acima de 100: " + ac +
                "<br>Média dos valores: " + media + "</html>");
    }
    
}
