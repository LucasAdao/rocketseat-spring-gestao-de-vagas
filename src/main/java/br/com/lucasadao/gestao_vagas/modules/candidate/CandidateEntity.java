package br.com.lucasadao.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;



//com lombok deveria funcionar os gets e sets colocando apenas "@Data" porém não consegui
public class CandidateEntity {
	
	private UUID id;
	private String name;
	
	@Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço!")
	private String username;
	
	//isso aqui é da dependencia Spring Validation
	@Email(message = "O campo (email) deve ter um email válido! ")
	private String email;
	
	
	//isso aqui é da dependencia Spring Validation
	@Length(min = 8, max = 20, message = "A senha deve conter entre (8) e (20) caracteres")
	private String password;
	
	private String descricao;
	private String curriculum;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}
	
	
}
