package br.com.alura;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    // modificador de acesso / visibilidade
    private double somaDasAvaliacoes; // item escondido, nenhuma outra classe tem acess
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    //metodo acessor
    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    //cria altomaticamente por Alt + Insert
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica()
    {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento); // instanciando objetos
    }

    public void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
