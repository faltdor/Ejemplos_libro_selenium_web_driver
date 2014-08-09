package co.com.w.surveys;

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

	public void iniciarEncuesta(String codigoEncuesta) throws BiffException, IOException, URISyntaxException {
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
		
		String[] respuestas = cargarRespuestasArchivo("Video"+codigoEncuesta.substring(1));
		 
		Pregunta pregunta = new Pregunta();
		for (int i = 1; i <= 14; i++) {
			pregunta.responder(driver, "q"+i, respuestas[i-1]);
		}
	}

	private String[] cargarRespuestasArchivo(String nombreHoja) throws BiffException, IOException, URISyntaxException {

		Workbook workbook = null;
		String[] respuestas = null; 
		try {
			workbook = Workbook.getWorkbook(Utilidades.obtenerArchivo("respuestas.xls"));																	// que vamos a leer
			Sheet sheet = workbook.getSheet(nombreHoja); // Seleccionamos la hoja que vamos a leer
			int index = 0;
			respuestas = new String[sheet.getRows()]; 
			for (int fila = 1; fila < sheet.getRows(); fila++) { // recorremos las filas
					respuestas[index]= sheet.getCell(1, fila).getContents(); // setear la celda leida a nombre
					index++;
			}
			System.out.println("Se recupera respuestas hoja" + nombreHoja);
		} catch (BiffException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return respuestas;
	}

}
