package br.com.fiap.tdson.exceptions;

public class CnpjNaoEncontradoException extends Exception {

	public CnpjNaoEncontradoException() {
	}

	public CnpjNaoEncontradoException(String message) {
		super(message);
	}

	public CnpjNaoEncontradoException(Throwable cause) {
		super(cause);
	}

	public CnpjNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public CnpjNaoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
