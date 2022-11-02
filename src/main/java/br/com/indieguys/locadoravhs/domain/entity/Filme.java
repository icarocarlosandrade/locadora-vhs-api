package br.com.indieguys.locadoravhs.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	@Column(nullable = false)
	private String nome;

	private String duracao;

	private String diretor;

	private String anoLancamento;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "genero_id", nullable = false)
	private Genero genero;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "classificacao_indicativa_id", nullable = false)
	private ClassificacaoIndicativa classificacaoIndicativa;
}
