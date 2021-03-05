package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ExternalIdentitySamlAttributesTO(
    val nameId: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (nameId != null) {
            joiner.add("nameId: " + GraphQLRequestSerializer.getEntry(nameId))
        }
        return joiner.toString()
    }
}
