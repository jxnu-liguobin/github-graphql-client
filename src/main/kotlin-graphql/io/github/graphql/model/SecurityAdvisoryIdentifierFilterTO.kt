package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SecurityAdvisoryIdentifierFilterTO(
    val type: SecurityAdvisoryIdentifierTypeTO,
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

        private lateinit var type: SecurityAdvisoryIdentifierTypeTO
        private lateinit var value: String

        fun setType(type: SecurityAdvisoryIdentifierTypeTO): Builder {
            this.type = type
            return this
        }

        fun setValue(value: String): Builder {
            this.value = value
            return this
        }

        fun build(): SecurityAdvisoryIdentifierFilterTO {
            return SecurityAdvisoryIdentifierFilterTO(type, value)
        }
    }
}
