package Desafios;

import java.util.Scanner;
import java.text.DecimalFormat;
public class desafioDesconto {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // TODO: Leia o valor original do produto:
            System.out.println("Forneça o valor do produto:");
            var valorOriginal = scanner.nextDouble();

            // TODO: Leia a porcentagem de desconto:
            System.out.println("Forneça a porcentagem de desconto do produto:");
            var porcentagemDesconto =  scanner.nextDouble();

            // TODO: Verifique se o desconto está dentro de um intervalo válido:
            if(porcentagemDesconto < 0 || porcentagemDesconto > 100){
                System.out.println("Desconto invalido");
            }else {
                // TODO: Calcule o valor final do produto:
                double valorFinal = valorOriginal - (valorOriginal * (porcentagemDesconto / 100.0));

                // Formata e exibe o valor com duas casas decimais
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println(df.format(valorFinal));
            }

            scanner.close();
        }
    }

