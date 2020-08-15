package form

import geb.Module

class WiRadio2 extends Module {

    def name

    def clickRadio() {
        if (js.('jQuery.active') != null) {
            waitFor { js.('jQuery.active') == 0 }
        }
        waitFor { name }
        name.click()
    }
}
