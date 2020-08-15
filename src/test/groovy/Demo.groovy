import spock.lang.Specification

class Demo extends Checking {

    def test() {
        given:
        int x = 10
        int y = 28

        when:
        int z = x * y

        then:
        check(z)
    }
}
