package pages

import geb.Page

class SearchResultTabel extends Page {
    static at = { $('h1.no\\-margin\\-bottom').text() == 'KALKULATOR OC AC' }


    static content = {

    }

    void selectRow(String... params) {
        for (row in $('#searchResul\\|TableNamedate')) {
            String rowText = row.text()
            if (continusAll(rowText, params)){
                row.click()
                return
            }
        }
        throw  new RuntimeException("Row not found for " + params)
    }

    private boolean continusAll(String input, String... params){
        for(param in params){
            if(!input.contains(param)){
                return false
            }
        }
        return true
    }

}
