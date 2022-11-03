package br.com.indieguys.locadoravhs.api.dto.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.indieguys.locadoravhs.api.dto.ClassificacaoIndicativaDTO;
import br.com.indieguys.locadoravhs.domain.entity.ClassificacaoIndicativa;

@Component
public class ClassificacaoIndicativaMapper {

	public ClassificacaoIndicativaDTO toDTO(ClassificacaoIndicativa classificacaoIndicativa) {
		ClassificacaoIndicativaDTO classificacaoIndicativaDTO = new ClassificacaoIndicativaDTO();
		BeanUtils.copyProperties(classificacaoIndicativa, classificacaoIndicativaDTO);
		return classificacaoIndicativaDTO;
	}
}
