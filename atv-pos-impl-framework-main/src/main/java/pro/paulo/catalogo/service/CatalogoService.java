package pro.paulo.catalogo.service;

import java.util.List;

import pro.paulo.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);
    void excluir(long id);

    List<Musica> findByTituloAndCategory(String titulo, long id_category);
}
