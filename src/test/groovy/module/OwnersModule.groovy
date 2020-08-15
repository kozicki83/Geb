package module

import form.WIRadio
import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class OwnersModule extends Module {
    static content = {
        isOneOwner1 { $('label[for="isOneOwner"]').module(WIRadio) }
        isOneOwner2 { $('label[for="isOneOwner2"]').module(WIRadio) }
        isMainOwner1 { String text -> $('label[for^="isMainOwner"]', text: text).module(WIRadio) }
        isMainOwner2 { $('label[for="isMainOwner2"]').module(WIRadio) }
        ownerCount { $('select#ownerCount').module(WiSelect) }
    }

    def fill(WiMotoPolicy policy) {
        if (policy.howManyAreOwners == 'Jeden') {
            isOneOwner1.click()
        } else {
            isOneOwner2.click()
            isMainOwner1(policy.whoIsMainOwner).click()
            ownerCount.select(policy.numberOwners)
        }
    }
}
