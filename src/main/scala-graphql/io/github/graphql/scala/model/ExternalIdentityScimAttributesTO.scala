package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ExternalIdentityScimAttributesTO(
    username: String
) {

    override def toString(): String = {
        Seq(
            if (username != null) "username: " + GraphQLRequestSerializer.getEntry(username) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ExternalIdentityScimAttributesTO]
        Objects.equals(username, that.username)
    }

    override def hashCode(): Int = {
        Objects.hash(username)
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
