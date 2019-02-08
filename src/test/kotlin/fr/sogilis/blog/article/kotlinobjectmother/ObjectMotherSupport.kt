package fr.sogilis.blog.article.kotlinobjectmother

interface Builder<T> {
    fun build():T
}

fun <U, V: Builder<U>> create(builder: V, init: (V.() -> Unit)?=null)
        = builder.apply { init?.invoke(this) }.build()
