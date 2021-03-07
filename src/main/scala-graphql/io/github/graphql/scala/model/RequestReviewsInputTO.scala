package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RequestReviewsInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    pullRequestId: String,
    @javax.validation.constraints.NotNull
    teamIds: Seq[String],
    union: Option[Boolean],
    @javax.validation.constraints.NotNull
    userIds: Seq[String]
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestId != null) "pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId) else "",
            if (teamIds != null) "teamIds: " + GraphQLRequestSerializer.getEntry(teamIds.asJava) else "",
            if (union.isDefined) "union: " + GraphQLRequestSerializer.getEntry(union.get) else "",
            if (userIds != null) "userIds: " + GraphQLRequestSerializer.getEntry(userIds.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RequestReviewsInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestId, that.pullRequestId) &&
        Objects.equals(teamIds, that.teamIds) &&
        Objects.equals(union, that.union) &&
        Objects.equals(userIds, that.userIds)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequestId, teamIds, union, userIds)
    }
}

object RequestReviewsInputTO {

    def builder(): RequestReviewsInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestId: String = _
        private var teamIds: Seq[String] = _
        private var union: Option[Boolean] = _
        private var userIds: Seq[String] = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestId(pullRequestId: String): Builder = {
            this.pullRequestId = pullRequestId
            this
        }

        def setTeamIds(teamIds: Seq[String]): Builder = {
            this.teamIds = teamIds
            this
        }

        def setUnion(union: Option[Boolean]): Builder = {
            this.union = union
            this
        }

        def setUserIds(userIds: Seq[String]): Builder = {
            this.userIds = userIds
            this
        }

        def build(): RequestReviewsInputTO = new RequestReviewsInputTO(clientMutationId, pullRequestId, teamIds, union, userIds)

    }
}
