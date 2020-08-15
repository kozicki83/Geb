package module

import form.WiClick
import geb.Module

class NavigationButtonsModule extends Module {
    static content = {
        buttonNext { $("div p", text: 'DALEJ').module(WiClick) }
    }
}
