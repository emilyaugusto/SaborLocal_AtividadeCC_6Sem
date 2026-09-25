public class Prato {
    private final String nome;
    private final double precoBase;

    public Prato(String nome, double precoBase) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome do prato é obrigatório.");
        if (precoBase < 0)
            throw new IllegalArgumentException("Preço base não pode ser negativo.");
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() { return nome; }
    public double getPrecoBase() { return precoBase; }
}