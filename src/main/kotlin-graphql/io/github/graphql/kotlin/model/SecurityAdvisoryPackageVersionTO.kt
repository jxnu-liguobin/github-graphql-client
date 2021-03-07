package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryPackageVersionTO(
    val identifier: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("identifier: " + GraphQLRequestSerializer.getEntry(identifier))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityAdvisoryPackageVersionTO
        return Objects.equals(identifier, that.identifier)

    }

    override fun hashCode(): Int = {
        return Objects.hash(identifier)
    }

    class Builder {

        private lateinit var identifier: String

        fun setIdentifier(identifier: String): Builder {
            this.identifier = identifier
            return this
        }

        fun build(): SecurityAdvisoryPackageVersionTO {
            return SecurityAdvisoryPackageVersionTO(identifier)
        }
    }
}
