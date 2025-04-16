package ds2.apicreditcard.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "card")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartao_id;
    private String numero;
    private String titular;
    private String email;
    private String telefone;
 /*
    Explicando bem basico, aqui é meio que a tabela do banco de dados,
    mas de forma complexa é a base da api, tudo que criar modificar e deletar vai vir apartir dele,
     a verificação e etc, o entity é uma lista basica de manter que os dados estao sendo enviados certos
     e antes de mandar para o banco de dados que seria a função final, ele verifica se aquilo funciona nele
  */
}
