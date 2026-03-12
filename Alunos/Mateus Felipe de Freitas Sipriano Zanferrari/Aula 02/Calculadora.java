
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;

        
        System.out.println("MENU LOJA");
        System.out.println("1- Calcular Preço");
        System.out.println("2- Calcular troco");
        System.out.println("3- Sair");

        escolha = scan.nextInt();

        do{
        switch (escolha) {
            case 1: 
            System.out.println("Digite a quantidade de itens:");
            double a = scan.nextDouble();
            System.out.println("Digite o valor do iten:");
            double b = scan.nextDouble();
            double precototal = calculopreco(a, b);
            System.out.println("Preco total R$" + precototal);
                break;

            case 2: 
            System.out.println("Digite o valor recebido:");
            double c = scan.nextDouble();
            System.out.println("Digite o valor total da compra:");
            double d = scan.nextDouble();
            double troco = calculotroco(c, d);
            System.out.println("Troco da Compra R$"" + troco);
            calculotroco();
                break;

            case 3: 

                break;
        }
        while (escolha !=3);
    }
}

public static double calculopreco (double  a, double b){
    return a*b;
}

public static double calculotroco (double c, double d){
    return c-d;
}
