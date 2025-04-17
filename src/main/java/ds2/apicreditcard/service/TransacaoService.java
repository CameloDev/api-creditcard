package ds2.apicreditcard.service;

import ds2.apicreditcard.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {
    private final TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

}
