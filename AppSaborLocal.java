public class AppSaborLocal {
    public static void main(String[] args) {
        System.out.println("--- RESTAURANTE SABOR LOCAL ---\n");

        // Cardapio e pratos
        Cardapio cardapioJapones = new Cardapio("Comida Japonesa");
        Prato sushis = new Prato("Barca de Sushi", 90.0);
        Prato hotRoll = new Prato("Hot Roll (10 und)", 35.0);
        
        cardapioJapones.adicionarPrato(sushis);
        cardapioJapones.adicionarPrato(hotRoll);

        // Exemplo clientes
        Cliente ana = new ClienteComum("Ana Silva", "123.456.789-00");
        Cliente carlos = new ClienteRodizio("Carlos Souza", "987.654.321-11", 75.0);

        // Abrindo comanda/alocando mesa
        Mesa mesa5 = new Mesa(5);
        Comanda comandaAna = new Comanda(ana, mesa5);

        // Adição de pedidos
        comandaAna.adicionarPedido(sushis.getNome(), sushis.getPrecoBase());
        comandaAna.adicionarPedido(hotRoll.getNome(), hotRoll.getPrecoBase());

        // Calculo da conta
        System.out.println("Cliente Comum (" + ana.getNome() + "):");
        double totalAna = ana.calcularConta(comandaAna);
        System.out.println("Total calculado item a item: R$ " + totalAna);

        comandaAna.fechar(totalAna);
        comandaAna.pagar();
        System.out.println("Comanda paga com sucesso! Status: " + comandaAna.getEstado());

        System.out.println("\n-----------------------------------------");

        // Exemplo cliente rodizio
        Mesa mesa12 = new Mesa(12);
        Comanda comandaCarlos = new Comanda(carlos, mesa12);
        comandaCarlos.adicionarPedido("Rodízio Livre", 0.0);

        System.out.println("Cliente Rodízio (" + carlos.getNome() + "):");
        double totalCarlos = carlos.calcularConta(comandaCarlos);
        System.out.println("Total calculado (valor fixo): R$ " + totalCarlos);

        comandaCarlos.fechar(totalCarlos);
        comandaCarlos.pagar();
        System.out.println("Comanda paga com sucesso! Status: " + comandaCarlos.getEstado());
        
        System.out.println("\n--- FIM DA SIMULAÇÃO ---");
    }
}