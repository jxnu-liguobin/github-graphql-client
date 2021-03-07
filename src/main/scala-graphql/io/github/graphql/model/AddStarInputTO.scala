package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
