package model

import common.BaseBuilder

class WiContactBuilder extends BaseBuilder<Contact, WiContactBuilder> {

    static createDefault() {
        WiContactBuilder c = new WiContactBuilder()
        c.obj = new Contact(
                firstName: 'Asdsfa',
                name: 'Bsdfasd',
                birthDate: '1985-05-06',
                gender: 'Mężczyzna',
                drivingExperienceYear: '2010',
                tplInsuranceYearsCount: 'Brak ubezpieczenia',
                acInsuranceYearsCount: 'Brak ubezpieczenia',
                tplClaimsCountLastThreeYearsMainDriver: '0',
                acClaimsCountLastThreeYearsMainDriver: '0',
                homeAddress: new Address(zipCode: '40-001', city: 'Katowice, pow. Katowice', phoneType: 'komórkowy', mobilePhoneNumber: '998784066', homePhonePrefix: '32', homePhoneNumber: '6660506'),
                email: 'ttedk@lpo.pl'
        )
        return c
    }

    WiContactBuilder withHomeAddress(Address homeAddress){
        obj.homeAddress = homeAddress
        return this
    }

    WiContactBuilder withBirthDate(dateSpec) {
        Date date
        if (dateSpec instanceof Date) {
            date = (Date) dateSpec
        } else if (dateSpec instanceof Number) {
            Date d = new Date()
            d.set(year: Calendar.getInstance().get(Calendar.YEAR) + (Number) dateSpec.intValue(), date: 1)
            date = d
        } else {
            throw IllegalArgumentException("sfs")
        }
        obj.birthDate = date.format("dd/MM/yyyy")
        return this
    }

    private generatePesel() {
        int count = 0
        for (boolean unique = false; !unique;) {
            obj.pesel = Utils.generatePesel(Integer.parseInt(obj.birthDate.substring(6, 10)),
                    Integer.parseInt(obj.birthDate.substring(3, 5)),
                    Integer.parseInt(obj.birthDate.substring(0, 2)),
            obj.gender == 'Kobieta')
            unique = DBUtils.isIdentifierUnique('Pesel', obj.pesel)
            if(unique){
                return obj.pesel
            }else {
                count += 1
                Thread.sleep(25)
                if(count > 200) throw new Exception("Failed to generate a unique identifier")
            }
        }
    }

    private generateRegon(){
        for (boolean unique = false; !unique;){
            obj.regon = Utils.generateRegon9()
            unique = BDUtils.isIdentifireUnique('Regon', obj.regon)
        }
    }

}
