package sala_aula;

public class POO_06 {

    public static void main(String[] args) {

        // Criacao das selecoes
        Selecao brasil = new Selecao("Brasil", "Treinador A");
        Selecao argentina = new Selecao("Argentina", "Treinador B");

        // Criacao de jogadores
        Jogador jogador1 = new Jogador("Rafael", 25, "Brasil", "Atacante", 9);
        Jogador jogador2 = new Jogador("Bruno", 23, "Brasil", "Meio-Campo", 8);
        Jogador jogador3 = new Jogador("Lucas", 24, "Argentina", "Atacante", 10);

        // Adicionando jogadores nas selecoes
        brasil.adicionarJogador(jogador1);
        brasil.adicionarJogador(jogador2);
        argentina.adicionarJogador(jogador3);

        // Demonstracao de POLIMORFISMO:
        // Mesmo tipo de referencia (Pessoal), comportamentos diferentes.
        Pessoal pessoa1 = jogador1;
        Pessoal pessoa2 = jogador3;

        System.out.println("=== Exemplo de Polimorfismo ===");
        System.out.println(pessoa1.descreverPapel());
        System.out.println(pessoa2.descreverPapel());

        // Informacoes da partida
        Local localFinal = new Local("Estadio Nacional", "Doha", 65000);
        Partida finalCopa = new Partida(brasil, argentina, localFinal);

        // Simulacao simples de gols
        finalCopa.registrarGolCasa(jogador1);
        finalCopa.registrarGolVisitante(jogador3);
        finalCopa.registrarGolCasa(jogador1);

        System.out.println("\n=== Elenco Brasil ===");
        System.out.println(brasil.listarJogadores());

        System.out.println("=== Elenco Argentina ===");
        System.out.println(argentina.listarJogadores());

        System.out.println("=== Resumo da Partida ===");
        System.out.println(finalCopa.resumoPartida());

        System.out.println("\n=== Estatisticas ===");
        System.out.println("Gols do " + jogador1.getNome() + ": " + jogador1.getGolsNaCopa());
        System.out.println("Gols do " + jogador3.getNome() + ": " + jogador3.getGolsNaCopa());
    }
}
