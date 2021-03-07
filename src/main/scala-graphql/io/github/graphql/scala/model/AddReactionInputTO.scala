package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import ReactionContentTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddReactionInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    content: ReactionContentTO,
    @javax.validation.constraints.NotNull
    subjectId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (subjectId != null) "subjectId: " + GraphQLRequestSerializer.getEntry(subjectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddReactionInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(content, that.content) &&
        Objects.equals(subjectId, that.subjectId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, content, subjectId)
    }
}

object AddReactionInputTO {

    def builder(): AddReactionInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var content: ReactionContentTO = _
        private var subjectId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setContent(content: ReactionContentTO): Builder = {
            this.content = content
            this
        }

        def setSubjectId(subjectId: String): Builder = {
            this.subjectId = subjectId
            this
        }

        def build(): AddReactionInputTO = new AddReactionInputTO(clientMutationId, content, subjectId)

    }
}
