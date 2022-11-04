CREATE TABLE public.fita (
    id integer NOT NULL,
    quantidade integer,
    ativo boolean DEFAULT true NOT NULL,
    filme_id integer NOT NULL
);

ALTER TABLE public.fita OWNER TO postgres;

CREATE SEQUENCE public.fita_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fita_id_seq OWNER TO postgres;

ALTER SEQUENCE public.fita_id_seq OWNED BY public.fita.id;


CREATE TABLE public.filme (
    id integer NOT NULL,
    nome text NOT NULL,
    duracao text,
    diretor text,
    ano_lancamento text,
    genero_id integer NOT NULL,
    classificacao_indicativa_id integer NOT NULL
);

ALTER TABLE public.filme OWNER TO postgres;

CREATE SEQUENCE public.filme_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.filme_id_seq OWNER TO postgres;

ALTER SEQUENCE public.filme_id_seq OWNED BY public.filme.id;


CREATE TABLE public.genero (
    id integer NOT NULL,
    descricao text NOT NULL,
    ativo boolean DEFAULT true NOT NULL
);

ALTER TABLE public.genero OWNER TO postgres;

CREATE SEQUENCE public.genero_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.genero_id_seq OWNER TO postgres;

ALTER SEQUENCE public.genero_id_seq OWNED BY public.genero.id;


CREATE TABLE public.classificacao_indicativa (
    id integer NOT NULL,
    faixa_etaria_recomendada text NOT NULL,
    descricao text NOT NULL,
    violencia text NOT NULL,
    sexo_nudez text NOT NULL,
    drogas text NOT NULL
);

ALTER TABLE public.classificacao_indicativa OWNER TO postgres;

CREATE SEQUENCE public.classificacao_indicativa_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.classificacao_indicativa_id_seq OWNER TO postgres;

ALTER SEQUENCE public.classificacao_indicativa_id_seq OWNED BY public.classificacao_indicativa.id;

CREATE TABLE public.cliente (
    id integer NOT NULL,
    nome text NOT NULL,
    cpf text NOT NULL,
    email text,
    telefone text,
    data_nascimento date,
    ativo boolean DEFAULT true NOT NULL,
    endereco_id integer NOT NULL
);


ALTER TABLE public.cliente OWNER TO postgres;

CREATE SEQUENCE public.cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cliente_id_seq OWNER TO postgres;

ALTER SEQUENCE public.cliente_id_seq OWNED BY public.cliente.id;



CREATE TABLE public.endereco (
    id integer NOT NULL,
    rua text NOT NULL,
    numero text NOT NULL,
    complemento text,
    cep text,
    bairro text
);


ALTER TABLE public.endereco OWNER TO postgres;


CREATE SEQUENCE public.endereco_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.endereco_id_seq OWNER TO postgres;


ALTER SEQUENCE public.endereco_id_seq OWNED BY public.endereco.id;


ALTER TABLE ONLY public.fita ALTER COLUMN id SET DEFAULT nextval('public.fita_id_seq'::regclass);

ALTER TABLE ONLY public.filme ALTER COLUMN id SET DEFAULT nextval('public.filme_id_seq'::regclass);

ALTER TABLE ONLY public.genero ALTER COLUMN id SET DEFAULT nextval('public.genero_id_seq'::regclass);

ALTER TABLE ONLY public.classificacao_indicativa ALTER COLUMN id SET DEFAULT nextval('public.classificacao_indicativa_id_seq'::regclass);

ALTER TABLE ONLY public.cliente ALTER COLUMN id SET DEFAULT nextval('public.cliente_id_seq'::regclass);

ALTER TABLE ONLY public.endereco ALTER COLUMN id SET DEFAULT nextval('public.endereco_id_seq'::regclass);

ALTER TABLE ONLY public.fita
    ADD CONSTRAINT fita_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT filme_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.genero
    ADD CONSTRAINT genero_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.classificacao_indicativa
    ADD CONSTRAINT classificacao_indicativa_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.fita
    ADD CONSTRAINT fita_filme_id_fkey FOREIGN KEY (filme_id) REFERENCES public.filme(id) NOT VALID;

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT filme_genero_id_fkey FOREIGN KEY (genero_id) REFERENCES public.genero(id) NOT VALID;

ALTER TABLE ONLY public.filme
    ADD CONSTRAINT filme_classificacao_indicativa_id_fkey FOREIGN KEY (classificacao_indicativa_id) REFERENCES public.classificacao_indicativa(id) NOT VALID;

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_endereco_id_fkey FOREIGN KEY (endereco_id) REFERENCES public.endereco(id) NOT VALID;