package br.com.indieguys.locadoravhs.api.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.indieguys.locadoravhs.api.dto.GeneroDTO;
import br.com.indieguys.locadoravhs.api.service.GeneroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/genero")
@RequiredArgsConstructor
public class GeneroResource {

	private final GeneroService service;

	@GetMapping
	public List<GeneroDTO> getAtivos() {
		return service.getAtivos();
	}
	
	@GetMapping("/{id}")
	public GeneroDTO getById(@PathVariable Long id) {
		return service.getDTOById(id);
	}
}
