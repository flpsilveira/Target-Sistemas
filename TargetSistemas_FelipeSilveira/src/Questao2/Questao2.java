/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */


   
public class Questao2 {
    
 static String aparece = "";
   
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int n1 = 0, n2 = 1, qtd = 0;
       
       
        System.out.println("Digite a quantidade de termos");
        qtd = ler.nextInt();
        
        for (int i = 0 ; i < qtd ; i++) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;              
       
            if(qtd == n1){
                aparece = "\nO número informado apareceu";
            }      
}
          System.out.println(aparece);
}
}

