package cinema_1;

public class IngressoInteira extends Ingresso {

    public IngressoInteira(double precoBase, Assento assento) {
        super(precoBase, assento);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}