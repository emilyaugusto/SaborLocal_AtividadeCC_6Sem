public class Mesa {
    private final int numero;
    private Comanda comandaAtual;

    public Mesa(int numero) {
        if (numero <= 0)
            throw new IllegalArgumentException("Número da mesa inválido.");
        this.numero = numero;
        this.comandaAtual = null;
    }

    public int getNumero() { return numero; }
    public Comanda getComandaAtual() { return comandaAtual; }

    public void alocarComanda(Comanda comanda) {
        if (this.comandaAtual != null)
            throw new IllegalStateException("Não pode abrir duas comandas para a mesma mesa ao mesmo tempo.");
        this.comandaAtual = comanda;
    }

    public void liberarMesa() {
        this.comandaAtual = null;
    }
}