package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TextMatchHighlightTO(
    beginIndice: Int,
    endIndice: Int,
    @javax.validation.constraints.NotNull
    text: String
) {

    override def toString(): String = {
        Seq(
            "beginIndice: " + GraphQLRequestSerializer.getEntry(beginIndice),
            "endIndice: " + GraphQLRequestSerializer.getEntry(endIndice),
            if (text != null) "text: " + GraphQLRequestSerializer.getEntry(text) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TextMatchHighlightTO]
        Objects.equals(beginIndice, that.beginIndice) &&
        Objects.equals(endIndice, that.endIndice) &&
        Objects.equals(text, that.text)
    }

    override def hashCode(): Int = {
        Objects.hash(beginIndice, endIndice, text)
    }
}

object TextMatchHighlightTO {

    def builder(): TextMatchHighlightTO.Builder = new Builder()

    class Builder {

        private var beginIndice: Int = _
        private var endIndice: Int = _
        private var text: String = _

        def setBeginIndice(beginIndice: Int): Builder = {
            this.beginIndice = beginIndice
            this
        }

        def setEndIndice(endIndice: Int): Builder = {
            this.endIndice = endIndice
            this
        }

        def setText(text: String): Builder = {
            this.text = text
            this
        }

        def build(): TextMatchHighlightTO = new TextMatchHighlightTO(beginIndice, endIndice, text)

    }
}
