package model

import groovy.transform.AutoClone

@AutoClone
class Contact {

    String firstName
    String name
    String pesel
    String birthDate
    String gender
    String drivingExperienceYear
    String tplInsuranceYearsCount
    String acInsuranceYearsCount
    String tplClaimsCountLastThreeYearsMainDriver
    String acClaimsCountLastThreeYearsMainDriver

    Address homeAddress
    String email

    // company
    String regon
}
