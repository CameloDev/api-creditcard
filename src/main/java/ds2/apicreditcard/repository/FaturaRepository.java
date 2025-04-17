package ds2.apicreditcard.repository;

import ds2.apicreditcard.entity.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}
