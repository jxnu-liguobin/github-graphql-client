package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
