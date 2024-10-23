import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {

        public static void main(String[] args) {
            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);
            System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(5);
            meuFilme.avalia(10);
            System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//            não uso mais dessa forma:
//            meuFilme.totalDeAvaliacoes = 20;
//            meuFilme.somaDasAvaliacoes = 1;
//            System.out.println(meuFilme.pegaMedia());

            Serie dark = new Serie();
            dark.setNome("Dark");
            dark.setAnoDeLancamento(2020);
            dark.exibeFichaTecnica();
            dark.setTemporadas(3);
            dark.setEpisodiosPorTemporada(8);
            dark.setMinutosPorEpisodio(50);
            System.out.println("Duração para maratonar Dark: " + dark.getDuracaoEmMinutos() + " minutos");

            Filme outroFilme = new Filme();
            outroFilme.setNome("Duna");
            outroFilme.setAnoDeLancamento(2019);
            outroFilme.setDuracaoEmMinutos(200);

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

            calculadora.inclui(meuFilme);
            calculadora.inclui(outroFilme);
            calculadora.inclui(dark);
            System.out.println(calculadora.getTempoTotal());
        }

}
