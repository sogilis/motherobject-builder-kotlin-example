package fr.sogilis.blog.article.kotlinobjectmother;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Hero {

    private String name;

    private Kingdom allegiance;

    private Caste caste;

    private LocalDate dateOfBirth;

    private LocalDate deathDate;

    public enum Caste {
        KING,
        WIZARD,
        KNIGHT
    }

    public Hero(String name, Kingdom allegiance, Caste caste, LocalDate dateOfBirth, LocalDate deathDate) {
        this.name = name;
        this.allegiance = allegiance;
        this.caste = caste;
        this.dateOfBirth = dateOfBirth;
        this.deathDate = deathDate;
    }

    public String getName() {
        return name;
    }

    public Kingdom getAllegiance() {
        return allegiance;
    }

    public Caste getCaste() {
        return caste;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public long getAgeAt(LocalDate date) {
        return YEARS.between(dateOfBirth, date);
    }
}
