package progder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import progder.repository.CandidateRepository;

@Component
public class CandidateService{
    @Autowired
    private CandidateRepository repository;
}
