package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddLabelsToLabelableInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    labelIds: Seq[String],
    @javax.validation.constraints.NotNull
    labelableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (labelIds != null) "labelIds: " + GraphQLRequestSerializer.getEntry(labelIds.asJava) else "",
            if (labelableId != null) "labelableId: " + GraphQLRequestSerializer.getEntry(labelableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddLabelsToLabelableInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(labelIds, that.labelIds) &&
        Objects.equals(labelableId, that.labelableId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, labelIds, labelableId)
    }
}

object AddLabelsToLabelableInputTO {

    def builder(): AddLabelsToLabelableInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var labelIds: Seq[String] = _
        private var labelableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLabelIds(labelIds: Seq[String]): Builder = {
            this.labelIds = labelIds
            this
        }

        def setLabelableId(labelableId: String): Builder = {
            this.labelableId = labelableId
            this
        }

        def build(): AddLabelsToLabelableInputTO = new AddLabelsToLabelableInputTO(clientMutationId, labelIds, labelableId)

    }
}
