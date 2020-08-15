package module

import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class CoOwnersInsuranceHistoryModule extends Module {
    static content = {
//        coOwnersPolicyContact0.
        tplInsuranceYearsCount { $('select#coOwnersPolicyContact0\\.tplInsuranceYearsCount\\.id').module(WiSelect) }
        acInsuranceYearsCount { $('select#coOwnersPolicyContact0\\.acInsuranceYearsCount\\.id').module(WiSelect) }
        tplClaimsCountLastThreeYearsCoOwner { $('select#tplClaimsCountLastThreeYearsCoOwner0').module(WiSelect) }
        acClaimsCountLastThreeYearsCoOwner { $('select#acClaimsCountLastThreeYearsCoOwner0').module(WiSelect) }
    }

    def fill(WiMotoPolicy policy) {
        tplInsuranceYearsCount.select(policy.coOwner.tplInsuranceYearsCount)
        acInsuranceYearsCount.select(policy.coOwner.acInsuranceYearsCount)
        tplClaimsCountLastThreeYearsCoOwner.select(policy.coOwner.tplClaimsCountLastThreeYearsMainDriver)
        acClaimsCountLastThreeYearsCoOwner.select(policy.coOwner.acClaimsCountLastThreeYearsMainDriver)
    }
}
