package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class SecurityAdvisoryPackageTO(
    val ecosystem: SecurityAdvisoryEcosystemTO,
    val name: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        return joiner.toString()
    }

    class Builder {

        private lateinit var ecosystem: SecurityAdvisoryEcosystemTO
        private lateinit var name: String

        fun setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO): Builder {
            this.ecosystem = ecosystem
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun build(): SecurityAdvisoryPackageTO {
            return SecurityAdvisoryPackageTO(ecosystem, name)
        }
    }
}
