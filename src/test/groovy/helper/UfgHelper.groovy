package helper

import groovy.time.TimeCategory

import java.text.SimpleDateFormat

class UfgHelper {

    private static final String DATE_PATTERN = /(\d{4}-\d{2}-\d{2})/
    private static final String DATE_FORMAT = "yyyy-MM-dd"
    private static final String UFG_REPONSE_TEMPLATE_BASE_PATH = "src/test/resources/"


    String prepareVehicleInsuranceHistory(String vin, String xmlTemplate, def valuesMap = null) {
        def content = getResponseContent("${UFG_REPONSE_TEMPLATE_BASE_PATH}/insuranceHistori/${xmlTemplate}")
//        return prepareVehicleInsuranceHistoryContent(vin, content, valuesMap)
    }

    private String getResponseContent(String templatePath, boolean withReferanceDate = true) {
        def currentDay = new Date().clearTime()
        def responseTemplateFile = new File(templatePath)
        def respnseBuff = new StringBuffer()

        def referenceDate = null
        responseTemplateFile.eachLine { line, number ->
            if (withReferanceDate && number == 1) {
                referenceDate = getReferenceDate(line)
                return
            }

            def m = line =~ DATE_PATTERN
            if (withReferanceDate) {
                while (m.find()) {
                    def oldDate = new SimpleDateFormat(DATE_FORMAT).parse(m.group())
                    Date newDate = getNewDate(currentDay, referenceDate, oldDate)
                    m.appendReplacement(respnseBuff, newDate.format(DATE_FORMAT))
                }
            }
            m.appendTail(respnseBuff)
            respnseBuff.append("\n")
        }
        return  respnseBuff.toString()
    }

    private Date getNewDate(def currentDay, def referenceDate, def oldDate) {
        def daysBetween = null
        use(TimeCategory) {
            daysBetween = (referenceDate - oldDate).days
        }
        def newDate = currentDay - daysBetween
        return newDate
    }

    private Date getReferenceDate(String line) {
        def m = line =~ DATE_PATTERN
        if (m.find()) {
            return new SimpleDateFormat(DATE_FORMAT).parse(m.group())
        } else {
            throw new RuntimeException("Missing date reference")
        }
    }
}
