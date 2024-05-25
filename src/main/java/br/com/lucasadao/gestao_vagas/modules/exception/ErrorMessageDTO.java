package br.com.lucasadao.gestao_vagas.modules.exception;


//"@AllArgsConstructor" já criaria um construtor com todos os argumentos, porém assim como o data, não funcionou de novo
public class ErrorMessageDTO {
	
	private String message;
	private String field;
	
	public ErrorMessageDTO(String message, String field) {
		this.message = message;
		this.field = field;
	}
	public ErrorMessageDTO() {
		
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
