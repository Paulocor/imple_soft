package pro.paulo.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.paulo.catalogo.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAllByNomeIsLike(String nome);
}
