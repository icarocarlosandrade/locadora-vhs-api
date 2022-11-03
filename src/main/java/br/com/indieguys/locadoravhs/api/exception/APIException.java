package br.com.indieguys.locadoravhs.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class APIException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public APIException() {
		super();
	}

	public APIException(String message) {
		super(message);
	}

	public APIException(Throwable cause) {
		super(cause);
	}

	public APIException(String message, Throwable cause) {
		super(message, cause);
	}
}