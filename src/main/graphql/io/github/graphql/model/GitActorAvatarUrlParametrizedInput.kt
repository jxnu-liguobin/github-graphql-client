package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field avatarUrl in type GitActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class GitActorAvatarUrlParametrizedInput(
    val size: Int?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        return joiner.toString()
    }
}
