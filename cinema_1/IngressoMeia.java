package cinema_1;

public class IngressoMeia extends Ingresso {
    private String documentoComprovante;

    public IngressoMeia(double precoBase, Assento assento, String documentoComprovante) {
        super(precoBase, assento);
        this.documentoComprovante = documentoComprovante;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 0.5;
    }
}