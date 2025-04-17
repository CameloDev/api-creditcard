package ds2.apicreditcard.entity;

import ds2.apicreditcard.model.CategoriaTransacao;
import ds2.apicreditcard.model.StatusTransacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "transacoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transacao_id;

    @ManyToOne
    @JoinColumn(name = "cartao_id", nullable = false)
    private Cartao cartao;

    private float valor;
    private LocalDateTime data_transacao;
    private String estabelecimento;

    @Column(name = "categoria",nullable = false)
    private CategoriaTransacao categoriaTransacao;

    @Column(name = "status",nullable = false)
    private StatusTransacao statusTransacao;



}
