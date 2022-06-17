/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author Felipe
 */
public class Questao4 {
    
    public static void main(String[] args) {
        float sp, rj, mg, es, outros, total, pSp, pRj, pMg, pEs, pOt;
        sp = (float) 67836.43;
        rj = (float)36678.66;
        mg = (float)29229.88;
        es = (float)27168.48;
        outros = (float)19849.53;
        
        total = sp + rj + mg + es + outros;
        
        pSp = (sp * 100)/total;
        pRj = (rj * 100)/total;
        pMg = (mg * 100)/total;
        pEs = (es * 100)/total;
        pOt = (outros * 100)/total;
       
        
        System.out.println("Porcentagem SP " + pSp + "%" );
        System.out.println("Porcentagem RJ " + pRj + "%" );
        System.out.println("Porcentagem MG " + pMg + "%" );
        System.out.println("Porcentagem ES " + pEs + "%" );
        System.out.println("Porcentagem Outros Estados " + pOt + "%" );
    
    }
    
}
