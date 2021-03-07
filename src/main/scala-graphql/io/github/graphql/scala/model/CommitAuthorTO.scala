package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CommitAuthorTO(
    @javax.validation.constraints.NotNull
    emails: Seq[String],
    id: String
) {

    override def toString(): String = {
        Seq(
            if (emails != null) "emails: " + GraphQLRequestSerializer.getEntry(emails.asJava) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CommitAuthorTO]
        Objects.equals(emails, that.emails) &&
        Objects.equals(id, that.id)
    }

    override def hashCode(): Int = {
        Objects.hash(emails, id)
    }
}

object CommitAuthorTO {

    def builder(): CommitAuthorTO.Builder = new Builder()

    class Builder {

        private var emails: Seq[String] = _
        private var id: String = _

        def setEmails(emails: Seq[String]): Builder = {
            this.emails = emails
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def build(): CommitAuthorTO = new CommitAuthorTO(emails, id)

    }
}
