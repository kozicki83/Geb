package navigator

import geb.Browser
import geb.navigator.EmptyNavigator
import geb.navigator.Navigator
import geb.navigator.factory.InnerNavigatorFactory
import org.openqa.selenium.WebElement

class Link4InnerNavigatorFactory implements InnerNavigatorFactory {

    @Override
    Navigator createNavigator(Browser browser, List<WebElement> elements) {
        elements ? new Link4Navigator(browser, elements) : new EmptyNavigator(browser)
    }
}
