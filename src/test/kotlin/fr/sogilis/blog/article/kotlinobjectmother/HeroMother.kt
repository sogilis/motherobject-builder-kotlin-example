package fr.sogilis.blog.article.kotlinobjectmother

import fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.KNIGHT
import fr.sogilis.blog.article.kotlinobjectmother.Hero.Caste.WIZARD
import java.time.LocalDate

object HeroMother {
    fun one() = HeroBuilder().apply {
        name = "Leodagan"
        allegiance = KingdomMother.one().build()
        caste = KNIGHT
        dateOfBirth = LocalDateMother.one()
    }

    fun deadAt(date: LocalDate) = one().apply {
        deathDate = date.minusDays(2)
    }

    fun merlin() = one().apply {
        name = "Merlin"
        allegiance = KingdomMother.logres().build()
        caste = WIZARD
    }
}

class HeroBuilder : Builder<Hero> {
    var name: String? = null
    var allegiance: Kingdom? = null
    var caste: Hero.Caste? = null
    var dateOfBirth: LocalDate? = null
    var deathDate: LocalDate? = null

    override fun build() = Hero(name!!, allegiance!!, caste!!, dateOfBirth!!, deathDate)
}
