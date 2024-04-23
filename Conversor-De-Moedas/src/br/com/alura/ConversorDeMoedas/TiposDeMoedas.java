package br.com.alura.ConversorDeMoedas;

import java.util.Map;

// Classe para representar a estrutura do JSON com as taxas de câmbio
class TiposDeMoedas {
    private Map<String, Double> cotacao;

    public Map<String, Double> getCotacao() {
        return cotacao;
    }
}