-- Definição da Classificação Indicativa encontrada em https://pt.wikipedia.org/wiki/Lista_de_g%C3%AAneros_cinematogr%C3%A1ficos

INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('L', 'LIVRE',
		'Arma sem violência; Morte sem violência; Ossada ou esqueleto sem violência; Violência Fantasiosa.',
		'Nudez não erótica.',
		'Consumo moderado ou insinuado de droga lícita.');

INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('10', 'Não recomendado para menores de 10 (dez) anos',
		'Angústia; Arma com violência; Ato criminoso sem violência; Linguagem depreciativa; Medo/tensão; Ossada ou esqueleto com resquício de ato de violência.',
		'Conteúdo educativo sobre sexo.',
		'Descrição do consumo de droga lícita; Discussão sobre o tema drogas; Uso medicinal de droga ilícita.');


INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('12', 'Não recomendado para menores de 12 (doze) anos',
		'Agressão verbal; Assédio sexual; Ato violento; Ato violento contra animal; Bullying; Descrição de violência; Exposição ao perigo; Exposição de cadáver; Exposição de pessoa em situação constrangedora ou degradante; Lesão corporal; Morte derivada de ato heróico; Morte natural ou acidental com dor ou violência; Obscenidade; Presença de sangue; Sofrimento da vítima; Supervalorização da beleza física; Supervalorização do consumo; Violência psicológica.',
		'Apelo sexual; Carícia sexual; Insinuação sexual; Linguagem chula; Linguagem de conteúdo sexual; Masturbação; Nudez velada; Simulação de sexo.',
		'Consumo de droga lícita; Consumo irregular de medicamento; Discussão sobre legalização de droga ilícita; Indução ao uso de droga lícita; Menção a droga ilícita.');


INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('14', 'Não recomendado para menores de 14 (quatorze) anos',
		'Aborto; Estigma/preconceito; Eutanásia; Exploração sexual; Morte intencional; Pena de morte.',
		'Erotização; Nudez; Prostituição; Relação sexual; Vulgaridade.',
		'Consumo insinuado de droga ilícita; Descrição do consumo ou tráfico de droga ilícita.');

INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('16', 'Não recomendado para menores de 16 (dezesseis) anos',
		'Ato de pedofilia; Crime de ódio; Estupro/coação sexual; Mutilação; Suicídio; Tortura; Violência gratuita/banalização da violência.',
		'Relação sexual intensa.',
		'Consumo de droga ilícita; Indução ao consumo de droga ilícita; Produção ou tráfico de droga ilícita.');

INSERT INTO public.classificacao_indicativa(faixa_etaria_recomendada, descricao, violencia, sexo_nudez, drogas)
	VALUES ('18', 'Não recomendado para menores de 18 (dezoito) anos',
		'Apologia à violência; Crueldade.',
		'Sexo explícito; Situação sexual complexa/de forte impacto.',
		'Apologia ao uso de droga ilícita.');


-- Definição dos Gêneros encontrada em https://pt.wikipedia.org/wiki/Lista_de_g%C3%AAneros_cinematogr%C3%A1ficos

INSERT INTO public.genero(descricao) VALUES ('Ação');
INSERT INTO public.genero(descricao) VALUES ('Aventura');
INSERT INTO public.genero(descricao) VALUES ('Cinema de arte');
INSERT INTO public.genero(descricao) VALUES ('Chanchada');
INSERT INTO public.genero(descricao) VALUES ('Comédia');
INSERT INTO public.genero(descricao) VALUES ('Comédia de ação');
INSERT INTO public.genero(descricao) VALUES ('Comédia de terror');
INSERT INTO public.genero(descricao) VALUES ('Comédia dramática');
INSERT INTO public.genero(descricao) VALUES ('Comédia romântica');
INSERT INTO public.genero(descricao) VALUES ('Dança');
INSERT INTO public.genero(descricao) VALUES ('Documentário');
INSERT INTO public.genero(descricao) VALUES ('Docuficção');
INSERT INTO public.genero(descricao) VALUES ('Drama');
INSERT INTO public.genero(descricao) VALUES ('Espionagem');
INSERT INTO public.genero(descricao) VALUES ('Faroeste');
INSERT INTO public.genero(descricao) VALUES ('Fantasia');
INSERT INTO public.genero(descricao) VALUES ('Fantasia científica');
INSERT INTO public.genero(descricao) VALUES ('Ficção científica');
INSERT INTO public.genero(descricao) VALUES ('Filmes com truques');
INSERT INTO public.genero(descricao) VALUES ('Filmes de guerra');
INSERT INTO public.genero(descricao) VALUES ('Mistério');
INSERT INTO public.genero(descricao) VALUES ('Musical');
INSERT INTO public.genero(descricao) VALUES ('Filme policial');
INSERT INTO public.genero(descricao) VALUES ('Romance');
INSERT INTO public.genero(descricao) VALUES ('Terror');
INSERT INTO public.genero(descricao) VALUES ('Thriller');