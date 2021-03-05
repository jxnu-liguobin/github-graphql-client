package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateRefInputTO(
    val clientMutationId: String?,
    val force: Boolean? = false,
    val oid: String,
    val refId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (force != null) {
            joiner.add("force: " + GraphQLRequestSerializer.getEntry(force))
        }
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("refId: " + GraphQLRequestSerializer.getEntry(refId))
        return joiner.toString()
    }
}
