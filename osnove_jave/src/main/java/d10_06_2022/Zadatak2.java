package d10_06_2022;
//        2.Zadatak
//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Zadatak2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://geodata.solutions/");

        Select select_1 = new Select(driver.findElement(By.id("countryId")));
        Select select_2 = new Select(driver.findElement(By.id("stateId")));
        Select select_3 = new Select(driver.findElement(By.id("cityId")));

        select_1.selectByVisibleText("Serbia");
        select_2.selectByVisibleText("Central Serbia");
        select_3.selectByVisibleText("Nis");

        driver.quit();


    }
}
