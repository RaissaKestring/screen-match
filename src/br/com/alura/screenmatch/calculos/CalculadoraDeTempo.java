package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme filme)
//    {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie)
//    {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    // ao inves de repetir código, passo como parâmetro Titulo, tanto filme como série possuem
    // parâmetro é a superclasse
    public void inclui(Titulo titulo)
    {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
