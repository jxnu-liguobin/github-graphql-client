package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ContentReferenceTO(
    databaseId: Int,
    @javax.validation.constraints.NotNull
    id: String,
    @javax.validation.constraints.NotNull
    reference: String
) {

    override def toString(): String = {
        Seq(
            "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId),
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (reference != null) "reference: " + GraphQLRequestSerializer.getEntry(reference) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ContentReferenceTO]
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reference, that.reference)
    }

    override def hashCode(): Int = {
        Objects.hash(databaseId, id, reference)
    }
}

object ContentReferenceTO {

    def builder(): ContentReferenceTO.Builder = new Builder()

    class Builder {

        private var databaseId: Int = _
        private var id: String = _
        private var reference: String = _

        def setDatabaseId(databaseId: Int): Builder = {
            this.databaseId = databaseId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setReference(reference: String): Builder = {
            this.reference = reference
            this
        }

        def build(): ContentReferenceTO = new ContentReferenceTO(databaseId, id, reference)

    }
}
