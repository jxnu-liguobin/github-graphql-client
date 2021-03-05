package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeploymentStatusTO(
    val createdAt: String,
    val creator: ActorTO?,
    val deployment: DeploymentTO,
    val description: String?,
    val environmentUrl: String?,
    override
    val id: String,
    val logUrl: String?,
    val state: DeploymentStatusStateTO,
    val updatedAt: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        joiner.add("deployment: " + GraphQLRequestSerializer.getEntry(deployment))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (environmentUrl != null) {
            joiner.add("environmentUrl: " + GraphQLRequestSerializer.getEntry(environmentUrl))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (logUrl != null) {
            joiner.add("logUrl: " + GraphQLRequestSerializer.getEntry(logUrl))
        }
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }
}
