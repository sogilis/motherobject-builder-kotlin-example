package fr.sogilis.blog.article.kotlinobjectmother;

public class KingdomBuilder {

    private String name;
    private Town capital;

    public KingdomBuilder name(String name) {
        this.name = name;
        return this;
    }

    public KingdomBuilder capital(Town capital) {
        this.capital = capital;
        return this;
    }

    public Kingdom build() {
        return new Kingdom(name, capital);
    }
}
