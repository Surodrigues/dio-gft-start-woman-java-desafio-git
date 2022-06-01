package com.suely.modulo5desafio.entidade;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Pedido {

    private Long id;
    private Cliente cliente;
    private Double valorDaCompra;
    private TipoDesconto desconto;
        
    
}
