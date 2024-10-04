import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uber u = new Uber();


        System.out.println("Digite a distancia: ");
        u.setDistancia(sc.nextDouble());

        System.out.println("Digite o tempo de espera: ");
        u.setTempoEspera(sc.nextInt());

        System.out.println("Digite a tarifa base da corrida: ");
        u.setTarifaBase(sc.nextDouble());

        u.calcularValorFinal();

        u.exibirDetalhesCorrida();
    }
}