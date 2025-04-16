package ds2.apicreditcard.repository;

import ds2.apicreditcard.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
    /*
    Aqui fica a parte para se conectar com o banco de dados e fazer o tudo o que quiser seguindo as normas do JPA,
    tipo no Mysql temos o Select e no JPA existe o find, tem como deixar mais robusto tipo findAll, findBy e etc,
    aqui entra uma grande dinamica ai para ser saber o que usar e o que verificar,
    Para manter um grau de segurança, devemos fazer o DTO ou DAO, entao priorizem usar o repository no Service
     */

    List<Cartao> findAllByCartao_idAndAndEmail(Long CartaoId, String email); // lista todos os cartoes que estiver com o id do cartao e o email correspondente(nao sei se esta certo)
    List<Cartao> findAllByEmail(String email); // lista todos os cartoes do email que estiver sendo enviado
}

