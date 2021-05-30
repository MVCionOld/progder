package progder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progder.model.Engagement;

@Repository
public interface EngagementRepository extends JpaRepository<Engagement, Long> {
}