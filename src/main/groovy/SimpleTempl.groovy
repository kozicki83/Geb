import groovy.text.SimpleTemplateEngine
import groovy.time.TimeCategory

import java.text.SimpleDateFormat

class SimpleTempl {
    public static void main(String[] args) {
        def engine = new SimpleTemplateEngine()
        Date date = new Date()
//        println date.format('MM')
//        println date.format('dd')
//        println date.format('YY')
        String datt = date.format('YYddMM')
        println datt

        String nameFile = System.currentTimeMillis()
//        1; "LINK4 TU S.A."; 44440; 20190403; "201904030102L4G.txt";
        String test2 = '1;"LINK4 TU S.A.";44440;$plikName; "<% out.print plikName%>L4G.txt";'
        def chang = ["plikName": nameFile]
        def results2 = engine.createTemplate(test2).make(chang)
        println results2


//        2; 2457; 0; 23265; 12855103000; ; 20190211; ; ""; 51; 190211; 12855103000; ""; ""; ""; 0; "201904030102L4G.txt";20190403;
        String bodyFile = '2; 2457; 0; $amout; $dataPay; ; ""; 51; $dataSold; ""; ""; ""; 0; "<% out.print plikName%>L4G.txt";plikName;'
        def chang4 = ["plikName": "DFasdf",
                      "amout": 152900,
                      "dataPay" : datt,
                      "dataSold" : datt]

        def results3 = engine.createTemplate(bodyFile).make(chang4)
        println results3


        3; 1; 23265; 51;



        String text = 'To jest naglowek pliku "$plik"'
        def binding = ["plik": "plik2000"]

        def results = engine.createTemplate(text).make(binding)
        println results
    }
}
