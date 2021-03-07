package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TopicTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    override val viewerHasStarred: Boolean
) extends StarrableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            "viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TopicTO]
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(viewerHasStarred, that.viewerHasStarred)
    }

    override def hashCode(): Int = {
        Objects.hash(id, name, viewerHasStarred)
    }
}

object TopicTO {

    def builder(): TopicTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var name: String = _
        private var viewerHasStarred: Boolean = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setViewerHasStarred(viewerHasStarred: Boolean): Builder = {
            this.viewerHasStarred = viewerHasStarred
            this
        }

        def build(): TopicTO = new TopicTO(id, name, viewerHasStarred)

    }
}
