import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.UnexpectedAlertBehaviour
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

reportsDir = "build/geb"

environments {
    uat1 {
        driver = { prepareXDriver() }
        systemFiles = "/Develop/uat1/SystemFiles"
        baseUrDisco = "http://10.10.63.131:7002/idit-web"
        baseUrlWi = "http://10.10.63.133:7009/kalkulator_ubezpieczenia_OC_AC/"

        db {
            url = "jdbc:oracle:thin@oradeva01"
            username = "user"
            password = "password"
        }
        mockDataBasePath = System.properties["os.name"] == 'Windows 10' ? "\\\\netprdw01\\JBOS" : "/Developments/develo"
    }
}

WebDriverManager.chromedriver().setup()
//println WebDriverManager.chromedriver().getDownloadedVersion()
//if(WebDriverManager.chromedriver().getDownloadedVersion())


waiting {
    timeout = 60
    retryInterval = 0.5
    if (System.properties["geb.timeout"] != null) {
        timeout = Double.parseDouble(System.properties["geb.timeout"])
    }
    if (System.properties["geb.retryInterval"] != null) {
        retryInterval = Double.parseDouble(System.properties["geb.retryInterval"])
    }
}

if (System.properties["geb.chrome"] != null) {
    String proxy = System.properties["geb.proxy"]
    WebDriverManager.chromedriver().proxy(proxy)
}


if (System.properties["geb.chrome"] != null) {
    String chromeDriverVersion = System.properties["geb.chrome"]
    WebDriverManager.chromedriver().version(chromeDriverVersion)
}


def prepareDriver() {
    def headless = System.properties["geb.headless"]
    if ('true'.equals(headless)) {
        return prepareHeadlessDrier()
    } else {
        return prepareDriver()
    }
}

def prepareXDriver() {
    def driver = new ChromeDriver()
//    WebDriverManager.chromedriver().getVersions()
    driver.manage().window().maximize()
    return driver
}

waiting {
    timeout = 10
    retryInterval = 0.5
}

def prepareHeadlessDrier() {
    ChromeOptions options = new ChromeOptions()
    DesiredCapabilities capabilities = DesiredCapabilities.chrome()
    options.addArguments("headless", "disable-gpu", "window-size=1920,1080", "allow-insecure-localhost", "no-sandbox", "lang=pl")
    capabilities.setCapability(ChromeOptions.CAPABILITY, options)
    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT)
    return new ChromeDriver(capabilities)
}