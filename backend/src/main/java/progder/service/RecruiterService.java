package progder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import progder.repository.RecruiterRepository;

@Component
public class RecruiterService {
    @Autowired
    private RecruiterRepository repository;
}
