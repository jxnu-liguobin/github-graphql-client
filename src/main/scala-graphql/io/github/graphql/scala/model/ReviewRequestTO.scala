package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewRequestTO(
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    requestedReviewer: RequestedReviewerTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (requestedReviewer != null) "requestedReviewer: " + GraphQLRequestSerializer.getEntry(requestedReviewer) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReviewRequestTO]
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(requestedReviewer, that.requestedReviewer)
    }

    override def hashCode(): Int = {
        Objects.hash(databaseId, id, pullRequest, requestedReviewer)
    }
}

object ReviewRequestTO {

    def builder(): ReviewRequestTO.Builder = new Builder()

    class Builder {

        private var databaseId: Option[Int] = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _
        private var requestedReviewer: RequestedReviewerTO = _

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
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

        def setRequestedReviewer(requestedReviewer: RequestedReviewerTO): Builder = {
            this.requestedReviewer = requestedReviewer
            this
        }

        def build(): ReviewRequestTO = new ReviewRequestTO(databaseId, id, pullRequest, requestedReviewer)

    }
}
