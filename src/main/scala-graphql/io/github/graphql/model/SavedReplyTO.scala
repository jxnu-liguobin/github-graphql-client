package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SavedReplyTO(
    @javax.validation.constraints.NotNull
    body: String,
    @javax.validation.constraints.NotNull
    bodyHTML: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    title: String,
    user: ActorTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SavedReplyTO {

    def builder(): SavedReplyTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var bodyHTML: String = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var title: String = _
        private var user: ActorTO = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setBodyHTML(bodyHTML: String): Builder = {
            this.bodyHTML = bodyHTML
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def setUser(user: ActorTO): Builder = {
            this.user = user
            this
        }

        def build(): SavedReplyTO = new SavedReplyTO(body, bodyHTML, databaseId, id, title, user)

    }
}
