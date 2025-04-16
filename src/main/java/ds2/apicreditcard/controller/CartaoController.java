package ds2.apicreditcard.controller;

import ds2.apicreditcard.entity.Cartao;
import ds2.apicreditcard.repository.CartaoRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartao")
public class CartaoController {
    private final CartaoRepository cartaoRepository;

    public CartaoController(CartaoRepository cartaoRepository) {
        this.cartaoRepository = cartaoRepository;
    }
    // get all e etc

    @PostMapping
    public ResponseEntity<Cartao> cadastrarCartao(Cartao cartao) {
        return ResponseEntity.ok(cartao);
        /*
         Tem que fazer a validação de cadastro e etc, apenas uma base para comecar
         */

    }
    @GetMapping("/{id}")
    public ResponseEntity<Cartao> listarCartao(@PathVariable @Valid Long Id) {
        var cartao = cartaoRepository.findById(Id);
        return cartao.stream().findFirst().map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        /*
        Aqui tem que verificar se o usuario é dono do cartao listado,
        e fazer uma referencia que se caso ele nao for registrado
        ele nao pode acessar esse endpoint o mesmo serve se a pessoa nao tiver cartao
         */
    }
    @PutMapping
    public ResponseEntity<Cartao> atualizarCartao(Cartao cartao) {
        return ResponseEntity.ok(cartaoRepository.save(cartao));

        /*
        Atualiza caso a pessoa tiver esse cartao e etc + as restricoes do get
         */
    }
    @DeleteMapping
    public ResponseEntity<Void> removerCartao(@Valid @RequestBody Cartao cartao) {
        cartaoRepository.delete(cartao);
        return ResponseEntity.noContent().build();
        /*
        Deleta caso o cartao for da pessoa, e nao tiver limite que precisa pagar ainda e etc
         */
    }
    @GetMapping
    public ResponseEntity<List<Cartao>> listarCartao() {
        return ResponseEntity.ok(cartaoRepository.findAll());
        /*
        esse metodo lista todos os cartoes na tabela sem muitas referencias,
        iremos mudar para ele liste todos os cartoes daquele cliente,
        lembrando que tem que ser os cartoes ativos,
        iremos mexer na parte de security apenas para pegar esse cliente,
        e um security filter para casos especificos de Administração do banco
         */
    }

}
