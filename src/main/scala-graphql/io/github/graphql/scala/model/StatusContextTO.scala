package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import StatusStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class StatusContextTO(
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    context: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    description: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    state: StatusStateTO,
    targetUrl: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (context != null) "context: " + GraphQLRequestSerializer.getEntry(context) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (targetUrl != null) "targetUrl: " + GraphQLRequestSerializer.getEntry(targetUrl) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[StatusContextTO]
        Objects.equals(commit, that.commit) &&
        Objects.equals(context, that.context) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(creator, that.creator) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(state, that.state) &&
        Objects.equals(targetUrl, that.targetUrl)
    }

    override def hashCode(): Int = {
        Objects.hash(commit, context, createdAt, creator, description, id, state, targetUrl)
    }
}

object StatusContextTO {

    def builder(): StatusContextTO.Builder = new Builder()

    class Builder {

        private var commit: CommitTO = _
        private var context: String = _
        private var createdAt: String = _
        private var creator: ActorTO = _
        private var description: String = _
        private var id: String = _
        private var state: StatusStateTO = _
        private var targetUrl: String = _

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setContext(context: String): Builder = {
            this.context = context
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

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setState(state: StatusStateTO): Builder = {
            this.state = state
            this
        }

        def setTargetUrl(targetUrl: String): Builder = {
            this.targetUrl = targetUrl
            this
        }

        def build(): StatusContextTO = new StatusContextTO(commit, context, createdAt, creator, description, id, state, targetUrl)

    }
}
