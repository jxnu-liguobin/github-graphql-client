package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import IssueStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateIssueInputTO(
    @javax.validation.constraints.NotNull
    assigneeIds: Seq[String],
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    id: String,
    @javax.validation.constraints.NotNull
    labelIds: Seq[String],
    milestoneId: String,
    @javax.validation.constraints.NotNull
    projectIds: Seq[String],
    state: IssueStateTO,
    title: String
) {

    override def toString(): String = {
        Seq(
            if (assigneeIds != null) "assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds.asJava) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (labelIds != null) "labelIds: " + GraphQLRequestSerializer.getEntry(labelIds.asJava) else "",
            if (milestoneId != null) "milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId) else "",
            if (projectIds != null) "projectIds: " + GraphQLRequestSerializer.getEntry(projectIds.asJava) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateIssueInputTO]
        Objects.equals(assigneeIds, that.assigneeIds) &&
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(labelIds, that.labelIds) &&
        Objects.equals(milestoneId, that.milestoneId) &&
        Objects.equals(projectIds, that.projectIds) &&
        Objects.equals(state, that.state) &&
        Objects.equals(title, that.title)
    }

    override def hashCode(): Int = {
        Objects.hash(assigneeIds, body, clientMutationId, id, labelIds, milestoneId, projectIds, state, title)
    }
}

object UpdateIssueInputTO {

    def builder(): UpdateIssueInputTO.Builder = new Builder()

    class Builder {

        private var assigneeIds: Seq[String] = _
        private var body: String = _
        private var clientMutationId: String = _
        private var id: String = _
        private var labelIds: Seq[String] = _
        private var milestoneId: String = _
        private var projectIds: Seq[String] = _
        private var state: IssueStateTO = _
        private var title: String = _

        def setAssigneeIds(assigneeIds: Seq[String]): Builder = {
            this.assigneeIds = assigneeIds
            this
        }

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLabelIds(labelIds: Seq[String]): Builder = {
            this.labelIds = labelIds
            this
        }

        def setMilestoneId(milestoneId: String): Builder = {
            this.milestoneId = milestoneId
            this
        }

        def setProjectIds(projectIds: Seq[String]): Builder = {
            this.projectIds = projectIds
            this
        }

        def setState(state: IssueStateTO): Builder = {
            this.state = state
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def build(): UpdateIssueInputTO = new UpdateIssueInputTO(assigneeIds, body, clientMutationId, id, labelIds, milestoneId, projectIds, state, title)

    }
}
