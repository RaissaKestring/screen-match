public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    // modificador de acesso / visibilidade
    private double somaDasAvaliacoes; // item escondido, nenhuma outra classe tem acess
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //metodo acessor
    int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }
    void exibeFichaTecnica()
    {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento); // instanciando objetos
    }

    void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
