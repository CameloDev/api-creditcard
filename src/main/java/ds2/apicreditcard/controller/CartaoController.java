package ds2.apicreditcard.controller;

import ds2.apicreditcard.entity.Cartao;
import ds2.apicreditcard.repository.CartaoRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        // tem que fazer a validação de cadastro e etc, apenas uma base para comecar

    }
    @GetMapping("/{id}")
    public ResponseEntity<Cartao> listarCartao(@PathVariable @Valid Long Id) {
        var cartao = cartaoRepository.findById(Id);
        return cartao.stream().findFirst().map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
