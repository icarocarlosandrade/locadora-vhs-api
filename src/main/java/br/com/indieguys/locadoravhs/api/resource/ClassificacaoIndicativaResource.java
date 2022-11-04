package br.com.indieguys.locadoravhs.api.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.indieguys.locadoravhs.api.dto.ClassificacaoIndicativaDTO;
import br.com.indieguys.locadoravhs.api.service.ClassificacaoIndicativaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/classificacao-indicativa")
@RequiredArgsConstructor
public class ClassificacaoIndicativaResource {

	private final ClassificacaoIndicativaService service;

	@GetMapping
	public List<ClassificacaoIndicativaDTO> getAtivos() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ClassificacaoIndicativaDTO getById(@PathVariable Long id) {
		return service.getDTOById(id);
	}
}
