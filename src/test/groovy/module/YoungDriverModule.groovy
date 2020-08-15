package module

import form.WIRadio
import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class YoungDriverModule extends Module {
    static content = {
        existsYoungDriver { String text -> $('label[for="existsYoungDriver"]', text: text).module(WIRadio) }
        youngestDriverAge { $('select#youngestDriverAge').module(WiSelect) }
    }

    def fill(WiMotoPolicy policy) {
        if (policy.youngDriver) {
            existsYoungDriver(policy.youngDriver).click()
            if (policy.youngDriver == 'Tak') {
                youngestDriverAge.select(policy.youngestDriverAge)
            }
        }
    }
}
