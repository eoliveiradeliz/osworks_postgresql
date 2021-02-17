create table comentario(
	id BIGSERIAL PRIMARY key  not null,
	ordem_servico_id bigint not null,
	descricao text not null,
	data_envio timestamp not null
	
	
);

alter table comentario add constraint fk_comentario_ordem_servico
foreign key (ordem_servico_id) references ordem_servico(id);
