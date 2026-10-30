public class ClienteComum extends Cliente {

    public ClienteComum(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public double calcularConta(Comanda comanda) {
        double total = 0.0;
        for (Pedido p : comanda.getPedidos()) {
            total += p.getPreco();
        }
        return total;
    }
}