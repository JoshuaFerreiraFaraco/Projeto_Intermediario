package br.net.joshua.spring_exemplo.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SobreService {
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("nome", "Joshua Ferreira Faraco");
        sobre.put("projeto", "Verificador de Carros por meio da Tabela FIPE");
        return sobre;
    }
}


