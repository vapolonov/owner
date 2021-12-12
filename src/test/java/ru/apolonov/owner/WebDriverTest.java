package ru.apolonov.owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WebDriverTest {

    @Test
    public void testGithubTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
    }
}
