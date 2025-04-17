package ds2.apicreditcard.service;

import ds2.apicreditcard.repository.FaturaRepository;
import org.springframework.stereotype.Service;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

}
