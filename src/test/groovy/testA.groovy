import model.*
import pages.CalculatorOcAcPage
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class testA extends OpenPageWiSpec {

    @Shared
    Vehicle vehicle
    @Shared
    WiMotoPolicy policy
    @Shared
    Contact contact
    @Shared
    Contact coOwner


    def setupSpec() {
        contact = WiContactBuilder.createDefault().build()
        coOwner = WiContactBuilder.createDefault().build()
        vehicle = WiVehicleBuilder.createDefault().withValue(
                lpg: 'Nie',
                rightHandDrive: 'Tak',).build()
        policy = WIMotoPolicyBuilder.createDefault().withValue(
                startDate: '2019-06-10',
                vehicle: vehicle,
                contact: contact,
                coOwner: coOwner).build()
    }


    def "test"() {
        when:
        openPage()
        at(CalculatorOcAcPage).with {
            fillCarModel(policy)
            fillCarData(policy)
            fillOwners(policy)
            fillOwnerData(policy)
            fillOwnerAddress(policy)
            fillCoOwnersInsuranceHistory(policy)
//            fillYoungDriver(policy)
//            fillInsuranceStartDate(policy)
//            selectConsents()
//            clickButtonNext()
        }

        then:
//        at YoursOfferPage
        withAlert(wait: true) { at(CalculatorOcAcPage).carData.vehicleUsage.select('Nauka jazdy') } == 'Aby zakupić polisę dla wybranego sposobu użytkowania skontaktuj się z konsultantem Link4.'
        true

        when:
        browser.go "http://gebish.org"

        then:
        true

    }

}
