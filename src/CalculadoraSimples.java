
import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class CalculadoraSimples {

    static Scanner sc = new Scanner(System.in);

    static void cabecalho() {

        System.out.println("//// Calculadora Simples ////");
    }

    static double entradaDados() {

        System.out.println("Número: ");
        double n = sc.nextDouble();
        return n;
    }

    static int menu() {

        int op;
        System.out.println("///Menu///");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.println("Opção escolhida: ");

        op = sc.nextInt();

        return op;
    }

    static double somar(double n1, double n2) {

        System.out.println("Adição");
        double r = n1 + n2;
        return r;

    }

    static double sub(double n1, double n2) {
        System.out.println("Subtração");
        double r = n1 - n2;
        return r;
    }

    static double mult(double n1, double n2) {
        System.out.println("Multiplicação");
        double r = n1 * n2;
        return r;

    }

    static double div(double n1, double n2) {
        System.out.println("Divisão");
        double r = n1 / n2;
        return r;
    }

    static void imprimir(double r) {

        System.out.println("Imprimir");
        System.out.println("Resultado: " + r);

    }

    static double controller(double n1, double n2, int op) {
        double r = 0;
        switch (op) {
            case 1:
                r = somar(n1, n2);
                break;
            case 2:
                r = sub(n1, n2);
                break;
            case 3:
                r = mult(n1, n2);
                break;

            case 4:
                r = div(n1, n2);
                break;

        }
        return r;
    }

    public static void main(String[] args) {
        cabecalho();
        int op = menu();

        double n1 = entradaDados();
        double n2 = entradaDados();
        
        double r = controller(n1, n2, op);
        imprimir(r);

    }
}
