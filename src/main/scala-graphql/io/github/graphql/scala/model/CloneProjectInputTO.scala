package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CloneProjectInputTO(
    body: String,
    clientMutationId: String,
    includeWorkflows: Boolean,
    @javax.validation.constraints.NotNull
    name: String,
    public: Option[Boolean],
    @javax.validation.constraints.NotNull
    sourceId: String,
    @javax.validation.constraints.NotNull
    targetOwnerId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            "includeWorkflows: " + GraphQLRequestSerializer.getEntry(includeWorkflows),
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (public.isDefined) "public: " + GraphQLRequestSerializer.getEntry(public.get) else "",
            if (sourceId != null) "sourceId: " + GraphQLRequestSerializer.getEntry(sourceId) else "",
            if (targetOwnerId != null) "targetOwnerId: " + GraphQLRequestSerializer.getEntry(targetOwnerId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CloneProjectInputTO]
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(includeWorkflows, that.includeWorkflows) &&
        Objects.equals(name, that.name) &&
        Objects.equals(public, that.public) &&
        Objects.equals(sourceId, that.sourceId) &&
        Objects.equals(targetOwnerId, that.targetOwnerId)
    }

    override def hashCode(): Int = {
        Objects.hash(body, clientMutationId, includeWorkflows, name, public, sourceId, targetOwnerId)
    }
}

object CloneProjectInputTO {

    def builder(): CloneProjectInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var includeWorkflows: Boolean = _
        private var name: String = _
        private var public: Option[Boolean] = _
        private var sourceId: String = _
        private var targetOwnerId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setIncludeWorkflows(includeWorkflows: Boolean): Builder = {
            this.includeWorkflows = includeWorkflows
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setPublic(public: Option[Boolean]): Builder = {
            this.public = public
            this
        }

        def setSourceId(sourceId: String): Builder = {
            this.sourceId = sourceId
            this
        }

        def setTargetOwnerId(targetOwnerId: String): Builder = {
            this.targetOwnerId = targetOwnerId
            this
        }

        def build(): CloneProjectInputTO = new CloneProjectInputTO(body, clientMutationId, includeWorkflows, name, public, sourceId, targetOwnerId)

    }
}
