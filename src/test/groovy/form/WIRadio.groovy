package form

import geb.Module
import geb.navigator.Navigator

class WIRadio extends Module {

    Navigator click() {
        if (js.('jQuery.active') != null) {
            waitFor { js.('jQuery.active') == 0 }
        }
        browser.waitFor { browser.$('body').find('div#preloader').getAttribute('style') != 'display: block;' }
        waitFor { navigator.click() }
    }

}
