package java11;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Demo {

    public static void main(String[] args) throws IOException, InterruptedException, ScriptException {

        // Strings
//        var chant = "   USA!   \n";
        var chant = "   USA!  ";
        var blank = "   1   3   3";
        System.out.println("dfasdf " + chant.repeat(3));
        System.out.println("Is blank: " + chant.isBlank());
        System.out.println("Is blank 2: " + blank.isBlank());

        System.out.println("Is strip: " + chant.strip());
        System.out.println("Is strip 2:" + blank.strip() + "1");

        String val = "Tekst\ndo\npociecia";

        val.lines().forEach(System.out::println);

        var multiline = "This\r\nis a\r\nmultiline\r\nstring";
        multiline.lines()
                // we now have a `Stream<String>`
//                .map(line -> "// " + line)
                .forEach(System.out::println);

        // lambda

        // hhtp client

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://wwww.onet.pl"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        // Javascript
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('help i am dying!!');");
    }
}
