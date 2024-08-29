import java.util.ArrayList;

//Interface para adaptador de video
interface VideoAdapter {

    Video getVideo();

}

class FilmeAdapter implements VideoAdapter {

    private Filme filme;

    public FilmeAdapter() {
        this.filme = new Filme(null, null, 0, null, null);
    }

    public FilmeAdapter(Filme filme) {
        this.filme = filme;
    }

    @Override
    public Video getVideo() {

        return this.filme;

    }
}

class SerieAdapter implements VideoAdapter {

    private Serie serie;

    public SerieAdapter() {
        this.serie = new Serie(null, null, 0, null, null);
    }

    public SerieAdapter(Serie serie) {
        this.serie = serie;
    }

    @Override
    public Video getVideo() {

        return this.serie;

    }

}

// Classe Usuário
class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<VideoAdapter> listaFavoritos;

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaFavoritos = new ArrayList<>();
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void adicionarFavorito(VideoAdapter videoAdapter) {
        listaFavoritos.add(videoAdapter);
    }

    public void removerFavorito(VideoAdapter videoAdapter) {
        listaFavoritos.remove(videoAdapter);
    }

    public void listarFavoritos() {

        System.out.println("Lista de Séries/Filmes Favoritos de " + nome);

        for (VideoAdapter videoAdapter : listaFavoritos) {

            Video video = videoAdapter.getVideo();
            System.out.println("Titulo do filme: " + video.getTitulo() + " - " + video.getDiretor());

        }

    }

}
