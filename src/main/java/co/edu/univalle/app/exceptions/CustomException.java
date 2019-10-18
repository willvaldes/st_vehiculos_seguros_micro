package co.edu.univalle.app.exceptions;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5574980025112432223L;

	public CustomException() {

	}

	public CustomException(String message) {
		super(message);
	}

	public class EstadoNoValido extends CustomException {
		private static final long serialVersionUID = 1L;

		public EstadoNoValido(String info) {
			super(info);
		}
	}

	public class CampoVacio extends CustomException {
		private static final long serialVersionUID = 1L;

		public CampoVacio(String info) {
			super("vacioooooooooooooooooo");
		}
	}
}
