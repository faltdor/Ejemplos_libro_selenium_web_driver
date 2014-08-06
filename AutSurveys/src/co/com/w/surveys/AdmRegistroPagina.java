package co.com.w.surveys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdmRegistroPagina {
	WebDriver driver;
	@FindBy(how=How.NAME,name="login")
	WebElement email;
	@FindBy(how=How.NAME,name="password")
	WebElement pass;
	@FindBy(how=How.XPATH,xpath="//input[@value='Iniciar sesi�n']")
	WebElement submit;
	@FindBy(how=How.LINK_TEXT,linkText="Iniciar sesi�n")
	WebElement linkLogin;
	
	public AdmRegistroPagina(WebDriver driver) {
		this.driver = driver;
		driver.get("url");		
	}

	public void login(String usuario, String contrasena) {
		linkLogin.click();
		email.sendKeys(usuario);
		pass.sendKeys(contrasena);
		submit.submit();
		
	}

}
