package co.edu.univalle.app.validator;

import java.util.Arrays;
import java.util.List;

import co.edu.univalle.app.exceptions.CustomException;

public final class Validator {

	public static String validateStateMatricula(String estado) throws CustomException {

		List<String> lEstadosValidos = Arrays.asList("ACTIVA", "INACTIVA", "SUSPENDIDA");

		if (!lEstadosValidos.contains(estado.toUpperCase())) {
			throw new CustomException().new EstadoNoValido(
					"Ha ingresado un estado no valido para la matricula. Estados validos (ACTIVA, INACTIVA, SUSPENDIDA)");
		}

		return estado;
	}
}
