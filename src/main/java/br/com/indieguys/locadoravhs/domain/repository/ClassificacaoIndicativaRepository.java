package br.com.indieguys.locadoravhs.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.indieguys.locadoravhs.domain.entity.ClassificacaoIndicativa;

@Repository
public interface ClassificacaoIndicativaRepository extends JpaRepository<ClassificacaoIndicativa, Long>{

}
