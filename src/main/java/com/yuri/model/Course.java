package com.yuri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data// lombok gera automaticamente constructor, getters, setters, toString...
@Entity// JPA, torna a classe uma entidade que será mapeada no banco de dados
// @Table(name = "cursos")//JPA, permite alterar o nome representado na tabela
public class Course {
	
	@Id// coluna primary key no banco
	@GeneratedValue(strategy = GenerationType.AUTO)// id's serão gerados automaticamente
	private Long id;
	
	@Column(length = 200, nullable = false)// max length 200, not null
	private String name;
	
	@Column(length = 10, nullable = false)
	private String category;

}
