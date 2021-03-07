package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateContentAttachmentInputTO(
    @javax.validation.constraints.NotNull
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    contentReferenceId: String,
    @javax.validation.constraints.NotNull
    title: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (contentReferenceId != null) "contentReferenceId: " + GraphQLRequestSerializer.getEntry(contentReferenceId) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateContentAttachmentInputTO {

    def builder(): CreateContentAttachmentInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var contentReferenceId: String = _
        private var title: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setContentReferenceId(contentReferenceId: String): Builder = {
            this.contentReferenceId = contentReferenceId
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def build(): CreateContentAttachmentInputTO = new CreateContentAttachmentInputTO(body, clientMutationId, contentReferenceId, title)

    }
}
