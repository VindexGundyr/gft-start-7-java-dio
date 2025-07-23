import java.util.Scanner;

public class estruturasDeControle {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        // WHILE
        var i = 0;
        while (args.length > i) {
            System.out.println(args[i]);
            i++;
        }
        i = 0;
        System.out.println("===================");

        do {
            System.out.println(args[i]);
            i++;
        }while (args.length > i);

        // FOR
//        for (var i = 0;i < args.length;i++){
//            System.out.println((i+1) + " - " + args[i]);
//        }
        //SWITCH
//        System.out.println("Informe um número de 1 até 7");
//        var option = scanner.nextInt();
//        var message = switch(option){
//            case 1, 7 -> {
//                var day = option == 1 ? "Domingo" : "Sábado";
//                yield String.format("Hoje é %s, fim de semana", day);
//            }
//            case 2 -> "Segunda";
//            case 3 -> "Terça";
//            case 4 -> "Quarta";
//            case 5 -> "Quinta";
//            case 6 -> "Sexta";
//            default ->"Opção inválida";
//        };
//        System.out.println(message);
        // IF ELSE
//        System.out.println("Informe o seu nome?");
//        var name = scanner.next();
//        System.out.println("Informe sua idade:");
//        var age = scanner.nextInt();
//        System.out.println("Você é emancipado? (s/n)");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s");
//        var canDrive = (age >=18) || (age >=16 && isEmancipated);
//        var message = canDrive ?
//                name + ", você pode dirigir \n" :
//                name + ", você não pode dirigir \n";

//        if ((age >= 18) || (age >= 16 && isEmancipated)) {
//            System.out.printf("Bem vindo %s \n", name);
//            System.out.printf("%s, você pode dirigir \n",  name);
//        } else {
//            System.out.printf("%s, você não pode dirigir \n", name);
//        }
//        System.out.println(message);
//        System.out.println("Fim da execução");
    }

}
