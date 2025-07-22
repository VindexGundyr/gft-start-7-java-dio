import java.util.Scanner;
public class operadores {

    public static void main(String[] args) {
        var value = 50;
        System.out.println(++value);// operador de incremento funciona como --value também
        System.out.println(value);



        //var value = (5 + 9) * (10 - 5) / 2; // Esquerda pra direita, caso não tenha operadores com prioridade.
        // 14 * 5 / 2        value = value + 12  ou value += 12 é a mesma coisa
        // 70 / 2 = 35 // Com prioridade
        // 5 + 90 - 2;
        //95 - 2
        //93 // Sem prioridade
        //System.out.println(value);
//        var scanner = new Scanner(System.in);
//        System.out.println("Informe o primeiro número:");
//        var value1 = scanner.nextInt();
//        System.out.printf(" a raiz quadrada de %s é %s\n", value1, Math.pow(value1, 2));
//        System.out.println("Informe o primeiro número:");
//        var value1 = scanner.nextInt();
//        System.out.println("Informe o segundo número:");
//        var value2 = scanner.nextInt();
//        System.out.println(value1 + " + " + value2 + " = " + value1 + value2);
        //System.out.printf("%s + %s = %s\n", value1, value2, value1+value2);
    }


}
