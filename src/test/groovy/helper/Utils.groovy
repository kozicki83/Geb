package helper

import groovy.time.TimeCategory

import java.text.SimpleDateFormat

class Utils {

    static def date

    def curentDate(){
        Date date = SimpleDateFormat.getDateInstance()
    }

    static Date getOffsetDate(Integer offsetYear = 0, Integer offsetMonth = 0, Integer offsetDay = 0) {
        date = new Date()
        use(TimeCategory) {
            date = date + offsetYear.years + offsetMonth.months + offsetDay.days
        }
        return this
    }


    static Date format(String format){
        date = new Date()
        date.format(format)
        return this
    }

    static Date build(){
        return this
    }
}
