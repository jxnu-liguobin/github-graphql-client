package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeploymentTO(
    val commit: CommitTO?,
    val commitOid: String,
    val createdAt: String,
    val creator: ActorTO?,
    val databaseId: Int?,
    val description: String?,
    val environment: String?,
    override
    val id: String,
    val latestStatus: DeploymentStatusTO?,
    val payload: String?,
    val ref: RefTO?,
    val repository: RepositoryTO,
    val state: DeploymentStateTO?,
    val task: String?,
    val updatedAt: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("commitOid: " + GraphQLRequestSerializer.getEntry(commitOid))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (environment != null) {
            joiner.add("environment: " + GraphQLRequestSerializer.getEntry(environment))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (latestStatus != null) {
            joiner.add("latestStatus: " + GraphQLRequestSerializer.getEntry(latestStatus))
        }
        if (payload != null) {
            joiner.add("payload: " + GraphQLRequestSerializer.getEntry(payload))
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        if (task != null) {
            joiner.add("task: " + GraphQLRequestSerializer.getEntry(task))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }
}
