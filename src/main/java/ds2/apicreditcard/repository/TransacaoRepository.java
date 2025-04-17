package ds2.apicreditcard.repository;

import ds2.apicreditcard.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
