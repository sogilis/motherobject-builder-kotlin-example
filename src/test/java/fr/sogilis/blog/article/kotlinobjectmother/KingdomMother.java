package fr.sogilis.blog.article.kotlinobjectmother;

public class KingdomMother {

    public static KingdomBuilder one() {
        return new KingdomBuilder()
            .name("Logres")
            .capital(TownMother.one().build());
    }

    public static KingdomBuilder logres() {
        return one()
            .name("Logres")
            .capital(TownMother.kaamelott().build());
    }
}
