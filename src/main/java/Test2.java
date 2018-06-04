        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import javax.swing.text.html.HTML;
        import java.util.ArrayList;
        import java.util.List;

        public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = initFirefoxDriver();
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");
        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.sendKeys("Xcg7299bnSmMuRLp9ITw");
        passwd.submit();
        pause(8000);
        WebElement dashboard = driver.findElement(By.id("tab-AdminDashboard"));
        dashboard.click();
        String s = new String(driver.getTitle());
        driver.navigate().refresh();
        pause(8000);
        String s1 = new String(driver.getTitle());
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Dashboard'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Dashboard'");

        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));
        orders.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(8000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Заказы'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Заказы'");

        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));
        catalog.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Каталог'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Каталог'");

        WebElement customer = driver.findElement(By.cssSelector("li.link-levelone:nth-child(5)"));
        customer.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Клиенты'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Клиенты'");

        WebElement customers_threads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        customers_threads.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Служба поддержки'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Служба поддержки'");

        WebElement admin_stats = driver.findElement(By.id("subtab-AdminStats"));
        admin_stats.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Статистика'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Статистика'");

        WebElement modules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        modules.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Modules'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Modules'");

        WebElement design = driver.findElement(By.cssSelector("li.link-levelone:nth-child(10)"));
        design.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Design'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Design'");

        WebElement shipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        shipping.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Доставка'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Доставка'");

        WebElement payment = driver.findElement(By.id("subtab-AdminParentPayment"));
        payment.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Способ оплаты'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Способ оплаты'");

        WebElement international = driver.findElement(By.id("subtab-AdminInternational"));
        international.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'International'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'International'");

        WebElement shop_parameters = driver.findElement(By.id("subtab-ShopParameters"));
        shop_parameters.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Shop Parameters'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Shop Parameters'");

        WebElement configuration = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        configuration.click();
        s = driver.getTitle();
        driver.navigate().refresh();
        pause(3000);
        s1 = driver.getTitle();
        if ( s.equals(s1)) System.out.println("После перезагрузки страницы пользователь остался в разделе 'Конфигурация'");
        else System.out.println("После перезагрузки страницы пользователь не остался в разделе 'Конфигурация'");
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
