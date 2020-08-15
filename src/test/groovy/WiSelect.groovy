import geb.Module
import geb.navigator.Navigator

class WiSelect extends Module {

    Navigator select(String value) {
        def node = navigator.$('option')
        waitFor { node.find { it.text() == value } }
        node.find { it.text() == value }.click()
    }
}
