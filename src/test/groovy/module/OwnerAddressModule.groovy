package module

import form.WiInput
import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class OwnerAddressModule extends Module {
    static content = {
        zipCode { $('input#zipCodeInput').module(WiInput) }
        selectCity { $('select#selectCity').module(WiSelect) }
        ownerPhoneType { $('select#ownerPhoneType').module(WiSelect) }
        homePhonePrefix { $('input#poleHomePhonePrefix').module(WiInput) }
        homePhoneNumber { $('input#poleHomePhoneNumber').module(WiInput) }
        mobilePhoneNumber { $('input#poleMobilePhoneNumber').module(WiInput) }
    }

    def fill(WiMotoPolicy policy) {
        zipCode.value(policy.contact.homeAddress.zipCode)
        selectCity.select(policy.contact.homeAddress.city)
        if (policy.contact.homeAddress.phoneType == 'stacjonarny') {
            ownerPhoneType.select(policy.contact.homeAddress.phoneType)
            homePhonePrefix.value(policy.contact.homeAddress.homePhonePrefix)
            homePhoneNumber.value(policy.contact.homeAddress.homePhoneNumber)
        } else {
            mobilePhoneNumber.value(policy.contact.homeAddress.mobilePhoneNumber)
        }
    }
}
