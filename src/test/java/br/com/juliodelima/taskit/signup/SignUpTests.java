package br.com.juliodelima.taskit.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Funcionalidade de Sign Up")
public class SignUpTests {
    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testRegistrarUmNovoUsuarioComDadosValidos(){
        // Vou abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        /*WebDriverManager.firefoxdriver().setup();
        WebDriver navegador = new FirefoxDriver();*/
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        // Abrir o site Taskit
        navegador.get("https://juliodelima.com.br/taskit/");

        // Vou clicar no botão que tem o ID igual a signup
        navegador.findElement(By.id("signup")).click();

        // Vou digitar o nome no campo com ID igual a name-sign-up
        navegador.findElement(By.id("name-sign-up")).sendKeys("Kira 1");

        // Vou digitar o login no campo com ID igual a login-sign-up
        navegador.findElement(By.id("login-sign-up")).sendKeys("Kira.2");

        // Vou digitar o password no campo com o ID igual password-sign-up
        navegador.findElement(By.id("password-sign-up")).sendKeys("123456789");

        // Vou clicar no botão com o ID igual a btn-submit-sign-up
        navegador.findElement(By.id("btn-submit-sign-up")).click();

        // Validar que o texto Hi, Kira foi apresentado no elemento que possui a class igual a me
        String saudacaoAtual = navegador.findElement(By.className("me")).getText();
        Assertions.assertEquals("Hi, Kira 1", saudacaoAtual);

        // Fechar navegador
        navegador.quit();
    }
}
