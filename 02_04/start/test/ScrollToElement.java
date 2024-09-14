import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://business.digigreet.co.uk/v11/Home.aspx?");

        WebElement name = driver.findElement(By.id("ctl00_ctl00_MasterContent_Content_Home_Login"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Uros Antic");



    }
}
