package pro.paulo.catalogo.repository;

import pro.paulo.catalogo.model.Musica;

import java.util.List;

public interface CustomCatalogoRepository {
    List<Musica> findAllByTituloUpper(String titulo);
}
