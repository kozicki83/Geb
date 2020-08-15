import geb.spock.GebSpec
import navigator.Link4InnerNavigatorFactory

import javax.security.auth.login.Configuration

class OpenPageWiSpec extends GebSpec {

    def setupSpec() {
        browser.baseUrl = browser.config.rawConfig.baseUrlDisco
        browser.config.rawConfig.innerNavigatorFactory = new Link4InnerNavigatorFactory()
    }

    def openPage(){
        browser.go("https://www.link4.pl/kalkulator_ubezpieczenia_OC_AC_2/motoFlow.html")
    }

}
