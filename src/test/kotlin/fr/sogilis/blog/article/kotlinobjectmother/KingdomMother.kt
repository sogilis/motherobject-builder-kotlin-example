package fr.sogilis.blog.article.kotlinobjectmother

object KingdomMother {

    fun one() = KingdomBuilder().apply {
        name = "Logres"
        capital = TownMother.one().build()
    }

    fun logres() = one().apply {
        name = "Logres"
        capital = TownMother.kaamelott().build()
    }
}


class KingdomBuilder : Builder<Kingdom> {
    var name: String? = null
    var capital: Town? = null

    override fun build() = Kingdom(name!!, capital!!)
}
