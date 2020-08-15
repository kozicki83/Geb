package pages

import geb.Page
import model.WiMotoPolicy
import module.CarDataModule
import module.CarModelModule
import module.CoOwnersInsuranceHistoryModule
import module.ConsentsModule
import module.InsuranceStartDateModule
import module.NavigationButtonsModule
import module.OwnerAddressModule
import module.OwnerDataModule
import module.OwnersModule
import module.YoungDriverModule

class CalculatorOcAcPage extends Page {
    static url = 'https://www.link4.pl/kalkulator_ubezpieczenia_OC_AC_2/motoFlow.html'
    static at = { $('h1.no\\-margin\\-bottom').text() == 'KALKULATOR OC AC' }

    static content = {
        carModel { module CarModelModule }
        carData { module CarDataModule }
        owners { module OwnersModule }
        ownerData { module OwnerDataModule }
        ownerAddress { module OwnerAddressModule }
        coOwnersInsuranceHistory { module CoOwnersInsuranceHistoryModule }
        youngDriver { module YoungDriverModule }
        insuranceStartDate { module InsuranceStartDateModule }
        consents { module ConsentsModule }
        navigationButtons { module NavigationButtonsModule }
    }

    def fillCarModel(WiMotoPolicy policy) {
        carModel.fill(policy)
    }

    def fillCarData(WiMotoPolicy policy) {
        carData.fill(policy)
    }

    def fillOwners(WiMotoPolicy policy) {
        owners.fill(policy)
    }

    def fillOwnerData(WiMotoPolicy policy) {
        ownerData.fill(policy)
    }

    def fillOwnerAddress(WiMotoPolicy policy) {
        ownerAddress.fill(policy)
    }

    def fillCoOwnersInsuranceHistory(WiMotoPolicy policy) {
        coOwnersInsuranceHistory.fill(policy)
    }

    def fillYoungDriver(WiMotoPolicy policy) {
        youngDriver.fill(policy)
    }

    def fillInsuranceStartDate(WiMotoPolicy policy) {
        insuranceStartDate.fill(policy)
    }

    def selectConsents() {
        consents.selectConsents()
    }

    def clickButtonNext(){
        navigationButtons.buttonNext.click()
    }

}
