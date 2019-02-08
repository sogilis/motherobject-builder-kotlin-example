package fr.sogilis.blog.article.kotlinobjectmother

object TownMother {
    fun one() = TownBuilder().apply {name = "Vannes"}
    fun kaamelott() = one().apply {name = "Kaamelott"}
}

class TownBuilder : Builder<Town> {
    var name: String? = null
    override fun build() = Town(name!!)
}
