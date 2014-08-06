package co.com.w.surveys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class IniciarEncuesta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		AdmRegistroPagina registroPagina = PageFactory.initElements(driver,
				AdmRegistroPagina.class);
		registroPagina.login("xxxxx", "xxxx");

		Encuestas encuestas = PageFactory.initElements(driver, Encuestas.class);
		encuestas.verEncuestas();
		encuestas.iniciarEncuesta("o1");
		

	}

}
