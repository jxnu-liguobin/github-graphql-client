package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatePullRequestInputTO(
    @javax.validation.constraints.NotNull
    baseRefName: String,
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    headRefName: String,
    maintainerCanModify: Option[Boolean] = Some(true),
    @javax.validation.constraints.NotNull
    repositoryId: String,
    @javax.validation.constraints.NotNull
    title: String
) {

    override def toString(): String = {
        Seq(
            if (baseRefName != null) "baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (headRefName != null) "headRefName: " + GraphQLRequestSerializer.getEntry(headRefName) else "",
            if (maintainerCanModify.isDefined) "maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify.get) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreatePullRequestInputTO {

    def builder(): CreatePullRequestInputTO.Builder = new Builder()

    class Builder {

        private var baseRefName: String = _
        private var body: String = _
        private var clientMutationId: String = _
        private var headRefName: String = _
        private var maintainerCanModify: Option[Boolean] = Some(true)
        private var repositoryId: String = _
        private var title: String = _

        def setBaseRefName(baseRefName: String): Builder = {
            this.baseRefName = baseRefName
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

        def setHeadRefName(headRefName: String): Builder = {
            this.headRefName = headRefName
            this
        }

        def setMaintainerCanModify(maintainerCanModify: Option[Boolean]): Builder = {
            this.maintainerCanModify = maintainerCanModify
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

        def build(): CreatePullRequestInputTO = new CreatePullRequestInputTO(baseRefName, body, clientMutationId, headRefName, maintainerCanModify, repositoryId, title)

    }
}
