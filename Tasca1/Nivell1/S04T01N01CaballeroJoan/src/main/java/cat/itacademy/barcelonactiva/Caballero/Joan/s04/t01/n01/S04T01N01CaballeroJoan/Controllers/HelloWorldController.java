package cat.itacademy.barcelonactiva.Caballero.Joan.s04.t01.n01.S04T01N01CaballeroJoan.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }

    @GetMapping("/HelloWorld2")
    public String saluda2(@PathVariable(required = false) String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven.";
    }
}

// https://www.baeldung.com/spring-optional-path-variables
// https://www.youtube.com/watch?v=OROTCvW1lZE