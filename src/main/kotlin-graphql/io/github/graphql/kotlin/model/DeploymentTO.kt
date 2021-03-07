package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeploymentTO
        return Objects.equals(commit, that.commit)
                && Objects.equals(commitOid, that.commitOid)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creator, that.creator)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(description, that.description)
                && Objects.equals(environment, that.environment)
                && Objects.equals(id, that.id)
                && Objects.equals(latestStatus, that.latestStatus)
                && Objects.equals(payload, that.payload)
                && Objects.equals(ref, that.ref)
                && Objects.equals(repository, that.repository)
                && Objects.equals(state, that.state)
                && Objects.equals(task, that.task)
                && Objects.equals(updatedAt, that.updatedAt)

    }

    override fun hashCode(): Int = {
        return Objects.hash(commit, commitOid, createdAt, creator, databaseId, description, environment, id, latestStatus, payload, ref, repository, state, task, updatedAt)
    }

    class Builder {

        private var commit: CommitTO? = null
        private lateinit var commitOid: String
        private lateinit var createdAt: String
        private var creator: ActorTO? = null
        private var databaseId: Int? = null
        private var description: String? = null
        private var environment: String? = null
        private lateinit var id: String
        private var latestStatus: DeploymentStatusTO? = null
        private var payload: String? = null
        private var ref: RefTO? = null
        private lateinit var repository: RepositoryTO
        private var state: DeploymentStateTO? = null
        private var task: String? = null
        private lateinit var updatedAt: String

        fun setCommit(commit: CommitTO?): Builder {
            this.commit = commit
            return this
        }

        fun setCommitOid(commitOid: String): Builder {
            this.commitOid = commitOid
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setCreator(creator: ActorTO?): Builder {
            this.creator = creator
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setEnvironment(environment: String?): Builder {
            this.environment = environment
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setLatestStatus(latestStatus: DeploymentStatusTO?): Builder {
            this.latestStatus = latestStatus
            return this
        }

        fun setPayload(payload: String?): Builder {
            this.payload = payload
            return this
        }

        fun setRef(ref: RefTO?): Builder {
            this.ref = ref
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setState(state: DeploymentStateTO?): Builder {
            this.state = state
            return this
        }

        fun setTask(task: String?): Builder {
            this.task = task
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun build(): DeploymentTO {
            return DeploymentTO(commit, commitOid, createdAt, creator, databaseId, description, environment, id, latestStatus, payload, ref, repository, state, task, updatedAt)
        }
    }
}
