package helper

import geb.Browser
import geb.spock.GebReportingSpec
import groovy.transform.SelfType

@SelfType(GebReportingSpec)
trait BaseMethods {
    /** Declaration compatible with GebReportingSpec. */
    abstract Browser getBrowser()
}