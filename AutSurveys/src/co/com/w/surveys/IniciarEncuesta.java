package co.com.w.surveys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IniciarEncuesta {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		AdmRegistroPagina  registroPagina = PageFactory.initElements(driver, AdmRegistroPagina.class); 
		registroPagina.login("faltdor@gmail.com","xxxxxxx");
		
		driver.findElement(By.cssSelector("a[href*='survey=job']")).click();
		driver.findElement(By.name("o1")).click();
		WebElement pasarPreguntas = (new WebDriverWait(driver, 30))
				.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver d) {
						return d.findElement(By.className("comment-formvideo"));
					}
				});
		pasarPreguntas.click();		
		
	}

}
