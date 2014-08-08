package co.com.w.surveys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pregunta {

	public Pregunta() {
	}
	
	public void responder(WebDriver driver,String nombrePregunta,String valorRespuesta){
		
		WebElement respuesta = driver.findElement(By
				.xpath("//input[@value='"+valorRespuesta+"' and @name='"+nombrePregunta+"']"));
		respuesta.click();

		WebElement enviar = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.elementToBeClickable(By
						.id("TimerButton")));
		enviar.click();
	}
}
