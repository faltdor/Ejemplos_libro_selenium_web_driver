package co.com.w.surveys.util;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;

public class Utilidades {

	public Utilidades() {
	}

	public static File obtenerArchivo(String nombreArchivo) throws URISyntaxException {
		File file = null;
		CodeSource codeSource = Utilidades.class.getProtectionDomain()
				.getCodeSource();

		File jarFile;
		try {
			jarFile = new File(codeSource.getLocation().toURI().getPath());
			File jarDir = jarFile.getParentFile();

			if (jarDir != null && jarDir.isDirectory()) {
				file = new File(jarDir.getParent(), nombreArchivo);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw e;
		}
		return file;
	}

}
