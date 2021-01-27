package Traductor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TraductorPage {
    WebDriver driver;
    By fieldTranslate = By.xpath("//div");
    By result = By.xpath("*//span/span/span");

    public TraductorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void writeWord(String word) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fieldTranslate));
        driver.findElement(fieldTranslate).sendKeys(word);
    }

    public String translatedWord() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(result));
        return driver.findElement(result).getText();
    }
}
