package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TextMatchTO(
    val fragment: String,
    val highlights: List<TextMatchHighlightTO>,
    val property: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("fragment: " + GraphQLRequestSerializer.getEntry(fragment))
        joiner.add("highlights: " + GraphQLRequestSerializer.getEntry(highlights))
        joiner.add("property: " + GraphQLRequestSerializer.getEntry(property))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TextMatchTO
        return Objects.equals(fragment, that.fragment)
                && Objects.equals(highlights, that.highlights)
                && Objects.equals(property, that.property)

    }

    override fun hashCode(): Int = {
        return Objects.hash(fragment, highlights, property)
    }

    class Builder {

        private lateinit var fragment: String
        private lateinit var highlights: List<TextMatchHighlightTO>
        private lateinit var property: String

        fun setFragment(fragment: String): Builder {
            this.fragment = fragment
            return this
        }

        fun setHighlights(highlights: List<TextMatchHighlightTO>): Builder {
            this.highlights = highlights
            return this
        }

        fun setProperty(property: String): Builder {
            this.property = property
            return this
        }

        fun build(): TextMatchTO {
            return TextMatchTO(fragment, highlights, property)
        }
    }
}
