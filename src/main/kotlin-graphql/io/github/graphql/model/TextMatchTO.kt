package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
