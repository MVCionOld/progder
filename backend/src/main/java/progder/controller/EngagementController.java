package progder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import progder.repository.EngagementRepository;

@SuppressWarnings("unused")
@RestController
public class EngagementController {
    @Autowired
    private EngagementRepository engagementRepository;
}
