package model

import common.BaseBuilder

class WiVehicleBuilder extends BaseBuilder<Vehicle, WiVehicleBuilder> {

    static WiVehicleBuilder createDefault() {
        WiVehicleBuilder v = new WiVehicleBuilder()
        v.obj = new Vehicle(
                year: '2014',
                vehicleType: 'OSOBOWE/TERENOWE',
                manufacturer: 'FIAT/F.A.POL.',
                model: '500',
                variant: '500 1.2 Pop',
                insuranceCoverage: 'OC+AC',
                lpg: 'Nie',
                rightHandDrive: 'Nie',
                vehicleKm: '150000',
                kmPerYear: '5,000 - 9,999 km',
                vehicleUsage: 'Wyłącznie prywatnie (w tym dojazdy do pracy)',
                parkingKind: 'Teren zamknięty / Garaż wspólny',
                vehiclePriorDamages: 'Nie',
                vehicleAbroadUsage: 'Brak / do jednego miesiąca',
                insuredInPolandFromYear: "2019",
                ownedFromYear: "2019",
                licencePlate: "WB14875",
                vin: "ertrtwe465345645",
        )
        return v
    }
}
