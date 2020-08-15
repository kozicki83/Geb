package module

import form.WIRadio
import form.WiInput
import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class OwnerDataModule extends Module {

    static content = {
        firstName { $('input#mainDriver\\.contact\\.firstName').module(WiInput) }
        name { $('input#mainDriver\\.contact\\.name').module(WiInput) }
        driverDateOfBirth { $('input#driverDateOfBirth').module(WiInput) }
        gender { String text -> $('label[for^="mainDriver\\.contact\\.person\\.gender\\.id"]', text: text).module(WIRadio) }
        drivingExperienceYear { $('input#drivingExperienceYear').module(WiInput) }
        tplInsuranceYearsCountMainDriver { $ ("select#mainDriverPolicyContact\\.tplInsuranceYearsCount\\.id").module(WiSelect) }
        acInsuranceYearsCountMainDriver { $ ("select#mainDriverPolicyContact\\.acInsuranceYearsCount\\.id").module(WiSelect) }
        tplClaimsCountLastThreeYearsMainDriver { $ ("select#tplClaimsCountLastThreeYearsMainDriver").module(WiSelect) }
        acClaimsCountLastThreeYearsMainDriver { $ ("select#acClaimsCountLastThreeYearsMainDriver").module(WiSelect) }
    }

    def fill(WiMotoPolicy policy){
        firstName.value(policy.contact.firstName)
        name.value(policy.contact.name)
        driverDateOfBirth.value(policy.contact.birthDate)
        gender(policy.contact.gender).click()
        drivingExperienceYear.value(policy.contact.drivingExperienceYear)
        tplInsuranceYearsCountMainDriver.select(policy.contact.tplInsuranceYearsCount)
        acInsuranceYearsCountMainDriver.select(policy.contact.acInsuranceYearsCount)
        tplClaimsCountLastThreeYearsMainDriver.select(policy.contact.tplClaimsCountLastThreeYearsMainDriver)
        acClaimsCountLastThreeYearsMainDriver.select(policy.contact.acClaimsCountLastThreeYearsMainDriver)
    }
}
