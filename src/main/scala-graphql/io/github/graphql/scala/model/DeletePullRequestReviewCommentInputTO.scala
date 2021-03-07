package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeletePullRequestReviewCommentInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(id, that.id)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, id)
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
