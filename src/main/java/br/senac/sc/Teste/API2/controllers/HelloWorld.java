package br.senac.sc.Teste.API2.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorld {

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Olá Mundo");
    }
    @GetMapping("/parImpar")
    public ResponseEntity<String> parImpar(@RequestParam int numero){
        if ((numero % 2) == 0){
            return ResponseEntity.ok("Par");
        }
        return ResponseEntity.ok("Impar");
    }
}
