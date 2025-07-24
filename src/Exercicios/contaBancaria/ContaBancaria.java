package Exercicios.contaBancaria;

public class ContaBancaria {
    private double saldo;
    private final double limiteChequeEspecial;
    private boolean usandoChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        if(saldo <= 500.00){
            this.limiteChequeEspecial = 50.00;
        }else {
            this.limiteChequeEspecial = saldo * 0.50;
        }

        this.usandoChequeEspecial = false;
        //cheque especial regra - valor depositado na criação da conta
        // for de R$500,00 ou menos o cheque especial deve ser de R$50,00
        //Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
        //Caso o limite de cheque especial seja usado,
        // assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
    }
    public double getSaldo() {
        return saldo; // Consultar o saldo
    }
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    //Depositar dinheiro na conta
    public void depositar(double valor) {
        // Deposito foi a maior dificuldade do exercicio, revisar mais tarde.
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return;
        }

        boolean estavaUsandoChequeEspecialAntes = this.usandoChequeEspecial;
        double valorUsadoChequeEspecialAntes = this.valorUsadoChequeEspecial;

        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);

        if (estavaUsandoChequeEspecialAntes && this.saldo >= 0) {
            double taxa = valorUsadoChequeEspecialAntes * 0.20;
            this.saldo -= taxa;

            System.out.println("Taxa de 20% do cheque especial (R$" + taxa + ") aplicada. Novo saldo após taxa: R$" + this.saldo);

            this.usandoChequeEspecial = false;
            this.valorUsadoChequeEspecial = 0.0;
        } else if (this.saldo < 0) {
            this.usandoChequeEspecial = true;
            this.valorUsadoChequeEspecial = Math.abs(this.saldo);
        } else {
            this.usandoChequeEspecial = false;
            this.valorUsadoChequeEspecial = 0.0;
        }
    }
    public boolean sacar(double valor){
        // Não pode ser negativo ou 0
        // Se tiver cheque especial tem que ter limite
        // Saldo da conta precisa ter fundos
        if (valor <= 0){
            System.out.println("O valor do saque deve ser positivo");
            return false;
        }
        double totalDisponivel = this.saldo + this.limiteChequeEspecial;
        if(totalDisponivel >= valor){
            double saldoAntesDoSaque = this.saldo;
            this.saldo -= valor;

            if (this.saldo < 0) {
                // Saldo negativo (cheque)
               this.usandoChequeEspecial = true;
                this.valorUsadoChequeEspecial = Math.abs(this.saldo);//Math.abs -> Converte saldo negativo para valor positivo
            }else {
                // Saldo positivo ou zerado
                this.usandoChequeEspecial = false;
                this.valorUsadoChequeEspecial = 0.0; // zerado pois não está sendo utilizado
            }
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente e limite do cheque especial excedido para o saque de R$" + valor + ".");
            return false;
        }

    }

    public boolean pagarBoleto(double valorBoleto) {
        System.out.println("Tentando pagar boleto de R$" + valorBoleto + "...");
        return sacar(valorBoleto);
    }
    public boolean isUsandoChequeEspecial() {
        return this.usandoChequeEspecial;
    }

    public double getValorUsadoChequeEspecial() {
        return this.valorUsadoChequeEspecial;
    }
}
