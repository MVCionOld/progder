package progder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import progder.model.Candidate;
import progder.repository.CandidateRepository;

@SuppressWarnings("unused")
@RestController
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @CrossOrigin("*")
    @PostMapping("/api/register/candidate")
    public ResponseEntity<?> registerCandidate(@RequestBody Candidate candidate) {
        return ResponseEntity.ok(candidateRepository.save(candidate));
    }
}

