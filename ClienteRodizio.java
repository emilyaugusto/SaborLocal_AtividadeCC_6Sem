public class ClienteRodizio extends Cliente {
    private final double valorFixo;

    public ClienteRodizio(String nome, String documento, double valorFixo) {
        super(nome, documento);
        if (valorFixo < 0)
            throw new IllegalArgumentException("O valor fixo do rodízio não pode ser negativo.");
        this.valorFixo = valorFixo;
    }

    public double getValorFixo() { return valorFixo; }

    @Override
    public double calcularConta(Comanda comanda) {
        return valorFixo;
    }
}