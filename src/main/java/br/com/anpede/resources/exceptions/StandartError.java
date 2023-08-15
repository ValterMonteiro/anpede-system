package br.com.anpede.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.anpede.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

public class StandartError implements Serializable{

	private static final long serialVersionUID = 1L;


	//CONFIGURAÇÃO DA MENSAGEM PADRONIZADA DE EXCEÇÃ
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandartError() {
		// TODO Auto-generated constructor stub
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}



}
