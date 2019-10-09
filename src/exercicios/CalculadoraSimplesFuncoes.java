/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author leonildo.cjunior
 * EXEMPLO PROFESSOR PASSADO EM AULA
 */
public class CalculadoraSimplesFuncoes {
    static Scanner input = new Scanner(System.in);
    
    static int menu(){
        int op;
        System.out.println("Menu()");
        System.out.println("1-AdiÃ§Ã£o");
        System.out.println("2-SubtraÃ§Ã£o");
        System.out.println("3-MultiplicaÃ§Ã£o");
        System.out.println("4-DivisÃ£o");
        System.out.println("OpÃ§Ã£o: ");
        op = input.nextInt();
        return op;
    }
    
    static double entradaDados(){
        double n;
        System.out.println("entradaDados()");
        System.out.println("NÃºmero: ");
        n = input.nextDouble();
        return n;        
    }
    
    static double adicao(double n1, double n2){
        double resultado;
        System.out.println("adicao()");
        resultado = n1 + n2;
        return resultado;
    }
    
    static double controlador(double n1, double n2, int op){        
        double r;
        System.out.println("controlador()");
        switch(op){
            case 1:
                r = adicao(n1, n2);
                break;
            case 2:
                //implementar
            case 3:
                //implementar
            case 4:
                //implementar
            default:
                r=0;          
        }
        return r;
    }
    
    static void imprime(double r){
            System.out.println("imprimir()");
            System.out.println("Resultado: "+r);
            
        }
    
    public static void main(String[] args) {
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double r = controlador(n1, n2, op);
        imprime(r);
    }
    
}