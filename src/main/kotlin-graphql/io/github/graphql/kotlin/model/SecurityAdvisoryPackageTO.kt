package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityAdvisoryPackageTO
        return Objects.equals(ecosystem, that.ecosystem)
                && Objects.equals(name, that.name)

    }

    override fun hashCode(): Int = {
        return Objects.hash(ecosystem, name)
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
