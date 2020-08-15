package clouser

class DemoClouser {

    static def closureWithTwoArgAndDefaultValue = { int a, int b = 8 -> a + b }

    public static void main(String[] args) {
        def listener = { e -> println "Test przekazania parametru: $e" }
        listener(5)
        assert listener instanceof Cloneable

        // explicit
        println closureWithTwoArgAndDefaultValue(5)
        println closureWithTwoArgAndDefaultValue(8, 8)

        // implicit
        def greetingIt = { println "Hello, $it!" }
        def greetingVar = { var -> println "Hello, $var!" }
        greetingIt('Daniel')
        greetingVar('Daniel')

        // zabezpieczenie clousera przed przyjmowaniem parametrów
        def magicNumber = { -> 45 }
//        magicNumber(50)

        // var
        def contactName = { String... arg -> arg.join('') }
        println contactName('Da', 'ni', 'el')
        def contactName2 = { String[] argg -> argg.join() }
        println contactName2("Ford", "Mondeo")
        def multiContactName = { int n, String... arg -> arg.join() * n }
        println multiContactName(4, "Policy")
    }
}
