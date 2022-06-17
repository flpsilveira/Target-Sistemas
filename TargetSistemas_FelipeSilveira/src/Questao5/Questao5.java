/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;
import java.util.Scanner;
/**
 *
 * @author Felipe
 */
public class Questao5 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra, invertida;
        
        System.out.println("Informe a palavra desejada: ");
        palavra = ler.next();
        invertida = "";
     
        for(int i = palavra.length() -1; i >= 0; i --){
            invertida = invertida + Character.toString(palavra.charAt(i));
        }
        System.out.println(invertida);
    }
    
}
