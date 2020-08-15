package clouser.delegate

class Person {
    String name
    def pretty = { "Ma name is $name" }

    String toString() {
        pretty()
    }
}
