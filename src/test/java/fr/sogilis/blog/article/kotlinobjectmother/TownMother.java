package fr.sogilis.blog.article.kotlinobjectmother;

public class TownMother {

    public static TownBuilder one() {
        return new TownBuilder()
            .name("Vannes");
    }

    public static TownBuilder kaamelott() {
        return one()
            .name("Kaamelott");
    }
}
