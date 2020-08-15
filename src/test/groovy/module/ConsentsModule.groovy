package module

import form.WiClick
import geb.Module

class ConsentsModule extends Module {
    static content = {
        nodeToConsents { $('input[id^="consentPVO.calculationPageConsents"][type="checkbox"]') }
    }

    def selectConsents(){
        (0..nodeToConsents.size()-1).each {nodeToConsents[it].module(WiClick).click()}
    }
}
