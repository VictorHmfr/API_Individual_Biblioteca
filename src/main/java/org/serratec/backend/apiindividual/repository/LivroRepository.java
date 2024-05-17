package org.serratec.backend.apiindividual.repository;

import org.serratec.backend.apiindividual.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
