package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TransferredEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    fromRepository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    issue: IssueTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (fromRepository != null) "fromRepository: " + GraphQLRequestSerializer.getEntry(fromRepository) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (issue != null) "issue: " + GraphQLRequestSerializer.getEntry(issue) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TransferredEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(fromRepository, that.fromRepository) &&
        Objects.equals(id, that.id) &&
        Objects.equals(issue, that.issue)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, fromRepository, id, issue)
    }
}

object TransferredEventTO {

    def builder(): TransferredEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var fromRepository: RepositoryTO = _
        private var id: String = _
        private var issue: IssueTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setFromRepository(fromRepository: RepositoryTO): Builder = {
            this.fromRepository = fromRepository
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIssue(issue: IssueTO): Builder = {
            this.issue = issue
            this
        }

        def build(): TransferredEventTO = new TransferredEventTO(actor, createdAt, fromRepository, id, issue)

    }
}
