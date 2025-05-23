package ds2.apicreditcard.entity;

import ds2.apicreditcard.model.AcaoHistorico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "historico_cartoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HistoricoCartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historico_id;

    @ManyToOne
    @JoinColumn(name = "cartao_id", nullable = false)
    private Cartao cartao;

    @Column(name = "acao",nullable = false)
    private AcaoHistorico acaoHistorico;


    private String detalhes;

    private LocalDate data_alteracao;

}
