public abstract class Cliente {
    private String nome;
    private String documento;

    protected Cliente(String nome, String documento) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome é obrigatório.");
        if (documento == null || documento.isBlank())
            throw new IllegalArgumentException("Documento é obrigatório.");
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }

    //polimorfismo: cada tipo de cliente tem seu calculo de conta 
    public abstract double calcularConta(Comanda comanda);
}