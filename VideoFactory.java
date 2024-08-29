import java.util.*;

// Interface para a fábrica abstrata de vídeos
interface VideoFactory {
    Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais);
}
