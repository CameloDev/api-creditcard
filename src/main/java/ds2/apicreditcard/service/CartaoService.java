package ds2.apicreditcard.service;

import ds2.apicreditcard.entity.Cartao;
import ds2.apicreditcard.repository.CartaoRepository;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {
    private final CartaoRepository cartaoRepository;
    public CartaoService(CartaoRepository cartaoRepository) {
        this.cartaoRepository = cartaoRepository;
    }
    /*
    Aqui fica toda a logica do que sera no controller,
    para melhor explicação é tipo um POO,
    o service é uma classe de varios voids que tratam a logica do projeto
    e o controller é a main, onde trata todos os endpoints para executar os services com a logica
     */

    public Cartao CadastrarCartao(Cartao cartao) {
        cartao = new Cartao();
        return cartao;
    }
    public Cartao BuscarCartao(Cartao cartao) {
        return cartao;
    }
    public Cartao AlterarCartao(Cartao cartao) {
        return cartao;
    }
    /*
     São exemplos, mas cada void desse tem que ter um grau de verificação e colocar apenas no controller acaba deixando o projeto complexo
     */
}
