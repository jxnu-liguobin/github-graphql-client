package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import IssueStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class IssueFiltersTO(
    assignee: String,
    createdBy: String,
    @javax.validation.constraints.NotNull
    labels: Seq[String],
    mentioned: String,
    milestone: String,
    since: String,
    @javax.validation.constraints.NotNull
    states: Seq[IssueStateTO],
    viewerSubscribed: Option[Boolean] = Some(false)
) {

    override def toString(): String = {
        Seq(
            if (assignee != null) "assignee: " + GraphQLRequestSerializer.getEntry(assignee) else "",
            if (createdBy != null) "createdBy: " + GraphQLRequestSerializer.getEntry(createdBy) else "",
            if (labels != null) "labels: " + GraphQLRequestSerializer.getEntry(labels.asJava) else "",
            if (mentioned != null) "mentioned: " + GraphQLRequestSerializer.getEntry(mentioned) else "",
            if (milestone != null) "milestone: " + GraphQLRequestSerializer.getEntry(milestone) else "",
            if (since != null) "since: " + GraphQLRequestSerializer.getEntry(since) else "",
            if (states != null) "states: " + GraphQLRequestSerializer.getEntry(states.asJava) else "",
            if (viewerSubscribed.isDefined) "viewerSubscribed: " + GraphQLRequestSerializer.getEntry(viewerSubscribed.get) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object IssueFiltersTO {

    def builder(): IssueFiltersTO.Builder = new Builder()

    class Builder {

        private var assignee: String = _
        private var createdBy: String = _
        private var labels: Seq[String] = _
        private var mentioned: String = _
        private var milestone: String = _
        private var since: String = _
        private var states: Seq[IssueStateTO] = _
        private var viewerSubscribed: Option[Boolean] = Some(false)

        def setAssignee(assignee: String): Builder = {
            this.assignee = assignee
            this
        }

        def setCreatedBy(createdBy: String): Builder = {
            this.createdBy = createdBy
            this
        }

        def setLabels(labels: Seq[String]): Builder = {
            this.labels = labels
            this
        }

        def setMentioned(mentioned: String): Builder = {
            this.mentioned = mentioned
            this
        }

        def setMilestone(milestone: String): Builder = {
            this.milestone = milestone
            this
        }

        def setSince(since: String): Builder = {
            this.since = since
            this
        }

        def setStates(states: Seq[IssueStateTO]): Builder = {
            this.states = states
            this
        }

        def setViewerSubscribed(viewerSubscribed: Option[Boolean]): Builder = {
            this.viewerSubscribed = viewerSubscribed
            this
        }

        def build(): IssueFiltersTO = new IssueFiltersTO(assignee, createdBy, labels, mentioned, milestone, since, states, viewerSubscribed)

    }
}
