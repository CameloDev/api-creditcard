package ds2.apicreditcard.controller;

import ds2.apicreditcard.entity.Cartao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cartao")
public class CartaoController {
 // get all e etc

    @PostMapping
    public ResponseEntity<Cartao> cadastrarCartao(Cartao cartao) {
        return ResponseEntity.ok(cartao);
        // tem que fazer a validação de cadastro e etc, apenas uma base para comecar
    }
}
