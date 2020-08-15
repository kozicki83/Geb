package form

import geb.module.Select

class WiSelect extends Select {

    void select(String option) {
        waitFor { hasAvailableOption(option) }
        navigator.children('option').find { it.text().trim() == option }.click()
    }

    boolean hasAvailableOption(String option) {
        navigator.children('option').find { it.text().trim() == option }
    }
}
