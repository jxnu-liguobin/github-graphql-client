package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TextMatchHighlight
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TextMatchHighlightResponseProjection extends GraphQLResponseProjection {

    override def all$(): TextMatchHighlightResponseProjection = all$(3)

    override def all$(maxDepth: Int): TextMatchHighlightResponseProjection = {
        this.beginIndice()
        this.endIndice()
        this.text()
        this.typename()
        this
    }

    def beginIndice(): TextMatchHighlightResponseProjection = {
        beginIndice(null.asInstanceOf[String])
    }

    def beginIndice(alias: String): TextMatchHighlightResponseProjection = {
        fields.add(new GraphQLResponseField("beginIndice").alias(alias))
        this
    }

    def endIndice(): TextMatchHighlightResponseProjection = {
        endIndice(null.asInstanceOf[String])
    }

    def endIndice(alias: String): TextMatchHighlightResponseProjection = {
        fields.add(new GraphQLResponseField("endIndice").alias(alias))
        this
    }

    def text(): TextMatchHighlightResponseProjection = {
        text(null.asInstanceOf[String])
    }

    def text(alias: String): TextMatchHighlightResponseProjection = {
        fields.add(new GraphQLResponseField("text").alias(alias))
        this
    }

    def typename(): TextMatchHighlightResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TextMatchHighlightResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
