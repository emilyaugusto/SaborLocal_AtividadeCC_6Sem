import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private String estado; // aberta/fechada/paga
    private double valorTotal;
    private final List<Pedido> pedidos = new ArrayList<>();
    private final Cliente cliente;
    private final Mesa mesa;

    public Comanda(Cliente cliente, Mesa mesa) {
        if (cliente == null || mesa == null)
            throw new IllegalArgumentException("Comanda exige cliente e mesa válidos.");
        this.cliente = cliente;
        this.mesa = mesa;
        this.estado = "aberta";
        this.valorTotal = 0.0;
        mesa.alocarComanda(this);
    }

    public String getEstado() { return estado; }
    public double getValorTotal() { return valorTotal; }
    public List<Pedido> getPedidos() { return List.copyOf(pedidos); }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }

    public void adicionarPedido(String descricao, double preco) {
        if (!estado.equals("aberta"))
            throw new IllegalStateException("Não é possível adicionar pedidos em comanda fechada ou paga.");
        Pedido p = new Pedido(descricao, preco);
        pedidos.add(p);
    }

    public void fechar(double valorCalculado) {
        if (!estado.equals("aberta"))
            throw new IllegalStateException("A comanda já está fechada ou paga.");
        if (valorCalculado < 0)
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        this.valorTotal = valorCalculado;
        this.estado = "fechada";
    }

    public void pagar() {
        if (!estado.equals("fechada"))
            throw new IllegalStateException("A comanda precisa estar fechada para ser paga.");
        this.estado = "paga";
        mesa.liberarMesa();
    }
}