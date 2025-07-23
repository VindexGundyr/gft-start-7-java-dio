package Exercicios;
import java.util.Scanner;
public class exerciciosEstruturasDeControle {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        //Exercicio 1
//        System.out.println("Informe um número:");
//        var number = scanner.nextInt();
//        for(var i = 0; i <=10; i++){
//            var result = i * number;
//            System.out.printf("%s x %s = %s \n", number, i, result);
//        }

        //Exercicio 2
//        System.out.println("Informe seu peso: ");
//        var weight = scanner.nextFloat();
//        System.out.println("Informe sua altura: ");
//        var height = scanner.nextFloat();
//        var imc = weight / (height * height);
//        if (imc < 18.6) {
//            System.out.println("Abaixo do peso");
//        } else if (imc < 25.0) {
//            System.out.println("Peso ideal");
//        } else if (imc < 30.0) {
//            System.out.println("Levemente acima do peso");
//        } else if (imc < 35.0) {
//            System.out.println("Obesidade Grau I");
//        } else if (imc < 40.0) {
//            System.out.println("Obesidade Grau II (Severa)");
//        } else {
//            System.out.println("Obesidade Grau III (Mórbida)");
//        }
        //Exercicio 3
        System.out.println("Informe o primeiro número:");
        var firstNumber = scanner.nextInt();
        int secondNumber;
        do {
            System.out.println("Informe o segundo número (maior que o primeiro):");
            secondNumber = scanner.nextInt();
            if (secondNumber <= firstNumber) {
                System.out.println("Por favor, insira um número maior que o primeiro.");
            }
        } while (secondNumber <= firstNumber);
        System.out.println("Escolha entre par ou ímpar: ");
        var choice = scanner.next();
        System.out.printf("Os números %s em ordem decrescente são: \n", choice);
        var i = secondNumber;
        while (i >= firstNumber) {
            if (choice.equals("par") && i % 2 == 0) {
                System.out.println(i);
            }
            if (choice.equals("ímpar") && i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }
        // Exercicio 4 - Resposta do Professor
//        System.out.println("Informe um número");
//        var number = scanner.nextInt();
//        var keepVerify = true;
//        while(keepVerify){
//            System.out.println("Informe o número para verificação");
//            var toVerify = scanner.nextInt();
//            if(toVerify < number) {
//                System.out.printf("Informe um número maior que %s \n", number);
//                continue;
//            }
//
//            var result = toVerify % number;
//            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
//            if (result !=0) break;
//        }
    }
}
