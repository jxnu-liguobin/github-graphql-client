package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityAdvisoryIdentifierFilterTO
        return Objects.equals(type, that.type)
                && Objects.equals(value, that.value)

    }

    override fun hashCode(): Int = {
        return Objects.hash(type, value)
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
