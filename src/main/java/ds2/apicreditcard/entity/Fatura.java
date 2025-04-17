package ds2.apicreditcard.entity;

import ds2.apicreditcard.model.StatusFatura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "faturas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fatura_id;

    @ManyToOne
    @JoinColumn(name = "cartao_id", nullable = false)
    private Cartao cartao;

    private Float valor_total;

    private LocalDate data_vencimento;
    private LocalDate data_fechamento;

    @Column(name = "status",nullable = false)
    private StatusFatura statusFatura;

}
