package br.com.indieguys.locadoravhs.api.dto;

import lombok.Data;

@Data
public class GeneroDTO {

	private Long id;
	private String descricao;
	private boolean ativo;
}
