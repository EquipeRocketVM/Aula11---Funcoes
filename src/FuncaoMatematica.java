/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitoria.csilva15
 */
public class FuncaoMatematica {

    /*
    Crie uma função capaz de calcular o resultado para a função
matemática abaixo (a função deve receber “x” e retornar a resposta):

     */
    static int funcao(int x, int resultado) {

        if (x < -1) {
            return (x + 2);

        } else if ((x <= -1) && (x <= 2)) {
            return (x + x) - 4;
        } else if (x > 2) {
            return (2 * x) - 1;

        }

        return x;
    }

    public static void main(String[] args) {

        int resultado = 10;
        int classe = funcao(resultado, resultado);
        System.out.println("O resultado é: " + classe);
    }
}
