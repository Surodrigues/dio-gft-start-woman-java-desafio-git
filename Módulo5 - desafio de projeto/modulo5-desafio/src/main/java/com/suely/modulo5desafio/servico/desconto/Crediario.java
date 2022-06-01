package com.suely.modulo5desafio.servico.desconto;

import com.suely.modulo5desafio.servico.Desconto;

public class Crediario implements Desconto {
    
    public Double calcularDesconto(Double valor){

        return valor*5/100;
        
    }
}
