package br.com.fiap.tdson.exceptions;

public class PorteEmpresarialNaoEncontradoException extends Exception {

	public PorteEmpresarialNaoEncontradoException() {
	}

	public PorteEmpresarialNaoEncontradoException(String message) {
		super(message);
	}

	public PorteEmpresarialNaoEncontradoException(Throwable cause) {
		super(cause);
	}

	public PorteEmpresarialNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PorteEmpresarialNaoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
