package form

import geb.navigator.Navigator

class WiInput extends BaseInput {

    Navigator value(String value) {
        waitFor { navigator }
        if (navigator.text() != value) {
            clearData()
            navigator << value
        }
    }

}
