package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import DeploymentStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeploymentTO(
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    commitOid: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    databaseId: Option[Int],
    description: String,
    environment: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    latestStatus: DeploymentStatusTO,
    payload: String,
    ref: RefTO,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    state: DeploymentStateTO,
    task: String,
    @javax.validation.constraints.NotNull
    updatedAt: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (commitOid != null) "commitOid: " + GraphQLRequestSerializer.getEntry(commitOid) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (environment != null) "environment: " + GraphQLRequestSerializer.getEntry(environment) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (latestStatus != null) "latestStatus: " + GraphQLRequestSerializer.getEntry(latestStatus) else "",
            if (payload != null) "payload: " + GraphQLRequestSerializer.getEntry(payload) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (task != null) "task: " + GraphQLRequestSerializer.getEntry(task) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeploymentTO]
        Objects.equals(commit, that.commit) &&
        Objects.equals(commitOid, that.commitOid) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(creator, that.creator) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(description, that.description) &&
        Objects.equals(environment, that.environment) &&
        Objects.equals(id, that.id) &&
        Objects.equals(latestStatus, that.latestStatus) &&
        Objects.equals(payload, that.payload) &&
        Objects.equals(ref, that.ref) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(state, that.state) &&
        Objects.equals(task, that.task) &&
        Objects.equals(updatedAt, that.updatedAt)
    }

    override def hashCode(): Int = {
        Objects.hash(commit, commitOid, createdAt, creator, databaseId, description, environment, id, latestStatus, payload, ref, repository, state, task, updatedAt)
    }
}

object DeploymentTO {

    def builder(): DeploymentTO.Builder = new Builder()

    class Builder {

        private var commit: CommitTO = _
        private var commitOid: String = _
        private var createdAt: String = _
        private var creator: ActorTO = _
        private var databaseId: Option[Int] = _
        private var description: String = _
        private var environment: String = _
        private var id: String = _
        private var latestStatus: DeploymentStatusTO = _
        private var payload: String = _
        private var ref: RefTO = _
        private var repository: RepositoryTO = _
        private var state: DeploymentStateTO = _
        private var task: String = _
        private var updatedAt: String = _

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setCommitOid(commitOid: String): Builder = {
            this.commitOid = commitOid
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setCreator(creator: ActorTO): Builder = {
            this.creator = creator
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setEnvironment(environment: String): Builder = {
            this.environment = environment
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLatestStatus(latestStatus: DeploymentStatusTO): Builder = {
            this.latestStatus = latestStatus
            this
        }

        def setPayload(payload: String): Builder = {
            this.payload = payload
            this
        }

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setState(state: DeploymentStateTO): Builder = {
            this.state = state
            this
        }

        def setTask(task: String): Builder = {
            this.task = task
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def build(): DeploymentTO = new DeploymentTO(commit, commitOid, createdAt, creator, databaseId, description, environment, id, latestStatus, payload, ref, repository, state, task, updatedAt)

    }
}
