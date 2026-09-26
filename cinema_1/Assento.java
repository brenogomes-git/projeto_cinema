package cinema_1;

public class Assento {
    private int numero;
    private EstadoAssento estado;

    public Assento(int numero) {
        this.numero = numero;
        this.estado = EstadoAssento.LIVRE;
    }

    public void reservar() {
        this.estado = EstadoAssento.RESERVADO;
    }

    public void vender() {
        this.estado = EstadoAssento.VENDIDO;
    }

    public EstadoAssento getEstado() {
        return estado;
    }
    
    public int getNumero() {
        return numero;
    }
}
