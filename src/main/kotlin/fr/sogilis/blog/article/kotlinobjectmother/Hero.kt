package fr.sogilis.blog.article.kotlinobjectmother

import java.time.LocalDate

import java.time.temporal.ChronoUnit.YEARS

class Hero(
    val name: String,
    val allegiance: Kingdom,
    val caste: Caste,
    val dateOfBirth: LocalDate,
    val deathDate: LocalDate?
) {

    enum class Caste {
        KING,
        WIZARD,
        KNIGHT
    }

    fun getAgeAt(date: LocalDate)=YEARS.between(dateOfBirth, date)
}
