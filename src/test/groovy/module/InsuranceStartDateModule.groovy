package module

import form.WiDate
import geb.Module
import model.WiMotoPolicy

class InsuranceStartDateModule extends Module {
    static content = {
        startDate { $('input#startDate').module(WiDate) }
    }

    def fill(WiMotoPolicy policy){
        startDate.value(policy.startDate)
    }
}
