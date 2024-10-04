import java.util.Scanner;
public class ContaPoupanca {
    private String titular;
    private double saldo;
    private double taxaSelic;

    public ContaPoupanca (String titular, double taxaSelic){
        this.titular = titular;
        this.saldo = 0.0;
        this.taxaSelic = taxaSelic;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo Atual: R$" + saldo);
    }

    public void sacar (double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$" + saldo);
        }else {
            System.out.println("O saldo é insuficiente");
        }
    }

    public void calcularRendimento(){
        double rendimento;
        if (taxaSelic > 8.5){
            rendimento = saldo * 0.005;
        }else {
            rendimento = saldo * (taxaSelic * 0.7/100);
        }
        saldo += rendimento;
        System.out.println("Rendimento foi calculado. O saldo atual: R$" +saldo);
    }

    public void exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
