package aulasInicias;

import java.util.Scanner;

public class Musica {
        String titulo;
        String artista;
        int anoDeLancamento;
        double somaDasAvaliacoes;
        int numAvaliacoes;

        // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

        Scanner scanner = new Scanner(System.in);

        void ficha()
        {
            System.out.println("br.com.alura.Titulo da música: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }

        void avalia(double nota)
        {
            somaDasAvaliacoes += nota;
            numAvaliacoes++;
        }

        double pegaMedia()
        {
            return somaDasAvaliacoes / numAvaliacoes;
        }
    }

// public class aulasInicias.Principal {
//    public static void main(String[] args) {
//        aulasInicias.Musica minhaMusica = new aulasInicias.Musica();
//
//        minhaMusica.titulo = "Nome da música";
//        minhaMusica.artista = "Nome do Artista";
//        minhaMusica.anoDeLancamento = 2023;
//
//        minhaMusica.ficha();
//
//        minhaMusica.avalia(4.5);
//        minhaMusica.avalia(3.8);
//        minhaMusica.avalia(5);
//
//        double mediaAvaliacoes = minhaMusica.pegaMedia();
//        System.out.println("Média das avaliações: " + mediaAvaliacoes);
//    }

//    public static void main(String[] args) {
//        aulasInicias.Aluno meuAluno = new aulasInicias.Aluno();
//        meuAluno.nome = "Akemi";
//        meuAluno.idade = 18;
//
//        meuAluno.info();
//    }

