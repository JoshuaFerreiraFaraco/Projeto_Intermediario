package br.net.joshua.spring_exemplo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.net.joshua.spring_exemplo.services.SobreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class FipeController {
    RestTemplate restTemplate = new RestTemplate();
    String marca;
    String carroGLOBAL;
    String ano;

    @Autowired
    SobreService sobreService;

    @GetMapping("/sobre")
    public HashMap<String, String> sobre() {
        return sobreService.sobre();
    }

    @GetMapping("/getMarca")
    public String getMarca() {
        String url = "https://fipe.parallelum.com.br/api/v2/cars/brands";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "Lista de Marcas: " + response.getBody();
    }

    @GetMapping("/getCarro/{marcaResp}")
    public String getCarro(@PathVariable String marcaResp) {
        marca = marcaResp;
        String url = "https://fipe.parallelum.com.br/api/v2/cars/brands/"+marca+"/models";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "Lista de Carros: " + response.getBody();
    }

    @GetMapping("/getAno/{carroResp}")
    public String getAno(@PathVariable String carroResp) {
        carroGLOBAL = carroResp;
        String url = "https://fipe.parallelum.com.br/api/v2/cars/brands/"+marca+"/models/"+carroGLOBAL+"/years";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "Lista de Anos do Carro: " + response.getBody();
    }

    @GetMapping("/getFipe/{anoResp}")
    public String getFipe(@PathVariable String anoResp) {
        ano = anoResp;
        String url = "https://fipe.parallelum.com.br/api/v2/cars/brands/"+marca+"/models/"+carroGLOBAL+"/years/"+anoResp;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "Tabela FIPE: " + response.getBody();
    }


    //API do Fipe apenas tem requisicoes GET, o que eh uma tristeza,
    //dai eu fiz esse codigo para mostrar como seria se fosse por um metodo POST
    //Por exemplo a url ficaria:
    //http://localhost:8080/postFipe?vehicleType="cars"&brandId=25&modelId=1241&yearId=1998-1
    @PostMapping("/postFipe")
    public String postFipe(@RequestBody String fipeDado) {
        String url = "https://fipe.parallelum.com.br/api/v2/cars/brands";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return "Tabela FIPE processada: " + response.getBody();
    }
}


