package progder.thirdparty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import progder.model.Candidate;
import progder.repository.CandidateRepository;

@Component
class DbFiller implements CommandLineRunner {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public void run(String... strings) {

        Candidate candidate1 = new Candidate();
        candidate1.setUsername("SuperJavaDeveloper");
        candidate1.setEmail("super.java.dev@google.com");
        candidate1.setPersonalInfo("Ем чай, пью печеньки");
        candidate1.setPersonalInfoExtended("""
                Ем чай, пью печеньки
                """);
        candidate1.setSkillsInfo("Ем чай, пью печеньки");
        candidate1.setSkillsInfoExtended("""
                Ем чай, пью печеньки
                """);
        candidate1.setWishesInfo("Ем чай, пью печеньки");
        candidate1.setWishesInfoExtended("""
                Ем чай, пью печеньки
                """);
        candidate1.setExtraInfo("Ем чай, пью печеньки");
        candidate1.setExtraInfoExtended("""
                Ем чай, пью печеньки
                """);
        candidateRepository.save(candidate1);
    }
}