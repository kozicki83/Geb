class test {
    public static void main(String[] args) {

        def x = 0
        (1..10).each { x+=it}
        println(x)

        def person = new Person().with {
            name = "Lalka"
        }

        println person

    }
}
