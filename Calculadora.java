import java.util.Scanner;

public class Calculadora {

    static void meuMetodo() {
        System.out.println("\n=== Métodos da Calculadora ===");
    }

    static void mostrarMetodo(String metodo) {
        System.out.println(metodo);
    }

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return numero1 / numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Iniciada ===");

        while (true) {
            meuMetodo();

            mostrarMetodo("1 - Somar");
            mostrarMetodo("2 - Dividir");
            mostrarMetodo("3 - Multiplicar");
            mostrarMetodo("4 - Subtrair");

            System.out.print("\nEscolha um método (1 a 4): ");
            int escolha = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            switch (escolha) {
                case 1:
                    resultado = somar(num1, num2);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    resultado = subtrair(num1, num2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                    
            }

            System.out.print("\nDeseja fazer outro cálculo? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Encerrando a calculadora. Até logo!");
                break;
            }
        }

    }
}
