import java.util.Scanner;

public class exerciciosOperadores {
    public static void main(String[] args){
        // Exercicio 1
          var scanner = new Scanner(System.in);
//        System.out.println("Qual o seu nome?");
//        var name =  scanner.next();
//        System.out.println("Em que ano você nasceu?");
//        var yearBorn = scanner.nextInt();
//        var age = 2025 - yearBorn;
//        System.out.printf("Olá %s você tem %s anos \n", name, age);
        //Exercicio 2
//        System.out.println("Forneça o tamanho do lado:");
//        var sideSize = scanner.nextInt();
//        var area = sideSize * sideSize;
//        System.out.printf("A area do quadrado é %s", area);
        //Exercicio 3
//        System.out.println("Forneça o tamanho da base:");
//        var baseSize = scanner.nextInt();
//        System.out.println("Forneça a altura:");
//        var height = scanner.nextInt();
//        var area = baseSize * height;
//        System.out.printf("A área do quadrado é %s", area);
        // Exercicio 4
        System.out.println("Qual o nome da primeira pessoa?");
        var name1 =  scanner.next();
        System.out.println("Idade da primeira pessoa: ");
        var age1 = scanner.nextInt();
        System.out.println("Qual o nome da segunda pessoa?");
        var name2 =  scanner.next();
        System.out.println("Idade da segunda pessoa: ");
        var age2 = scanner.nextInt();
        var ageDifference = age1 - age2;
        System.out.printf("A diferença de idade entre %s e %s é de %s", name1, name2, ageDifference);

    }
}
