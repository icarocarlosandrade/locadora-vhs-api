package br.com.indieguys.locadoravhs.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ClassificacaoIndicativa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	@Column(nullable = false, name = "faixa_etaria_recomendada")
	private String faixaEtariaRecomendada;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private String violencia;
	
	@Column(nullable = false, name="sexo_nudez")
	private String sexoNudez;
	
	@Column(nullable = false)
	private String drogas;
}
