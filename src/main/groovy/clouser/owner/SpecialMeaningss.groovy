package clouser.owner

class SpecialMeanings {
    String prop1 = "prop1"

    def clouser = {
        String prop1 = 'inner_prop1'
        println this.class.name

        println this.prop1

        println owner.prop1

        println delegate.prop1

        println prop1

    }
}

def clousre = new SpecialMeanings().clouser
clousre()


prop1 = "PROPERTY"
clousre.delegate = this
clousre()
