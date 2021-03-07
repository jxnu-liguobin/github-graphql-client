package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReopenedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    closable: ClosableTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (closable != null) "closable: " + GraphQLRequestSerializer.getEntry(closable) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReopenedEventTO {

    def builder(): ReopenedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var closable: ClosableTO = _
        private var createdAt: String = _
        private var id: String = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setClosable(closable: ClosableTO): Builder = {
            this.closable = closable
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def build(): ReopenedEventTO = new ReopenedEventTO(actor, closable, createdAt, id)

    }
}
