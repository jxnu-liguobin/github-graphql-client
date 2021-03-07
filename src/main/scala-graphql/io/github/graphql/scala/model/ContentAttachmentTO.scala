package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ContentAttachmentTO(
    @javax.validation.constraints.NotNull
    body: String,
    @javax.validation.constraints.NotNull
    contentReference: ContentReferenceTO,
    databaseId: Int,
    @javax.validation.constraints.NotNull
    id: String,
    @javax.validation.constraints.NotNull
    title: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (contentReference != null) "contentReference: " + GraphQLRequestSerializer.getEntry(contentReference) else "",
            "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId),
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ContentAttachmentTO]
        Objects.equals(body, that.body) &&
        Objects.equals(contentReference, that.contentReference) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(title, that.title)
    }

    override def hashCode(): Int = {
        Objects.hash(body, contentReference, databaseId, id, title)
    }
}

object ContentAttachmentTO {

    def builder(): ContentAttachmentTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var contentReference: ContentReferenceTO = _
        private var databaseId: Int = _
        private var id: String = _
        private var title: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setContentReference(contentReference: ContentReferenceTO): Builder = {
            this.contentReference = contentReference
            this
        }

        def setDatabaseId(databaseId: Int): Builder = {
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

        def build(): ContentAttachmentTO = new ContentAttachmentTO(body, contentReference, databaseId, id, title)

    }
}
