package cinema_1;

public class ServiceBilheteria {

    public void realizarVenda(Sessao sessao, int numeroAssento, Ingresso ingresso) {
        Assento assento = sessao.buscarAssento(numeroAssento);
        
        if (assento != null && assento.getEstado() == EstadoAssento.LIVRE) {
            assento.reservar();
            assento.vender();
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Assento indisponível para venda.");
        }
    }
}