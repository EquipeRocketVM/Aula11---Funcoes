
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vitoria.csilva15
 */
public class FuncaoImprimirNota {

    // não deu certo 
    
    /*
    Modifique a função imprimirNota do exemplo anterior para
    retornar uma String. Se aluno aprovado, retorna "Aprovado".
    Caso contrário, retorna "Reprovado".
    Perceba que você que terá que modificar a função main.
     */
    
    Scanner sc = new Scanner(System.in);

    static String imprimirNota(String nota) {
    
        if (nota == "Aprovado") {
            return nota;

        } else {
            System.out.println("Reprovado");
            
        }

        return nota;
    }

    public static void main(String[] args) {
        String nota = "Reprovado";
        String c = imprimirNota(imprimirNota(nota));
        System.out.println("Você foi: " + c);
    }

}
