package Desafios;

import java.util.Scanner;
public class desafioFrete {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // TODO: Leia o peso em quilos:
            System.out.println("Forneça o peso(kg):");
            var peso = scanner.nextDouble();

            // TODO: Leia o valor do frete por quilo:
            System.out.println("Forneça o valor do frete por quilo:");
            var frete = scanner.nextDouble();

            // TODO: Calcule o valor total do frete:
            var valorTotal = peso * frete;

            // TODO: Exiba o valor formatado com duas casas decimais:
            System.out.printf("%.2f", valorTotal);

            scanner.close();
        }

}
