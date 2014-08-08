package co.com.w.surveys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class IniciarEncuesta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		AdmRegistroPagina registroPagina = PageFactory.initElements(driver,
				AdmRegistroPagina.class);
		registroPagina.login("faltdor@gmail.com", "SpainStudy-$-813*");

		Encuestas encuestas = PageFactory.initElements(driver, Encuestas.class);
		encuestas.verEncuestas();

		esperar(5000);

		encuestas.iniciarEncuesta("o1");
		encuestas.verEncuestas();
		esperar(5000);
		encuestas.iniciarEncuesta("o2");
		encuestas.verEncuestas();
		esperar(5000);
		encuestas.iniciarEncuesta("o3");
		encuestas.verEncuestas();
		esperar(5000);
		encuestas.iniciarEncuesta("o4");
		encuestas.verEncuestas();
		esperar(5000);
		encuestas.iniciarEncuesta("o5");
		encuestas.verEncuestas();

	}

	private static void esperar(long milis) {
		try {
			Thread.currentThread();
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
