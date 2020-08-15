import io.github.bonigarcia.wdm.ChromeDriverManager
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver

environments {
    dev1 {
        driver = { prepareXDriver() }
    }
}

WebDriverManager.chromedriver().setup()
//println WebDriverManager.chromedriver().getDownloadedVersion()
//if(WebDriverManager.chromedriver().getDownloadedVersion())

def prepareXDriver(){
    def driver = new ChromeDriver()
//    WebDriverManager.chromedriver().getVersions()
    driver.manage().window().maximize()
    return driver
}

waiting {
    timeout = 10
    retryInterval = 0.5
}