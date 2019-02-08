package fr.sogilis.blog.article.kotlinobjectmother;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.WIZARD;

class TheTest {

    @Test
    @DisplayName("Can you see all information I have to write in order to build a single hero?")
    void without_mother_object() {
        Kingdom kingdom = new Kingdom("Logres", new Town("Kaamelott"));
        LocalDate dateOfBirth = LocalDate.of(-360, 11, 21);
        Hero hero = new Hero("Merlin", kingdom, WIZARD, dateOfBirth, null);

        long age = hero.getAgeAt(LocalDate.of(524, 11, 21));

        Assertions.assertThat(age)
            .isEqualTo(884);
    }

    @Test
    void with_mother_object() {
        Hero hero = HeroMother.one()
            .dateOfBirth(LocalDateMother.one().withYear(-360))
            .build();

        long age = hero.getAgeAt(LocalDateMother.one().withYear(524));

        Assertions.assertThat(age)
            .isEqualTo(884);
    }
}
