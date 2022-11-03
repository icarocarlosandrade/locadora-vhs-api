package br.com.indieguys.locadoravhs.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.indieguys.locadoravhs.api.dto.GeneroDTO;
import br.com.indieguys.locadoravhs.api.dto.mapper.GeneroMapper;
import br.com.indieguys.locadoravhs.domain.entity.Genero;
import br.com.indieguys.locadoravhs.domain.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeneroService {

	private final GeneroRepository repository;
	private final GeneroMapper mapper;

	public GeneroDTO getDTOById(Long id) {
		return mapper.toDTO(getById(id));
	}

	private Genero getById(Long id) {
		Optional<Genero> optionalEntity = repository.findById(id);

		if (!optionalEntity.isPresent()) {
			// Adicionar esse tratamento
			// throw new NotFoundException("Gênero não encontrado (Id = " + id + ")");
		}

		return optionalEntity.get();
	}

	public List<GeneroDTO> getAll() {
		List<GeneroDTO> generoDTOList = new ArrayList<>();
		List<Genero> generoList = repository.findAll();
		generoList.forEach(genero -> generoDTOList.add(mapper.toDTO(genero)));
		return generoDTOList;
	}
}
