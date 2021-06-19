import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Google {
    public static WebDriver driver;

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            System.out.println("webDriver inicializando");
            driver = new ChromeDriver(); //Especifico la variable driver como un driver especifico en el navegador
            driver.manage().window().maximize();
            driver.get("https://www.grupobancolombia.com/");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            WebElement click1;
            click1 = driver.findElement(By.id("header-pymes"));
            click1.click();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            WebElement click2;
            click2 = driver.findElement(By.xpath("//a[text()=\"Herramientas\"]"));
            click2.click();
            Actions s = new Actions(driver);
            s.click(click2);

            WebElement button;
            button = driver.findElement(By.xpath("//*[@id=\"simuladores\"]/div/div/div[3]/div[1]/div[2]/div/ul/li[4]/a/h3"));
            button.click();
            Actions s2 = new Actions(driver);
            s2.click(button);

           driver.findElement(By.xpath("//*[@id=\"interes\"]"))
                    .sendKeys("24");

            Select topic = new Select(driver.findElement(By.id("periodicidad-deseada")));
            topic.selectByVisibleText("Semestral");

            Select topic2 = new Select(driver.findElement(By.id("capitalizacion")));
            topic2.selectByVisibleText("Bimensual");

            driver.findElement(By.xpath("//*[@id=\"interes2\"]"))
                    .sendKeys("24");

            Select topic3 = new Select(driver.findElement(By.id("capitalizacion2")));
            topic3.selectByVisibleText("Anual");

            Select topic4 = new Select(driver.findElement(By.id("periocidad2")));
            topic4.selectByVisibleText("Trimestral");


       // driver.close();
    }
}