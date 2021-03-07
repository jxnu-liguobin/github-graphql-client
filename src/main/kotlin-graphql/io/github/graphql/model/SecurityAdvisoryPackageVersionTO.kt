package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
