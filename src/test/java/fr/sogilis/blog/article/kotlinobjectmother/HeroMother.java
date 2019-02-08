package fr.sogilis.blog.article.kotlinobjectmother;

import java.time.LocalDate;

import static fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.KNIGHT;
import static fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.WIZARD;

public class HeroMother {

    public static HeroBuilder one() {
        return new HeroBuilder()
            .name("Leodagan")
            .allegiance(KingdomMother.one().build())
            .caste(KNIGHT)
            .dateOfBirth(LocalDateMother.one());
    }

    public static HeroBuilder deadAt(LocalDate date) {
        return one()
            .deathDate(date.minusDays(2));
    }

    public static HeroBuilder merlin() {
        return one()
            .name("Merlin")
            .allegiance(KingdomMother.logres().build())
            .caste(WIZARD);
    }
}

