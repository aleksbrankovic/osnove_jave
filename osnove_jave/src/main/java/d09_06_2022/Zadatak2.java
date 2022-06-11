package d09_06_2022;
//        2.Zadatak
//        Napisati program koji vrsi dodavanje 5 reda u tabelu.
//        Maksimizirati prozor
//        Ucitati stranicu https:
//        //www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//        Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
//        Klik na dugme Add New
//        Unesite name,departmant i phone (uvek iste vrednost)
//        Trazenje po name atributu
//        Kliknite na zeleno Add dugme.
//        PAZNJA: Pogledajte strukturu stranice i videcete da se
//        u svakom redu poslednje kolone javljaju dugmici edit,
//        add, delete ali zbog prirode reda neki dugmici se vide a neki ne.
//        Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele.
//        Mozete koristeci index iz petlje, a mozete koristeci i last()
//        fukncionalnost za xpath. Koristan link last mehnizma
//        Cekanje od 0.5s
//        Na kraju programa ugasite pretrazivac.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//div[(@class = 'col-sm-4')]/button")).click();
            driver.findElement(By.xpath("//input[contains(@name, 'name')]")).sendKeys("Aleksandra");
            driver.findElement(By.xpath("//input[contains(@name, 'department')]")).sendKeys("Divided");
            driver.findElement(By.xpath("//input[contains(@name, 'phone')]")).sendKeys("0183200039");
            driver.findElement(By.xpath("//tr[last()]//a[contains(@class,'add')]")).click();

        }

        Thread.sleep(2000);
        driver.quit();
    }
}
