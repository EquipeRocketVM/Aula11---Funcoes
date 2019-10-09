/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitoria.csilva15
 */
public class maiorNum {
    
    /*
    Crie uma função com dois parâmetros numéricos capaz de
    verificar qual número é o maior e retorná-lo
    */
    
    static int maior(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        int c = maior(x, y);
        System.out.println("O maior número é: " + c);
    }
}
