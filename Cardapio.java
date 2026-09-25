import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private final String sessao;
    private final List<Prato> pratos = new ArrayList<>(); 

    public Cardapio(String sessao) {
        this.sessao = sessao;
    }

    public String getSessao() { return sessao; }

    public void adicionarPrato(Prato prato) {
        if (prato != null && !pratos.contains(prato)) {
            pratos.add(prato);
        }
    }

    public List<Prato> getPratos() { return List.copyOf(pratos); }
}