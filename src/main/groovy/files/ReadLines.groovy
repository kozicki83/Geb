package files

class ReadLines {

    static void main(String[] args) {
        File file = new File('F:\\plik\\190506IB.txt')
        def line, noOfLine = 0
//        file.withReader { reader ->
//            while ((line = reader.readLine()) != null) {
//                println("${line}")
//                noOfLine++
//            }
//        }

//        file.eachLine { lin -> println(lin) }
//        file.clone()


//        def list = new File('F:\\plik\\190506IB.txt')  //.collect() { it + "44444" }
//        list.each { println(it)}

//        def list = new File('F:\\plik\\190506IB.txt').text  //.collect() { it + "44444" }
//        println(list)

        // UTF-16
        // ASCII
        // UTF-8
        file.withReader('UTF-8') {
            reader ->
                def line1
                while ((line1 = reader.readLine()) != null) {
                    println(line1 + "żźłdgsdgsdf")
                }
        }


    }
}
