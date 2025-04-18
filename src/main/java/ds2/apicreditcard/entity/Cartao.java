package ds2.apicreditcard.entity;

import ds2.apicreditcard.model.BandeiraCartao;
import ds2.apicreditcard.model.StatusCartao;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "cartoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartao_id;

    /*
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client
    // ONDE VAI PRECISAR DO MODULO ACCOUNT
     */
    private String numero;
    private String nome_impresso;
    private String cvv;
    private LocalDate data_validade;
    private Float limite_total;
    private Float limite_disponivel;

    @Column(name = "bandeira",nullable = false)
    private BandeiraCartao bandeiraCartao;

    @Column(name = "status",nullable = false)
    private StatusCartao statusCartao;

    private Boolean aprovacao_automatica;
    private Boolean eh_adicional;
    private LocalDate data_emissao;

    /*
    Explicando bem basico, aqui é meio que a tabela do banco de dados,
    mas de forma complexa é a base da api, tudo que criar modificar e deletar vai vir apartir dele,
     a verificação e etc, o entity é uma lista basica de manter que os dados estao sendo enviados certos
     e antes de mandar para o banco de dados que seria a função final, ele verifica se aquilo funciona nele
  */
}
