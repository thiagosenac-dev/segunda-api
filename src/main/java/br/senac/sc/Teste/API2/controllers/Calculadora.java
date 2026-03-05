package br.senac.sc.Teste.API2.controllers;
import br.senac.sc.Teste.API2.dtos.CalculadoraResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
@RequestMapping("/calculadora")
public class Calculadora {

    Scanner scan = new Scanner(System.in);

    @GetMapping("/somar")
    public ResponseEntity<CalculadoraResponseDTO> somar(
            @RequestParam double num1,
            @RequestParam double num2){
        CalculadoraResponseDTO resultado = new CalculadoraResponseDTO();
        resultado.setResultado(num1 + num2);

        return ResponseEntity.ok(resultado);
    }
    @GetMapping("/subtrair")
    public ResponseEntity<Double> subtrair(
            @RequestParam double num1,
            @RequestParam double num2){
        double resp2;
        resp2 = num1 - num2;
        return ResponseEntity.ok(resp2);
    }
    @GetMapping("/dividir")
    public ResponseEntity<Double> dividir(
            @RequestParam double num1,
            @RequestParam double num2){
        double resp3;
        resp3 = num1 / num2;
        return ResponseEntity.ok(resp3);
    }
    @GetMapping("/multiplicar")
    public ResponseEntity<Double> multiplicar(
            @RequestParam double num1,
            @RequestParam double num2){
        double resp4;
        resp4 = num1 * num2;
        return ResponseEntity.ok(resp4);
    }

}
