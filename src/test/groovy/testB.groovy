import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class testB {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")
//        def driver = new ChromeDriver('chromedriver.exe', 'C:\\chromedriver.exe')
        WebDriverManager.chromedriver().getVersions()
        WebDriverManager.chromedriver().version("74.0.3729.6").setup()
//        WebDriverManager.chromedriver().version("75.0.3770.8").setup()
        WebDriver driver = new ChromeDriver()
        driver.get("https://www.onet.pl/")
    }
}
