import java.lang.reflect.Array

class ReadFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Dante\\test\\data.txt")
        List list = []
        file.eachLine() {
            println it.split()
            list << it.split()
        }
        list.each {
            println it[0]
            println it[1]
        }

    }
}
