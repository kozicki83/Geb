import helper.Utils

class ReadDate {

    public static void main(String[] args) {

        Date date = Utils.getOffsetDate().format('yyyy-MM-dd').build()
        println date

    }
}
