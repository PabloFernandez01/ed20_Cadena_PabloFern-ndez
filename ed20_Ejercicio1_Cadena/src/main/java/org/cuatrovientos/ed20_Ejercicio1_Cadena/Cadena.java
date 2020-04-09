package org.cuatrovientos.ed20_Ejercicio1_Cadena;

public class Cadena {

	public int longitud(String cadena) {
		int length = cadena.length();
		return length;
	}

	public int vocales(String cadena) {
		int contador = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
				contador++;
			}
		}
		return contador;
	}

	public String invertir(String cadena) {

		StringBuilder builder = new StringBuilder(cadena);
		String sCadenaInvertida = builder.reverse().toString();

		return sCadenaInvertida;

	}

	public static int contarLetra(String cadena, char caracter) {
        int posicion, contador = 0;

        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}