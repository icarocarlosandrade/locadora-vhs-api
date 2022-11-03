package br.com.indieguys.locadoravhs.api.exception.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.indieguys.locadoravhs.api.exception.APIException;
import br.com.indieguys.locadoravhs.api.exception.BusinessException;
import br.com.indieguys.locadoravhs.api.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
@Slf4j
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public List<String> handle(BusinessException ex) {
		return Arrays.asList(ex.getMessage());
	}

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public List<String> handle(NotFoundException ex) {
		return Arrays.asList(ex.getMessage());
	}

	@ExceptionHandler(APIException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public List<String> handle(APIException ex) {
		registrarLogErro(ex.getMessage(), ex);
		return Arrays.asList(ex.getMessage());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public List<String> handle(Exception ex) {
		String mensagem = "Erro inesperado.";
		registrarLogErro(mensagem, ex);
		return Arrays.asList(mensagem);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<String> validationErrors = new ArrayList<>();
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			validationErrors.add(error.getDefaultMessage());
		}

		return ResponseEntity.status(status).body(validationErrors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.warn(ex.getMessage());
		return ResponseEntity.badRequest().body(Arrays.asList(ex.getMessage()));
	}

	private void registrarLogErro(String mensagem, Exception ex) {
		log.error(mensagem, ex);
	}
}