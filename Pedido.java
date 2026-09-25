public class Pedido {
    private final String descricao;
    private double preco;

    public Pedido(String descricao, double preco) {
        if (descricao == null || descricao.isBlank())
            throw new IllegalArgumentException("Descrição do pedido é obrigatória.");
        if (preco < 0)
            throw new IllegalArgumentException("O preço do pedido nunca pode ser negativo.");
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        if (preco < 0)
            throw new IllegalArgumentException("O preço do pedido não pode ser negativo.");
        this.preco = preco;
    }
}