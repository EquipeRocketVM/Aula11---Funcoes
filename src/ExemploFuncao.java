/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitoria.csilva15
 */
public class ExemploFuncao {

    static int minimo(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) {
        int x = 11;
        int y = 6;
        int c = minimo(x, y);
        System.out.println("Minimo: " + c);
    }
}
