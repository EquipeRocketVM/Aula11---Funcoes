/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitoria.csilva15
 */
public class Exemplo2Funcao {

    static void imprimirNota(double nota) {
        if (nota >= 6) {
            System.out.println("Aprovado");
        
        
       }else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        imprimirNota(6.7);
    }

}
