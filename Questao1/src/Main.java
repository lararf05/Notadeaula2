import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Você acessou ao sistema do banco");
    System.out.println("Digite o nome do titular da conta: ");
    String titular = sc.nextLine();

    System.out.println("Selecione qual o tipo da conta que você quer acessar: ");
    System.out.println("1. Conta Corrente");
    System.out.println("2. Conta Poupança");
    int tipo_da_conta = sc.nextInt();

    if (tipo_da_conta == 1) {
        ContaCorrente cc = new ContaCorrente(titular);
        int opcao;
        do {
            System.out.println("Menu da Conta Corrente: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir dados da conta");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que você deseja depositar");
                    double ValorDeposito = sc.nextDouble();
                    cc.depositar(ValorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor que você deseja sacar");
                    double ValorSaque = sc.nextDouble();
                    cc.sacar(ValorSaque);
                    break;

                case 3:
                    cc.exibirDados();
                    break;

                default:
                    System.out.println("Essa opção não é valida");
                    break;

            }
        }while (opcao!=3);

    }else if (tipo_da_conta ==2){
        System.out.println("Informe a taxa Selic atual");
        double taxaSelic = sc.nextDouble();
        ContaPoupanca cp = new ContaPoupanca(titular, taxaSelic);
        int opcao;

        do{
            System.out.println("Menu conta Poupança: ");
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Calcular rendimento");
            System.out.println("4.Exibir dados da conta");
            opcao= sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = sc.nextDouble();
                    cp.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = sc.nextDouble();
                    cp.sacar(valorSaque);
                    break;

                case 3:
                    cp.calcularRendimento();
                    break;

                case 4:
                    cp.exibirDados();
                    break;

                default:
                    System.out.println("Essa opção não é valida");
                    break;

            }
        }while (opcao !=4);
    }else{
        System.out.println("Tipo de conta inválida");
    }

    sc.close();


}
}