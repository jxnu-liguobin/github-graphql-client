package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class SecurityAdvisoryIdentifierTO(
    val type: String,
    val value: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("type: " + GraphQLRequestSerializer.getEntry(type))
        joiner.add("value: " + GraphQLRequestSerializer.getEntry(value))
        return joiner.toString()
    }

    class Builder {

        private lateinit var type: String
        private lateinit var value: String

        fun setType(type: String): Builder {
            this.type = type
            return this
        }

        fun setValue(value: String): Builder {
            this.value = value
            return this
        }

        fun build(): SecurityAdvisoryIdentifierTO {
            return SecurityAdvisoryIdentifierTO(type, value)
        }
    }
}
