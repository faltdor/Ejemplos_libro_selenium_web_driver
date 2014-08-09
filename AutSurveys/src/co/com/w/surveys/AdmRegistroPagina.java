package co.com.w.surveys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import co.com.w.surveys.util.Utilidades;

public class AdmRegistroPagina {
	WebDriver driver;
	@FindBy(how = How.NAME, name = "login")
	WebElement email;
	@FindBy(how = How.NAME, name = "password")
	WebElement pass;
	@FindBy(how = How.XPATH, xpath = "//input[@value='Iniciar sesión']")
	WebElement submit;
	@FindBy(how = How.LINK_TEXT, linkText = "Iniciar sesión")
	WebElement linkLogin;

	private String usuario;
	private String contrasena;
	private String url;

	public AdmRegistroPagina(WebDriver driver) throws URISyntaxException,
			IOException {
		this.driver = driver;
		iniciarPropiedades();
		driver.get(this.getUrl());
	}

	private void iniciarPropiedades() throws URISyntaxException, IOException {
		Properties prop = null;
		try {			
			File propFile = Utilidades.obtenerArchivo("init.properties");
			prop = new Properties();
			prop.load(new BufferedReader(new FileReader(propFile.getAbsoluteFile())));

			this.setUsuario(prop.getProperty("usuario"));
			this.setContrasena(prop.getProperty("contrasena"));
			this.setUrl(prop.getProperty("url"));

		} catch (URISyntaxException ex) {
			ex.printStackTrace();
			throw ex;
		} catch (FileNotFoundException ex) {
			System.err.println("No se encuentra el archivo: " + ex.getMessage());
			throw ex;
		} catch (IOException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	public void login() {
		linkLogin.click();
		email.sendKeys(this.getUsuario());
		pass.sendKeys(this.getContrasena());
		submit.submit();
	}

	private String getUsuario() {
		return usuario;
	}

	private void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	private String getContrasena() {
		return contrasena;
	}

	private void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	private String getUrl() {
		return url;
	}

	private void setUrl(String url) {
		this.url = url;
	}

}
