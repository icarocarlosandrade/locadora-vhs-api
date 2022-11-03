package br.com.indieguys.locadoravhs.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.indieguys.locadoravhs.domain.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{

	// Alterar para pegar apenas os ativos
	List<Genero> findAll();
}
