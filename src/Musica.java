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
            System.out.println("Titulo da música: " + titulo);
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
