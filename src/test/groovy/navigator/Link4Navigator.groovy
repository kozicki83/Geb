package navigator

import geb.Browser
import geb.js.JavascriptInterface
import geb.navigator.Navigator
import geb.navigator.NonEmptyNavigator
import geb.waiting.DefaultWaitingSupport
import geb.waiting.WaitingSupport
import org.openqa.selenium.WebElement

class Link4Navigator extends NonEmptyNavigator {

    private WaitingSupport waitingSupport
    private JavascriptInterface js

    Link4Navigator(Browser browser, Collection<? extends WebElement> contextElements) {
        super(browser, contextElements)
        waitingSupport = new DefaultWaitingSupport(browser.config)
        js = browser.js
    }

    @Override
    Navigator value(Object value) {
        waitForAjax()
        super.value(value)
        waitForAjax()
        return this
    }

    @Override
    Navigator leftShift(Object value) {
        waitForAjax()
        super.leftShift(value)
        waitForAjax()
        return this
    }

    @Override
    Navigator click() {
        waitForAjax()
        super.click()
//        waitForAjax()
//        return this
    }

    def waitForAjax() {
        if (js.('window.jQuery != null && window.jQuery != "undefined"')) {
            waitingSupport.waitFor() {
                js.('jQuery.active') == 0 || js.('jQuery.active') == null
            }

        }
    }
}
