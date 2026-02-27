package br.senac.sc.Teste.API2.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
@RequestMapping("calculadora")
public class Calculadora {

    Scanner scan = new Scanner(System.in);

    @GetMapping("/soma")
    public ResponseEntity<Double> somar(@RequestParam double num1, @RequestParam double num2){
        double resp;
        resp = num1 + num2;
        return ResponseEntity.ok(resp);
    }
    @GetMapping("/subtracao")
    public ResponseEntity<Double> subtrair(@RequestParam double num1, @RequestParam double num2){
        double resp2;
        resp2 = num1 - num2;
        return ResponseEntity.ok(resp2);
    }
    @GetMapping("/divisao")
    public ResponseEntity<Double> divisao(@RequestParam double num1, @RequestParam double num2){
        double resp3;
        resp3 = num1 / num2;
        return ResponseEntity.ok(resp3);
    }
    @GetMapping("/multiplicacao")
    public ResponseEntity<Double> multiplicacao(@RequestParam double num1, @RequestParam double num2){
        double resp4;
        resp4 = num1 * num2;
        return ResponseEntity.ok(resp4);
    }

}
