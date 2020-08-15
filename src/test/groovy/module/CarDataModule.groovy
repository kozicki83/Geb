package module

import form.WIRadio
import form.WiInput
import form.WiSelect
import geb.Module
import model.WiMotoPolicy

class CarDataModule extends Module {

    static content = {
        insuranceCoverage(wait: true) { text -> $('label[for^="policy.insuranceCoverage"]', text: text).module(WIRadio) }
        lpg { String text -> $('label[for^="lpg"]', text: text).module(WIRadio) }
        rightHandDrive { String text -> $('label[for*="policy.asset.rightHandDrive"]', text: text) }
        currentMileage { $('input#currentMileage').module(WiInput) }
        kmPerYear { $("select#kmPerYear").module(WiSelect) }
        vehicleUsage { $('select#vehicleUsage').module(WiSelect) }
        parkingPlaceSelect(wait: true) { $("select#parkingPlaceSelect").module(WiSelect) }
        vehiclePriorDamages {String text -> $('label[for^="policy.asset.vehiclePriorDamages.id"]', text: text).module(WIRadio) }
        vehicleAbroadUsage { $("select#vehicleAbroadUsage").module(WiSelect) }
        insuredInPolandFromYear { $("select#insuredInPolandFromYear").module(WiSelect) }
        insuredInPolandFromYearInput { $("input#insuredInPolandFromYear").module(WiInput) }
        ownedFromYear(wait: true) { $("input#ownedFromYear").module(WiInput) }
//        hasServiceHistory { module(new WiRadio(name: "hasServiceHistory")) }
//        isModified { module(new WiRadio(name: "vehicleModified")) }
    }


    def fill(WiMotoPolicy policy) {
        insuranceCoverage(policy.vehicle.insuranceCoverage).click()
        lpg(policy.vehicle.lpg).click()
        currentMileage.value(policy.vehicle.vehicleKm)
        kmPerYear.select(policy.vehicle.kmPerYear)
        vehicleUsage.select(policy.vehicle.vehicleUsage)
        parkingPlaceSelect.select(policy.vehicle.parkingKind)
        vehiclePriorDamages(policy.vehicle.vehiclePriorDamages).click()
        vehicleAbroadUsage.select(policy.vehicle.vehicleAbroadUsage)
        insuredInPolandFromYear.select(policy.vehicle.insuredInPolandFromYear)
        ownedFromYear.value(policy.vehicle.ownedFromYear)
    }

    def selectInsuranceCoverage(WiMotoPolicy policy) {
        insuranceCoverage(policy.vehicle.insuranceCoverage).click()
    }

    def installationLpg(WiMotoPolicy policy) {
        lpg(policy.vehicle.lpg).click()
    }

    def steeringWheelOnRight(WiMotoPolicy policy) {
        waitFor(10, 1) { rightHandDrive(policy.vehicle.rightHandDrive).size() != 0 }
        rightHandDrive(policy.vehicle.rightHandDrive).click()
    }

}
