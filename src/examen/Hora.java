package examen;
/**
 * Clase Hora que verificara la hora
 * @author Sergio Castillo DAW104
 *@version 1.0
 */
public class Hora {
	/**
	 * variable booleana horaValida
	 */
	public static boolean horaValida;
		/**
		 * Metodo validarHora que valida si la hora esta bien o no con un booleano
		 * @param segundos comprueba los segundos
		 * @param minutos comprueba los minutos
		 * @param horas comprueba las horas
		 * @return True si la hora esta bien, False en caso contraria
		 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}
