/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando07testedeselecao1.pkg1035;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando07TesteDeSelecao11035 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        
        if (B > C && D > A) {
            if (C+D > A+B) {
                if (C > 0 && D > 0) {
                    if (A % 2 == 0) {
                        System.out.println("Valores aceitos");
                    }
                }
            }            
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
    
}
