package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateIssueInputTO(
    @javax.validation.constraints.NotNull
    assigneeIds: Seq[String],
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    labelIds: Seq[String],
    milestoneId: String,
    @javax.validation.constraints.NotNull
    projectIds: Seq[String],
    @javax.validation.constraints.NotNull
    repositoryId: String,
    @javax.validation.constraints.NotNull
    title: String
) {

    override def toString(): String = {
        Seq(
            if (assigneeIds != null) "assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds.asJava) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (labelIds != null) "labelIds: " + GraphQLRequestSerializer.getEntry(labelIds.asJava) else "",
            if (milestoneId != null) "milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId) else "",
            if (projectIds != null) "projectIds: " + GraphQLRequestSerializer.getEntry(projectIds.asJava) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateIssueInputTO {

    def builder(): CreateIssueInputTO.Builder = new Builder()

    class Builder {

        private var assigneeIds: Seq[String] = _
        private var body: String = _
        private var clientMutationId: String = _
        private var labelIds: Seq[String] = _
        private var milestoneId: String = _
        private var projectIds: Seq[String] = _
        private var repositoryId: String = _
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

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def build(): CreateIssueInputTO = new CreateIssueInputTO(assigneeIds, body, clientMutationId, labelIds, milestoneId, projectIds, repositoryId, title)

    }
}
