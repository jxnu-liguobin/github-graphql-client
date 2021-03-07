package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ExternalIdentitySamlAttributesTO(
    val nameId: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (nameId != null) {
            joiner.add("nameId: " + GraphQLRequestSerializer.getEntry(nameId))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ExternalIdentitySamlAttributesTO
        return Objects.equals(nameId, that.nameId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(nameId)
    }

    class Builder {

        private var nameId: String? = null

        fun setNameId(nameId: String?): Builder {
            this.nameId = nameId
            return this
        }

        fun build(): ExternalIdentitySamlAttributesTO {
            return ExternalIdentitySamlAttributesTO(nameId)
        }
    }
}
