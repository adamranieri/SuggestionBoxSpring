package dev.ranieri.repos;

import dev.ranieri.entities.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionRepo extends JpaRepository<Suggestion, Integer> {
}
