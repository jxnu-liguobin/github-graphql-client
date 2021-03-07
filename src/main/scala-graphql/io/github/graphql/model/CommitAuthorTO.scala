package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
