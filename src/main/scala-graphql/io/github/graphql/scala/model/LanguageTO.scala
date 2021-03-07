package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LanguageTO(
    color: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (color != null) "color: " + GraphQLRequestSerializer.getEntry(color) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LanguageTO]
        Objects.equals(color, that.color) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name)
    }

    override def hashCode(): Int = {
        Objects.hash(color, id, name)
    }
}

object LanguageTO {

    def builder(): LanguageTO.Builder = new Builder()

    class Builder {

        private var color: String = _
        private var id: String = _
        private var name: String = _

        def setColor(color: String): Builder = {
            this.color = color
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def build(): LanguageTO = new LanguageTO(color, id, name)

    }
}
