package br.com.indieguys.locadoravhs.api.dto;

import lombok.Data;

@Data
public class ClassificacaoIndicativaDTO {

	private Long id;
	private String faixaEtariaRecomendada;
	private String descricao;
	private String violencia;
	private String sexoNudez;
	private String drogas;
}
