package co.com.w.surveys;

import java.io.IOException;
import java.net.URISyntaxException;

import jxl.read.biff.BiffException;

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
		registroPagina.login();

		Encuestas encuestas = PageFactory.initElements(driver, Encuestas.class);
		encuestas.verEncuestas();
		esperar(5000);

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Inicio Encuesta o"+i);
				encuestas.iniciarEncuesta("o"+i);
				encuestas.verEncuestas();
				esperar(5000);
			}
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
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
