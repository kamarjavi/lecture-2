import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
public static void main(String[] args) {
    WebDriver driver = initFirefoxDriver();
    driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("webinar.test@gmail.com");
    WebElement passwd = driver.findElement(By.id("passwd"));
    passwd.sendKeys("Xcg7299bnSmMuRLp9ITw");
    passwd.submit();
    pause(3000);
    WebElement profile = driver.findElement(By.id("employee_infos"));
    profile.click();
    WebElement logout = driver.findElement(By.id("header_logout"));
    logout.click();
    pause(3000);
    driver.quit();
}
    public static void pause(int msc) {
        try {
            Thread.sleep(msc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static WebDriver initFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", Test.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }
}
