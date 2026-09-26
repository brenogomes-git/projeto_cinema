package cinema_1;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String filme;
    private String horario;
    private double precoBaseIngresso;
    private List<Assento> assentos; 

    public Sessao(String filme, String horario, double precoBaseIngresso) {
        this.filme = filme;
        this.horario = horario;
        this.precoBaseIngresso = precoBaseIngresso;
        this.assentos = new ArrayList<>();
    }

    public Assento buscarAssento(int numero) {
        for (Assento assento : assentos) {
            if (assento.getNumero() == numero) {
                return assento;
            }
        }
        return null;
    }
}