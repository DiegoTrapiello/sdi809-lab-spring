package com.uniovi.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_LoginView extends PO_View {

	public static void fillForm(WebDriver driver, String usuario, String contraseña) {
		WebElement username = driver.findElement(By.name("username"));
		username.click();
		username.clear();
		username.sendKeys(usuario);
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.clear();
		password.sendKeys(contraseña);
		//Pulsar el boton de Login.
		By boton = By.className("btn");
		driver.findElement(boton).click();
	}

}
