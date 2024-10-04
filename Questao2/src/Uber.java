public class Uber {

    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda = 1.5;
    private double ValorFinal;


    public double getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal(double valorFinal) {
        ValorFinal = valorFinal;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public void calcularValorFinal() {
        ValorFinal = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }
    public void exibirDetalhesCorrida() {
        System.out.println("A distancia da corrida foi de: "+ distancia);
        System.out.println("Tempo de espera: "+ tempoEspera);
        System.out.println("TarifaBase: "+ tarifaBase);
        System.out.println("ValorFinal: "+ ValorFinal);
        System.out.println("O fator demanda foi de: "+ fatorDemanda);
    }
}