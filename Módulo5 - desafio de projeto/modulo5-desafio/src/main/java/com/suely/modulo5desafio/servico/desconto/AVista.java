package com.suely.modulo5desafio.servico.desconto;

import com.suely.modulo5desafio.servico.Desconto;

public class AVista implements Desconto {

    
    public Double calcularDesconto(Double valor){

        return valor*10/100;
        
    }
    
}
