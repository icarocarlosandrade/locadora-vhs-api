package br.com.indieguys.locadoravhs.api.dto.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.indieguys.locadoravhs.api.dto.GeneroDTO;
import br.com.indieguys.locadoravhs.domain.entity.Genero;

@Component
public class GeneroMapper {

	public GeneroDTO toDTO(Genero genero) {
		GeneroDTO generoDTO = new GeneroDTO();
		BeanUtils.copyProperties(genero, generoDTO);
		return generoDTO;
	}
}
