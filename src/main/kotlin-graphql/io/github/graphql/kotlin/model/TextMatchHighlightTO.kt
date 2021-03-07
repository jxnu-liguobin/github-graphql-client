package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TextMatchHighlightTO(
    val beginIndice: Int,
    val endIndice: Int,
    val text: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("beginIndice: " + GraphQLRequestSerializer.getEntry(beginIndice))
        joiner.add("endIndice: " + GraphQLRequestSerializer.getEntry(endIndice))
        joiner.add("text: " + GraphQLRequestSerializer.getEntry(text))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TextMatchHighlightTO
        return Objects.equals(beginIndice, that.beginIndice)
                && Objects.equals(endIndice, that.endIndice)
                && Objects.equals(text, that.text)

    }

    override fun hashCode(): Int = {
        return Objects.hash(beginIndice, endIndice, text)
    }

    class Builder {

        private var beginIndice: Int = 0
        private var endIndice: Int = 0
        private lateinit var text: String

        fun setBeginIndice(beginIndice: Int): Builder {
            this.beginIndice = beginIndice
            return this
        }

        fun setEndIndice(endIndice: Int): Builder {
            this.endIndice = endIndice
            return this
        }

        fun setText(text: String): Builder {
            this.text = text
            return this
        }

        fun build(): TextMatchHighlightTO {
            return TextMatchHighlightTO(beginIndice, endIndice, text)
        }
    }
}
