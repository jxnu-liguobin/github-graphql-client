package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ExternalIdentityScimAttributesTO(
    username: String
) {

    override def toString(): String = {
        Seq(
            if (username != null) "username: " + GraphQLRequestSerializer.getEntry(username) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ExternalIdentityScimAttributesTO {

    def builder(): ExternalIdentityScimAttributesTO.Builder = new Builder()

    class Builder {

        private var username: String = _

        def setUsername(username: String): Builder = {
            this.username = username
            this
        }

        def build(): ExternalIdentityScimAttributesTO = new ExternalIdentityScimAttributesTO(username)

    }
}
