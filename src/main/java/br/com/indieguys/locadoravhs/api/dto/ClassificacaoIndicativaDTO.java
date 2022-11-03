package br.com.indieguys.locadoravhs.api.dto;

import lombok.Data;

@Data
public class ClassificacaoIndicativaDTO {

	private Long id;
	private String descricao;
	private boolean ativo;
}
