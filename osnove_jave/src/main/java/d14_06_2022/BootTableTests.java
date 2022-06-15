package d14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BootTableTests {

    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";

    @BeforeClass

    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test(priority = 10)

    public void editRow() throws InterruptedException {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] The title does not - Table with Edit and Update Data");
        driver.findElement(By.xpath("//button[contains(@data-target, 'edit')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'modal-content')]")));
        driver.findElement(By.xpath("//input[contains(@placeholder, 'First')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'First')]")).sendKeys("Dunja");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]")).sendKeys("Brankovic");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Middle')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Middle')]")).sendKeys("Mladjan");

        Thread.sleep(1000);
        driver.findElement(By.id("up")).click();
        Assert.assertEquals("Dunja",
                "Dunja",
                "[ERROR] This is not the right text");
        Assert.assertEquals("Brankovic",
                "Brankovic",
                "[ERROR] This is not the right text");
        Assert.assertEquals("Mladjan",
                "Mladjan",
                "[ERROR] This is not the right text");
    }

    @Test (priority = 20)
    public void deleteRow() {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] The title does not - Table with Edit and Update Data");
        driver.findElement(By.xpath("//button[contains(@class, 'delete')]")).click();

        String deletePopUp = driver.findElement(By.id("del")).getAttribute("id");
        Assert.assertTrue(deletePopUp.equals("del"),
                "Pop-up se ne pojavljuje nakon brisanja reda");

        driver.findElement(By.id("del")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteDialogueBox = driver.findElement(By.id("del"));
        wait.until(ExpectedConditions.invisibilityOf(deleteDialogueBox));

        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("/tbody"), 1));


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

