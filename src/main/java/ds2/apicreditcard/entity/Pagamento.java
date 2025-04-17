package ds2.apicreditcard.entity;

import ds2.apicreditcard.model.MetodoPagamento;
import ds2.apicreditcard.model.StatusPagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "pagamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagamento_id;

    @ManyToOne
    @JoinColumn(name = "fatura_id", nullable = false)
    private Fatura fatura;

    private float valor;
    private LocalDate data_pagamento;

    private MetodoPagamento metodoPagamento; // isso aqui vai juntar com External Payment

    private StatusPagamento statusPagamento;

}
