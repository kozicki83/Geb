package form

import geb.module.FormElement
import org.openqa.selenium.Keys

class BaseInput extends FormElement {

    def clearData() {
        navigator.singleElement().click()
        navigator << Keys.chord(Keys.CONTROL + "a", Keys.DELETE)
    }

    def clearDataUsingBackspace() {
        navigator.singleElement().click()
        String text = navigator.value()
        for (int i = 0; i <= text.length(); i++) {
            navigator << Keys.chord(Keys.BACK_SPACE)
        }
    }
}
