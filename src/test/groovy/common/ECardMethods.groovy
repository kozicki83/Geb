package common

import helper.BaseMethods

trait ECardMethods implements BaseMethods {

    def sendPaymentConfirmation(String policyNr, BigDecimal amount) {
        def url = new URL(browser.rowConfig.eCardPaymentConfirmationUrl)
        def conn = url.openConnection()
        conn.setDoOutput(true)
        def writer = new OutputStreamWriter(conn.getOutputStream())
        String params = "fdgsdfgsfdgsd"
        writer.write(params)
        writer.flush()
    }
}