package Exercicios.contaBancaria;
import java.util.Scanner;

public class mainBanco {
    private final static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args){
        scanner.useDelimiter("\\n");
        System.out.println("Bem-vindo(a)");
        System.out.println("Digite o saldo inicial da sua conta: R$");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria minhaConta = new ContaBancaria(saldoInicial);
        var option = -1;
            do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch(option){
                case 1 -> {
                    System.out.println("Saldo atual da conta: R$" + minhaConta.getSaldo());
                }
                case 2 -> {
                    System.out.println("Seu limite de cheque especial é: R$" + minhaConta.getLimiteChequeEspecial());
                }
                case 3 -> {
                    System.out.print("Informe o valor a depositar: R$");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                }
                case 4 -> {
                    System.out.print("Informe o valor a sacar: R$");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                }
                case 5 -> {
                    System.out.print("Informe o valor do boleto a pagar: R$");
                    double valorBoleto = scanner.nextDouble();
                    minhaConta.pagarBoleto(valorBoleto);
                }
                case 6 -> {
                    if (minhaConta.isUsandoChequeEspecial()) {
                        System.out.println("Sim, a conta está usando o cheque especial. Débito atual: R$" + minhaConta.getValorUsadoChequeEspecial());
                    } else {
                        System.out.println("Não, a conta não está usando o cheque especial.");
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }while (true);

}
}
