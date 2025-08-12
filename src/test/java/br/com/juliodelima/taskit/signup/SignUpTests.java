package br.com.juliodelima.taskit.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Funcionalidade de Sign Up")
public class SignUpTests {
    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testRegistrarUmNovoUsuarioComDadosValidos(){
        // Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site Taskit
        //navegador.manage().window().maximize();
        navegador.get("http://juliodelima.com.br/taskit/");

        // Vou clicar no botão que tem o ID igual a signup
        navegador.findElement(By.id("signup")).click();

        // Vou digitar o nome no campo com ID igual a name-sign-up
        navegador.findElement(By.id("name-sign-up")).sendKeys("Kira");

        // Vou digitar o login no campo com ID igual a login-sign-up
        navegador.findElement(By.id("login-sign-up")).sendKeys("Kira.O");

        // Vou digitar o password no campo com o ID igual password-sign-up
        navegador.findElement(By.id("password-sign-up")).sendKeys("123456789");

        // Vou clicar no botão com o ID igual a btn-submit-sign-up
        navegador.findElement(By.id("btn-submit-sign-up")).click();












    }
}
