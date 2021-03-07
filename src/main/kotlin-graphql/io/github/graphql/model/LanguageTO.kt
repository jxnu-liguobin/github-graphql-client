package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class LanguageTO(
    val color: String?,
    override
    val id: String,
    val name: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (color != null) {
            joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        return joiner.toString()
    }

    class Builder {

        private var color: String? = null
        private lateinit var id: String
        private lateinit var name: String

        fun setColor(color: String?): Builder {
            this.color = color
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun build(): LanguageTO {
            return LanguageTO(color, id, name)
        }
    }
}
