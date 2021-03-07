package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GitActorTO(
    date: String,
    email: String,
    name: String,
    user: UserTO
) {

    override def toString(): String = {
        Seq(
            if (date != null) "date: " + GraphQLRequestSerializer.getEntry(date) else "",
            if (email != null) "email: " + GraphQLRequestSerializer.getEntry(email) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GitActorTO]
        Objects.equals(date, that.date) &&
        Objects.equals(email, that.email) &&
        Objects.equals(name, that.name) &&
        Objects.equals(user, that.user)
    }

    override def hashCode(): Int = {
        Objects.hash(date, email, name, user)
    }
}

object GitActorTO {

    def builder(): GitActorTO.Builder = new Builder()

    class Builder {

        private var date: String = _
        private var email: String = _
        private var name: String = _
        private var user: UserTO = _

        def setDate(date: String): Builder = {
            this.date = date
            this
        }

        def setEmail(email: String): Builder = {
            this.email = email
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): GitActorTO = new GitActorTO(date, email, name, user)

    }
}
