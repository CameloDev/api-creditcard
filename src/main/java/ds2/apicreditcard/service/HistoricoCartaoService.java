package ds2.apicreditcard.service;

import ds2.apicreditcard.repository.HistoricoCartaoRepository;
import org.springframework.stereotype.Service;

@Service
public class HistoricoCartaoService {
    private final HistoricoCartaoRepository historicoCartaoRepository;
    public HistoricoCartaoService(HistoricoCartaoRepository historicoCartaoRepository) {
        this.historicoCartaoRepository = historicoCartaoRepository;
    }

}
