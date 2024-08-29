import java.util.*;

// Classe fábrica concreta para criar filmes
class FilmeFactory implements VideoFactory {
    @Override
    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais) {
        return new Filme(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }
}
