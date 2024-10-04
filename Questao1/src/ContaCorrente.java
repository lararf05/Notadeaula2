import java.util.Scanner;
public class ContaCorrente {
    private String titular;
    private double saldo;
    private double chequeEspecial = 1000.0;

    public ContaCorrente(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar (double valor){
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. O saldo atual: R$" + saldo);
    }

    public void sacar (double valor){
        if (saldo + chequeEspecial >= valor){
            saldo -= valor;
            if (saldo <0){
                chequeEspecial += saldo;
                saldo=0;
            }
            System.out.println("Saque realizado com sucesso. Saldo atual: R$" + saldo + ".Cheque especial disponível: R$" + chequeEspecial );
        }else{
            System.out.println("O saldo e o cheque especial estão insuficientes.");
        }

    }

    public void exibirDados(){
        System.out.println("Titular:" + titular);
        System.out.println("Saldo:" + saldo);
        System.out.println("Cheque Especial disponível: R$" + chequeEspecial);
    }
}
