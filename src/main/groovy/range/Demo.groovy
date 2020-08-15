package range

class Demo {

    public static void main(String[] args) {

        def myIntRage = 6..10
        println "Class is: ${myIntRage.class}"
        println "Implements List?: ${myIntRage instanceof java.util.List}"
        println "Contents are: ${myIntRage}"
        println "First item: ${myIntRage[0]}"
        println "Second item: ${myIntRage[1]}"
        println "Third item: ${myIntRage[2]}"
        println "Fourth item: ${myIntRage[3]}"
        println "Fifth item: ${myIntRage[4]}"

        println "Size is: ${myIntRage.size()}"
        println "Item at index 2 is: ${myIntRage.get(2)}"
        println "Does it contain 8?: ${myIntRage.contains(8)}"
        println "Does it contain 11?: ${myIntRage.contains(11)}"
        println "Does it contain 7 and 10?: ${myIntRage.containsAll([7, 10])}"
        println "Does it contain 9 and 12?: ${myIntRage.containsAll([9, 12])}"
        println "What is the index of the item with vaue 7?: ${myIntRage.indexOf(7)}"
        println "Is the list empty?: ${myIntRage.isEmpty()}"


        println "Does **********: ${myIntRage.contains(9)}"

        BigDecimal val = 125.05

        if (val + 0.04 > val && val > val - 0.04) {
            println "66666666666" +  val
        }else {
            println "444444444444" +  val
        }

    }
}
