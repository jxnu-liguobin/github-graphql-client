package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnminimizeCommentInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    subjectId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
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
        val that = obj.asInstanceOf[UnminimizeCommentInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(subjectId, that.subjectId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, subjectId)
    }
}

object UnminimizeCommentInputTO {

    def builder(): UnminimizeCommentInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var subjectId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setSubjectId(subjectId: String): Builder = {
            this.subjectId = subjectId
            this
        }

        def build(): UnminimizeCommentInputTO = new UnminimizeCommentInputTO(clientMutationId, subjectId)

    }
}
