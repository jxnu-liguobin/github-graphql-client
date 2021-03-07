package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TextMatch
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TextMatchResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TextMatchResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TextMatchResponseProjection {
        this.fragment()
        if (projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) <= maxDepth) {
            projectionDepthOnFields["TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights"] = projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0) + 1
            this.highlights(TextMatchHighlightResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TextMatchResponseProjection.TextMatchHighlightResponseProjection.highlights", 0)))
        }
        this.property()
        this.typename()
        return this
    }

    fun fragment(): TextMatchResponseProjection = fragment(null)

    fun fragment(alias: String?): TextMatchResponseProjection {
        fields.add(GraphQLResponseField("fragment").alias(alias))
        return this
    }

    fun highlights(subProjection: TextMatchHighlightResponseProjection): TextMatchResponseProjection = highlights(null, subProjection)

    fun highlights(alias: String?, subProjection: TextMatchHighlightResponseProjection): TextMatchResponseProjection {
        fields.add(GraphQLResponseField("highlights").alias(alias).projection(subProjection))
        return this
    }

    fun property(): TextMatchResponseProjection = property(null)

    fun property(alias: String?): TextMatchResponseProjection {
        fields.add(GraphQLResponseField("property").alias(alias))
        return this
    }

    fun typename(): TextMatchResponseProjection = typename(null)

    fun typename(alias: String?): TextMatchResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TextMatchResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
