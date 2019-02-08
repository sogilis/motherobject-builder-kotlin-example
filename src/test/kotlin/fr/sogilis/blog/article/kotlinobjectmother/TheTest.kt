package fr.sogilis.blog.article.kotlinobjectmother

import fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.WIZARD
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate

class TheTest {

    @Test
    fun `Without mother object - can you see all information I have to write in order to build a single hero?`() {
        val kingdom = Kingdom("Logres", Town("Kaamelott"))
        val dateOfBirth = LocalDate.of(-360, 11, 21)
        val hero = Hero("Merlin", kingdom, WIZARD, dateOfBirth, null)

        val age = hero.getAgeAt(LocalDate.of(524, 11, 21))

        Assertions.assertThat(age)
            .isEqualTo(884)
    }

    @Test
    fun `With mother object`() {
        val hero = create(HeroMother.one()) {
            dateOfBirth = LocalDateMother.one().withYear(-360)
        }

        val age = hero.getAgeAt(LocalDateMother.one().withYear(524))

        Assertions.assertThat(age)
            .isEqualTo(884)
    }
}
