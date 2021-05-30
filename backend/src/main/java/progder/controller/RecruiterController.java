package progder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import progder.model.Candidate;
import progder.model.Recruiter;
import progder.repository.CandidateRepository;
import progder.repository.RecruiterRepository;

import java.util.List;

@SuppressWarnings("unused")
@RestController
public class RecruiterController {
    @Autowired
    private RecruiterRepository recruiterRepository;
    @Autowired
    private CandidateRepository candidateRepository;

    @CrossOrigin("*")
    @PostMapping("/api/register/recruiter")
    public ResponseEntity<?> registerCandidate(@RequestBody Recruiter recruiter) {
        return ResponseEntity.ok(recruiterRepository.save(recruiter));
    }

    @CrossOrigin("*")
    @GetMapping("/api/engagement/recruiter/new")
    public ResponseEntity<List<Candidate>> getAll() {
        return ResponseEntity.ok(candidateRepository.findAll());
    }
}
