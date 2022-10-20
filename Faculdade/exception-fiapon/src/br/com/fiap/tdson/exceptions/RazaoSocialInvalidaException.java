package br.com.fiap.tdson.exceptions;

public class RazaoSocialInvalidaException extends Exception {

	public RazaoSocialInvalidaException() {
	}

	public RazaoSocialInvalidaException(String message) {
		super(message);
	}

	public RazaoSocialInvalidaException(Throwable cause) {
		super(cause);
	}

	public RazaoSocialInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

	public RazaoSocialInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
