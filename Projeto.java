package bubas.maratonajava.introducao;

import java.util.Scanner;

public class Projeto {

    public static double soma(double a, double b){
        double res = a + b;

        return (res);
    }

    public static double sub(double a, double b){
        double res = a - b;

        return (res);
    }

    public static double multi(double a, double b){
        double res = a * b;

        return (res);
    }

    public static double div(double a, double b){
        double res = a / b;

        return (res);
    }

    public static double porcent(double a, double b){
        double res = ((b / 100) * a);
        
        return (res);

    }

    public static double poten(double a, double b){
        double res = Math.pow(a, b);

        return(res);
    }

    public static double radic(double a){
        double res = Math.sqrt(a);

        return(res);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int check = -1;

        double numA;
        double numB;
        double resultado;

        System.out.println("\n\n\tBEM VINDO A CALCULADORA\n\n");

        while(check != 0){
            System.out.println("Digite a operação desejada:\n");

            System.out.println("(1) para soma / (2) para subtração / (3) para multiplicação / (4) para divisão / (5) para porcentagem / (6) para potenciação / (7) para radiciação / (0) para encerrar.\n");

            check = scanner.nextInt();

            switch(check){

                case 0:
                break;

                case 1:
                System.out.println("digite o primeiro numero: ");
                numA = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numB = scanner.nextDouble();
                resultado = soma(numA, numB);

                System.out.println("O resultado da soma é: " + resultado +"\n");

                break;

                case 2:
                System.out.println("digite o primeiro numero: ");
                numA = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numB = scanner.nextDouble();

                resultado = sub(numA, numB);

                System.out.println("O resultado da subtração é: "+resultado+"\n");

                break;

                case 3:
                System.out.println("digite o primeiro numero: ");
                numA = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numB = scanner.nextDouble();

                resultado = multi(numA, numB);

                System.out.println("O resultado da multiplicação é: "+resultado+"\n");
                break;

                case 4:
                System.out.println("digite o numerador: ");
                numA = scanner.nextDouble();
                System.out.println("Digite o denominador: ");
                numB = scanner.nextDouble();

                resultado = div(numA, numB);

                System.out.println("O resultado da divisão é:"+resultado+"\n");
                break;

                case 5:
                System.out.println("digite a porcentagem: ");
                numA = scanner.nextDouble();
                System.out.println("Digite o numero: ");
                numB = scanner.nextDouble();

                resultado = porcent(numA, numB);

                System.out.println("O resultado é: "+resultado+"\n");
                break;

                case 6:
                System.out.println("digite o numero: ");
                numA = scanner.nextDouble();
                System.out.println("Digite a potência: ");
                numB = scanner.nextDouble();

                resultado = poten(numA, numB);

                System.out.println("O resultado da potenciação é: "+resultado+"\n");
                break;

                case 7:
                System.out.println("digite o numero a ser calculado: ");
                numA = scanner.nextDouble();
                

                resultado = radic(numA);

                System.out.println("O resultado é: "+ resultado +"\n");
                break;

                default:
                System.out.println("Entrada inválida.\n");

            }

        }

        scanner.close();
    }

}
