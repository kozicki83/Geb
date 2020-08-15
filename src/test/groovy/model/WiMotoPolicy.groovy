package model

class WiMotoPolicy extends BasePolicy {

    String insuranceCoverage
    String startDate
    String endDate
    String insuranceFormula

    String policyNo
    Vehicle vehicle
    Contact contact

    String howManyAreOwners
    String whoIsMainOwner
    String numberOwners

    Contact coOwner
    String youngDriver
    String youngestDriverAge
}
