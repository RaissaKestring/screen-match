public class Principal {
//    public static void main(String[] args) {
//        Musica minhaMusica = new Musica();
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
//        Aluno meuAluno = new Aluno();
//        meuAluno.nome = "Akemi";
//        meuAluno.idade = 18;
//
//        meuAluno.info();
//    }

        public static void main(String[] args) {
            Filme meuFilme = new Filme();
            meuFilme.nome = "O poderoso chefão";
            meuFilme.anoDeLancamento = 1970;
            meuFilme.duracaoEmMinutos = 180;

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(5);
            meuFilme.avalia(10);
            System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//            não uso mais dessa forma:
//            meuFilme.totalDeAvaliacoes = 20;
//            meuFilme.somaDasAvaliacoes = 1;
            System.out.println(meuFilme.pegaMedia());

        }

}
