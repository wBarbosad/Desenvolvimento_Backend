package lojavitti.lojavitti.repository;

import lojavitti.lojavitti.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Respository extends JpaRepository<Produto, Integer>{

}
