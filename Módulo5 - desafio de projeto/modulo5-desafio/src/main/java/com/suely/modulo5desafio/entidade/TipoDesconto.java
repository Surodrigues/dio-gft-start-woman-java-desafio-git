package com.suely.modulo5desafio.entidade;

import com.suely.modulo5desafio.servico.Desconto;
import com.suely.modulo5desafio.servico.desconto.AVista;
import com.suely.modulo5desafio.servico.desconto.Crediario;
import com.suely.modulo5desafio.servico.desconto.Dinheiro;

public enum TipoDesconto {

    DINHEIRO {
        @Override
        public Desconto obterDesconto() {
            return new Dinheiro();
        }
    },
    A_VISTA {
        @Override
        public Desconto obterDesconto() {
            return new AVista();
        }
    },
    CREDIARIO {
        @Override
        public Desconto obterDesconto() {
            return new Crediario();
        }
    };
    
    
    
    public abstract Desconto obterDesconto();



}
