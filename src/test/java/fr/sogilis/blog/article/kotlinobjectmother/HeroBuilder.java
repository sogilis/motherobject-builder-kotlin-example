package fr.sogilis.blog.article.kotlinobjectmother;

import fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste;

import java.time.LocalDate;

public class HeroBuilder {

    private String name;

    private Kingdom allegiance;

    private Caste caste;

    private LocalDate dateOfBirth;

    private LocalDate deathDate;

    public HeroBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder allegiance(Kingdom allegiance) {
        this.allegiance = allegiance;
        return this;
    }

    public HeroBuilder caste(Caste caste) {
        this.caste = caste;
        return this;
    }

    public HeroBuilder dateOfBirth(LocalDate date) {
        this.dateOfBirth = date;
        return this;
    }

    public HeroBuilder deathDate(LocalDate date) {
        this.deathDate = date;
        return this;
    }

    public Hero build() {
        return new Hero(name, allegiance, caste, dateOfBirth, deathDate);
    }
}
