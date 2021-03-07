package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TextMatch
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TextMatchResponseProjection extends GraphQLResponseProjection {

    override def all$(): TextMatchResponseProjection = all$(3)

    override def all$(maxDepth: Int): TextMatchResponseProjection = {
        this.fragment()
        if (projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) <= maxDepth) {
            projectionDepthOnFields.put("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) + 1)
            this.highlights(new TextMatchHighlightResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0)))
        }
        this.property()
        this.typename()
        this
    }

    def fragment(): TextMatchResponseProjection = {
        fragment(null.asInstanceOf[String])
    }

    def fragment(alias: String): TextMatchResponseProjection = {
        fields.add(new GraphQLResponseField("fragment").alias(alias))
        this
    }

    def highlights(subProjection: TextMatchHighlightResponseProjection): TextMatchResponseProjection = {
        highlights(null.asInstanceOf[String], subProjection)
    }

    def highlights(alias: String, subProjection: TextMatchHighlightResponseProjection): TextMatchResponseProjection = {
        fields.add(new GraphQLResponseField("highlights").alias(alias).projection(subProjection))
        this
    }

    def property(): TextMatchResponseProjection = {
        property(null.asInstanceOf[String])
    }

    def property(alias: String): TextMatchResponseProjection = {
        fields.add(new GraphQLResponseField("property").alias(alias))
        this
    }

    def typename(): TextMatchResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TextMatchResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
