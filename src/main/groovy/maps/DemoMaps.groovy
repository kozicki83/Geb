package maps

class DemoMaps {

    static void main(String[] args) {

        def installments = [:]

        installments[1] = [ "number": 12, "kwota": 2598, "status": "Opłacona"]
        installments[2] = [ "number": 13, "kwota": 3000, "status": "Dopłacona"]

        println: installments

    }
}
