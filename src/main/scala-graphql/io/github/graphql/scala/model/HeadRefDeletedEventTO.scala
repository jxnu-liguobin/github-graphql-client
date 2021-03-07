package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class HeadRefDeletedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    headRef: RefTO,
    @javax.validation.constraints.NotNull
    headRefName: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (headRef != null) "headRef: " + GraphQLRequestSerializer.getEntry(headRef) else "",
            if (headRefName != null) "headRefName: " + GraphQLRequestSerializer.getEntry(headRefName) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[HeadRefDeletedEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(headRef, that.headRef) &&
        Objects.equals(headRefName, that.headRefName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pullRequest, that.pullRequest)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, headRef, headRefName, id, pullRequest)
    }
}

object HeadRefDeletedEventTO {

    def builder(): HeadRefDeletedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var headRef: RefTO = _
        private var headRefName: String = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setHeadRef(headRef: RefTO): Builder = {
            this.headRef = headRef
            this
        }

        def setHeadRefName(headRefName: String): Builder = {
            this.headRefName = headRefName
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def build(): HeadRefDeletedEventTO = new HeadRefDeletedEventTO(actor, createdAt, headRef, headRefName, id, pullRequest)

    }
}
