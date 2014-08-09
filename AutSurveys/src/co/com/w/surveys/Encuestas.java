package co.com.w.surveys;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.com.w.surveys.util.Utilidades;

public class Encuestas {
	private WebDriver driver;
	@FindBy(how = How.CSS, css = "a[href*='survey=job']")
	private WebElement iniciarEncuestaButton;

	public Encuestas(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verEncuestas() {
		this.iniciarEncuestaButton.click();
	}

	public void iniciarEncuesta(String codigoEncuesta) {
		WebElement element = driver.findElement(By.name(codigoEncuesta));
		element.click();

		WebElement pasarPreguntas = (new WebDriverWait(driver, 30))
				.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver d) {
						return d.findElement(By.className("comment-formvideo"));
					}
				});
		pasarPreguntas.click();

		Pregunta pregunta = new Pregunta();
		pregunta.responder(driver, "q1", "2");
		pregunta.responder(driver, "q2", "2");
		pregunta.responder(driver, "q3", "2");
		pregunta.responder(driver, "q4", "2");
		pregunta.responder(driver, "q5", "2");
		pregunta.responder(driver, "q6", "2");
		pregunta.responder(driver, "q7", "2");
		pregunta.responder(driver, "q8", "2");
		pregunta.responder(driver, "q9", "2");

		pregunta.responder(driver, "q10", "2");
		pregunta.responder(driver, "q11", "2");
		pregunta.responder(driver, "q12", "3");
		pregunta.responder(driver, "q13", "3");
		pregunta.responder(driver, "q14", "1");

	}

	public void cargarRespuestasArchivo() throws BiffException, IOException, URISyntaxException {

		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(Utilidades.obtenerArchivo("respuestas.xls"));																	// que vamos a leer
			Sheet sheet = workbook.getSheet(0); // Seleccionamos la hoja que vamos a leer
			String nombre;
	
			for (int fila = 1; fila < sheet.getRows(); fila++) { // recorremos las filas
					nombre = sheet.getCell(1, fila).getContents(); // setear la celda leida a nombre
					System.out.print(nombre + " "); 
			}
		} catch (BiffException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
