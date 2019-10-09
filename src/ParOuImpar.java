/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitoria.csilva15
 */
public class ParOuImpar {
    /*
    Crie uma função com parâmetro capaz de verificar se um
    número é par ou ímpar

    */
    static int parOuImpar(int num){
    
        if(num %2 == 0){
            System.out.println("Esse número é par");
        }else {
        
            System.out.println("Esse número é impar");
        }
        
    return num;
    }
    public static void main(String[] args) {
        
        int num = 3;
        int resultado = parOuImpar(num);
        System.out.println("o número: " + resultado);
    }
}
