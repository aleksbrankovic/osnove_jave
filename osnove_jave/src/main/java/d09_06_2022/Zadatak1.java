package d09_06_2022;
//        1.Zadatak
//        Maksimizirati prozor
//        Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//        Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude
//                preko id atributa i za ovo trebace vam contains u xpath-u.
//        Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno
//                kliknuti (u rasponu od 1 do 5).
//        I izvrsite akciju klik na odgovarajuci element preko indeksa
//        Na kraju programa ugasite pretrazivac.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Scanner s = new Scanner(System.in);


        driver.manage().window().maximize();
        driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

        System.out.println("Unesite redni broj zvezdice za klik: ");
        int x = s.nextInt();

        driver.findElement(By.xpath(("//button[contains(@id,'rating-star')]")));

        if (x == 1) {
            driver.findElement(By.xpath("//button[contains(@id,'rating-star-1')]")).click();
        } else if (x == 2) {
            driver.findElement(By.xpath("//button[contains(@id,'rating-star-2')]")).click();
        } else if (x == 3) {
            driver.findElement(By.xpath("//button[contains(@id,'rating-star-3')]")).click();
        } else if (x == 4) {
            driver.findElement(By.xpath("//button[contains(@id,'rating-star-4')]")).click();
        } else {
            driver.findElement(By.xpath("//button[contains(@id,'rating-star-5')]")).click();
        }

        Thread.sleep(1500);

        driver.quit();



    }
}
