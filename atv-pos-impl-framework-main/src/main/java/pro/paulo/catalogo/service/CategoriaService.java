package pro.paulo.catalogo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pro.paulo.catalogo.model.Categoria;

public interface CategoriaService {
    Page<Categoria> findAllWithPageable(Pageable pageable);
    List<Categoria> findAll();
    Categoria findById(long id);
    Categoria save(Categoria nome);
    void excluir(long id);

    List<Categoria> findByNome(String nome);
}
