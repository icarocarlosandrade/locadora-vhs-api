package br.com.indieguys.locadoravhs.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.indieguys.locadoravhs.api.dto.ClassificacaoIndicativaDTO;
import br.com.indieguys.locadoravhs.api.dto.mapper.ClassificacaoIndicativaMapper;
import br.com.indieguys.locadoravhs.api.exception.NotFoundException;
import br.com.indieguys.locadoravhs.domain.entity.ClassificacaoIndicativa;
import br.com.indieguys.locadoravhs.domain.repository.ClassificacaoIndicativaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClassificacaoIndicativaService {

	private final ClassificacaoIndicativaRepository repository;
	private final ClassificacaoIndicativaMapper mapper;

	public ClassificacaoIndicativaDTO getDTOById(Long id) {
		return mapper.toDTO(getById(id));
	}

	private ClassificacaoIndicativa getById(Long id) {
		Optional<ClassificacaoIndicativa> optionalEntity = repository.findById(id);

		if (!optionalEntity.isPresent()) {
			throw new NotFoundException("Classificação Indicativa não encontrada (Id = " + id + ")");
		}

		return optionalEntity.get();
	}

	public List<ClassificacaoIndicativaDTO> getAtivos() {
		List<ClassificacaoIndicativaDTO> classificacaoIndicativaDTOList = new ArrayList<>();
		List<ClassificacaoIndicativa> classificacaoIndicativaList = repository.findByAtivoTrue();
		classificacaoIndicativaList.forEach(classificacaoIndicativa -> classificacaoIndicativaDTOList.add(mapper.toDTO(classificacaoIndicativa)));
		return classificacaoIndicativaDTOList;
	}
}
