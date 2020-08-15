import model.Contact
import model.WiContactBuilder

class ParallelTest extends OpenPageWiSpec {

    def setupSpec() {
        Contact contact = WiContactBuilder.createDefault().build()
    }

    def "test1"() {
        when:
        openPage()

        then:
        true
    }

    def "test2"() {
        when:
        openPage()

        then:
        true
    }

    def "test3"() {
        when:
        openPage()

        then:
        true
    }

    def "test4"() {
        when:
        openPage()

        then:
        true
    }

    def "test5"() {
        when:
        openPage()

        then:
        true
    }
}
