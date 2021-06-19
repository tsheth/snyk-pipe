package com.tm.web.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tm.testing.*;
import com.tm.web.config.SpringConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-junit-jupiter
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes = SpringConfig.class)
//@SpringJUnitWebConfig(SpringConfig.class)
public class TestWelcome {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webAppContext;

	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
	}

	@Test
	public void testWelcome() throws Exception {
		this.mockMvc.perform(get("/Login.jsp"));
	}

	@Test
	public void testUserValidateJunit() throws Exception {
		String name = "zain";
		String pass = "5623";
		ValidateUser vu = new ValidateUser();
		vu.setUsers(name);
		vu.setPasswords(pass);
		boolean result = vu.validate();
		assertTrue(result);
	}

	@Test
	public void testUserValidateSelenium() throws InterruptedException {
		String chromeDriverPath = System.getenv("SELENIUM_CHROME_DRIVER_PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox", "--disable-dev-shm-usage", 
				"--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		String baseUrl = System.getenv("DEMO_APP_URL");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("zain");
		driver.findElement(By.id("passwd")).sendKeys("5623");
		driver.findElement(By.id("SubmitLogin")).submit();
		Thread.sleep(5000);
		System.out.println("Login Done with Submit");
		driver.close();
	}
// 	@Test
// 	public void testSonarQube() {
// 		int HelloSonar = 5;
// 		int willThrowRuntimeError = HelloSonar/0;
// 	}
}
