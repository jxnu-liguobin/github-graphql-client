package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddStarInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    starrableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (starrableId != null) "starrableId: " + GraphQLRequestSerializer.getEntry(starrableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddStarInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(starrableId, that.starrableId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, starrableId)
    }
}

object AddStarInputTO {

    def builder(): AddStarInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var starrableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setStarrableId(starrableId: String): Builder = {
            this.starrableId = starrableId
            this
        }

        def build(): AddStarInputTO = new AddStarInputTO(clientMutationId, starrableId)

    }
}
