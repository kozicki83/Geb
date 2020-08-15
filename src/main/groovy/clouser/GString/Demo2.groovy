package clouser.GString

class Demo2 {

    public static void main(String[] args) {
        def sam = new Person(name: 'Sam')
        def lucy = new Person(name: 'Lucy')

        def p = sam
        def gs = "Name: ${-> p}"
        assert gs == "Name: Sam"
        p = lucy
        assert gs == "Name: Sam"
        sam.name = 'Lucy'
        assert gs == "Name: Lucy"

    }
}
