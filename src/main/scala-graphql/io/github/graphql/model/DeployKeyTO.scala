package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeployKeyTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    key: String,
    readOnly: Boolean,
    @javax.validation.constraints.NotNull
    title: String,
    verified: Boolean
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else "",
            "readOnly: " + GraphQLRequestSerializer.getEntry(readOnly),
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else "",
            "verified: " + GraphQLRequestSerializer.getEntry(verified)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeployKeyTO {

    def builder(): DeployKeyTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var id: String = _
        private var key: String = _
        private var readOnly: Boolean = _
        private var title: String = _
        private var verified: Boolean = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def setReadOnly(readOnly: Boolean): Builder = {
            this.readOnly = readOnly
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def setVerified(verified: Boolean): Builder = {
            this.verified = verified
            this
        }

        def build(): DeployKeyTO = new DeployKeyTO(createdAt, id, key, readOnly, title, verified)

    }
}
