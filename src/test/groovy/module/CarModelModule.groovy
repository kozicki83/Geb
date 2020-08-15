package module

import form.WiClick
import form.WiSelect
import geb.Module
import groovy.model.FormModel
import model.WiMotoPolicy

class CarModelModule extends Module {
    static content = {
        modelYear { $('select#modelYearSelect').module(WiSelect) }
        brands { $('span', text: 'POPULARNE MARKI') }
        manufacture { String text -> $('div#manufacturePanel span', text: text).module(WiClick) }
        model { value -> $('div#modelSelectPanel span', text: value).module(WiClick) }
        variant { text -> $('div#variantPanel label', text: text).module(WiClick) }
    }

    def fill(WiMotoPolicy policy){
        selectYear(policy.vehicle.year)
        clickManufacture(policy.vehicle.manufacturer)
        selectModel(policy.vehicle.model)
        selectVariant(policy.vehicle.variant)
    }

    def selectYear(String value) {
        modelYear.select(value)
    }

    def clickManufacture(String value) {
        waitFor { manufacture(value) }
        manufacture(value).click()
    }

    def selectModel(String value) {
        waitFor { model(value) }
        model(value).click()
    }

    def selectVariant(String value) {
        waitFor { variant(value) }
        variant(value).click()
    }
}
