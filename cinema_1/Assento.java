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
    
    // Método auxiliar implícito necessário para a Sessão buscar o assento
    public int getNumero() {
        return numero;
    }
}