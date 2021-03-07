package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TextMatchTO(
    @javax.validation.constraints.NotNull
    fragment: String,
    @javax.validation.constraints.NotNull
    highlights: Seq[TextMatchHighlightTO],
    @javax.validation.constraints.NotNull
    property: String
) {

    override def toString(): String = {
        Seq(
            if (fragment != null) "fragment: " + GraphQLRequestSerializer.getEntry(fragment) else "",
            if (highlights != null) "highlights: " + GraphQLRequestSerializer.getEntry(highlights.asJava) else "",
            if (property != null) "property: " + GraphQLRequestSerializer.getEntry(property) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object TextMatchTO {

    def builder(): TextMatchTO.Builder = new Builder()

    class Builder {

        private var fragment: String = _
        private var highlights: Seq[TextMatchHighlightTO] = _
        private var property: String = _

        def setFragment(fragment: String): Builder = {
            this.fragment = fragment
            this
        }

        def setHighlights(highlights: Seq[TextMatchHighlightTO]): Builder = {
            this.highlights = highlights
            this
        }

        def setProperty(property: String): Builder = {
            this.property = property
            this
        }

        def build(): TextMatchTO = new TextMatchTO(fragment, highlights, property)

    }
}
