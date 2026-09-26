package cinema_1;

public abstract class Ingresso {
    private double precoBase;
    private Assento assento; 

    public Ingresso(double precoBase, Assento assento) {
        this.precoBase = precoBase;
        this.assento = assento;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}