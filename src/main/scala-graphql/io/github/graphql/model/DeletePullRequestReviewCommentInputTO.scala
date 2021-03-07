package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeletePullRequestReviewCommentInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    id: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeletePullRequestReviewCommentInputTO {

    def builder(): DeletePullRequestReviewCommentInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var id: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def build(): DeletePullRequestReviewCommentInputTO = new DeletePullRequestReviewCommentInputTO(clientMutationId, id)

    }
}
