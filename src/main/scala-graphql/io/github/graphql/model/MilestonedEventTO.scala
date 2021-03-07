package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MilestonedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    milestoneTitle: String,
    @javax.validation.constraints.NotNull
    subject: MilestoneItemTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (milestoneTitle != null) "milestoneTitle: " + GraphQLRequestSerializer.getEntry(milestoneTitle) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MilestonedEventTO {

    def builder(): MilestonedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var id: String = _
        private var milestoneTitle: String = _
        private var subject: MilestoneItemTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
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

        def setMilestoneTitle(milestoneTitle: String): Builder = {
            this.milestoneTitle = milestoneTitle
            this
        }

        def setSubject(subject: MilestoneItemTO): Builder = {
            this.subject = subject
            this
        }

        def build(): MilestonedEventTO = new MilestonedEventTO(actor, createdAt, id, milestoneTitle, subject)

    }
}
