package Desafios;
import java.util.Scanner;

public class CarroMonitoramento {
    public static String verificarAptidaoCarro(String modelo, int anoFabricacao, int anoAtual) {
        int idadeCarro = anoAtual - anoFabricacao;

        if (idadeCarro <= 10) {
            return modelo + ": Apto";
        } else {
            return modelo + ": Nao apto";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String modelo = scanner.nextLine();
        int anoFabricacao = scanner.nextInt();
        int anoAtual = scanner.nextInt();

        String resultado = CarroMonitoramento.verificarAptidaoCarro(modelo, anoFabricacao, anoAtual);
        System.out.println(resultado);

        scanner.close();
    }
}