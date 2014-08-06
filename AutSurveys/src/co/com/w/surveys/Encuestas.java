package co.com.w.surveys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Encuestas {
	private WebDriver driver;
	@FindBy(how=How.CSS,css="a[href*='survey=job']")
	private WebElement inicirEncuestaButton;
	
	public Encuestas(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verEncuestas() {		
//		driver.findElement(By.cssSelector("a[href*='survey=job']")).click();
		this.inicirEncuestaButton.click();		
	}

	public void iniciarEncuesta(String codigoEncuesta) {
		driver.findElement(By.name(codigoEncuesta)).click();
		
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
