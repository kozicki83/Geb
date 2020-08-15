package form

import geb.navigator.Navigator

import java.text.SimpleDateFormat

class WiDate extends BaseInput{

    String  date
    Navigator value(String value){
        date = value
        if(date =~/[\d]{4}\\/[\d]{2}\\/[\d]{2}/){
            date = new SimpleDateFormat('yyyy/MM/dd').parse(value).format('yyyy-mm-dd')
        }
        waitFor { navigator }
        if (navigator.text() != date) {
            clearData()
            navigator << date
        }
    }
}
