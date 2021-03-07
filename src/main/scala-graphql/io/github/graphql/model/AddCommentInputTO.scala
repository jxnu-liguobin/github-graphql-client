package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddCommentInputTO(
    @javax.validation.constraints.NotNull
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    subjectId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (subjectId != null) "subjectId: " + GraphQLRequestSerializer.getEntry(subjectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddCommentInputTO {

    def builder(): AddCommentInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var subjectId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setSubjectId(subjectId: String): Builder = {
            this.subjectId = subjectId
            this
        }

        def build(): AddCommentInputTO = new AddCommentInputTO(body, clientMutationId, subjectId)

    }
}
