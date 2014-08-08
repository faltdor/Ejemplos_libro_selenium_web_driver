package co.com.w.surveys;

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
	@FindBy(how=How.XPATH,xpath="//input[@value='Iniciar sesión']")
	WebElement submit;
	@FindBy(how=How.LINK_TEXT,linkText="Iniciar sesión")
	WebElement linkLogin;
	
	public AdmRegistroPagina(WebDriver driver) {
		this.driver = driver;
		driver.get("http://spainestudios.com/");		
	}

	public void login(String usuario, String contrasena) {
		linkLogin.click();
		email.sendKeys(usuario);
		pass.sendKeys(contrasena);
		submit.submit();
		
	}

}
