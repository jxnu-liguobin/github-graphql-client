package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdatePullRequestInputTO(
    baseRefName: String,
    body: String,
    clientMutationId: String,
    maintainerCanModify: Option[Boolean],
    @javax.validation.constraints.NotNull
    pullRequestId: String,
    title: String
) {

    override def toString(): String = {
        Seq(
            if (baseRefName != null) "baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName) else "",
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (maintainerCanModify.isDefined) "maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify.get) else "",
            if (pullRequestId != null) "pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId) else "",
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
        val that = obj.asInstanceOf[UpdatePullRequestInputTO]
        Objects.equals(baseRefName, that.baseRefName) &&
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(maintainerCanModify, that.maintainerCanModify) &&
        Objects.equals(pullRequestId, that.pullRequestId) &&
        Objects.equals(title, that.title)
    }

    override def hashCode(): Int = {
        Objects.hash(baseRefName, body, clientMutationId, maintainerCanModify, pullRequestId, title)
    }
}

object UpdatePullRequestInputTO {

    def builder(): UpdatePullRequestInputTO.Builder = new Builder()

    class Builder {

        private var baseRefName: String = _
        private var body: String = _
        private var clientMutationId: String = _
        private var maintainerCanModify: Option[Boolean] = _
        private var pullRequestId: String = _
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

        def setMaintainerCanModify(maintainerCanModify: Option[Boolean]): Builder = {
            this.maintainerCanModify = maintainerCanModify
            this
        }

        def setPullRequestId(pullRequestId: String): Builder = {
            this.pullRequestId = pullRequestId
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def build(): UpdatePullRequestInputTO = new UpdatePullRequestInputTO(baseRefName, body, clientMutationId, maintainerCanModify, pullRequestId, title)

    }
}
