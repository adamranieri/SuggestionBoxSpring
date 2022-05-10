package dev.ranieri.SuggestionBoxSpring;

import dev.ranieri.entities.Suggestion;
import dev.ranieri.repos.SuggestionRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SuggestionRepoTests {

    @Autowired
    SuggestionRepo suggestionRepo;

    @Test
    public void createSuggestion(){
        Suggestion suggestion = new Suggestion(0,"Fix Coffee Maker",10);
        suggestionRepo.save(suggestion);
        Assertions.assertNotEquals(suggestion.getId(),0);
        System.out.println(suggestion);
    }
}
