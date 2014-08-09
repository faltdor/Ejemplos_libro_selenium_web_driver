package co.com.w.surveys;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Test {

	public static final String NOMBRE_APLICACION = "PDF Util";

	public static void main(String[] args) {

		try {

			establecerAparienciaDelSistema();

			int opcion;

			do {
				opcion = mostrarMenu();

				switch (opcion) {
				case 0:
					break;

				case 1:
					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					mostrarInfoAcercaDe();
					break;

				}

			} while (JOptionPane.CLOSED_OPTION != opcion);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, NOMBRE_APLICACION,
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void establecerAparienciaDelSistema()
			throws UnsupportedLookAndFeelException, IllegalAccessException,
			InstantiationException, ClassNotFoundException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}

	public static int mostrarMenu() {

		String opcion1 = "Copiar PDF";
		String opcion2 = "Dividir PDF";
		String opcion3 = "Escalar PDF";
		String opcion4 = "Rotar PDF";
		String opcion5 = "Acerca de";

		String[] options = { opcion1, opcion2, opcion3, opcion4, opcion5 };

		return JOptionPane.showOptionDialog(null,
				"Selecciona la operaci�n a realizar", NOMBRE_APLICACION,
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, options, opcion1);
	}

	public static void mostrarMensajeExito() {
		JOptionPane.showMessageDialog(null, "�Hecho!", NOMBRE_APLICACION,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void mostrarInfoAcercaDe() {
		JOptionPane.showMessageDialog(null,
				"Andr�s Pedraza M�guez\n\nandpedmig@gmail.com",
				NOMBRE_APLICACION, JOptionPane.INFORMATION_MESSAGE);
	}

}
