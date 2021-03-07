package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TextMatchHighlight
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TextMatchHighlightResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TextMatchHighlightResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TextMatchHighlightResponseProjection {
        this.beginIndice()
        this.endIndice()
        this.text()
        this.typename()
        return this
    }

    fun beginIndice(): TextMatchHighlightResponseProjection = beginIndice(null)

    fun beginIndice(alias: String?): TextMatchHighlightResponseProjection {
        fields.add(GraphQLResponseField("beginIndice").alias(alias))
        return this
    }

    fun endIndice(): TextMatchHighlightResponseProjection = endIndice(null)

    fun endIndice(alias: String?): TextMatchHighlightResponseProjection {
        fields.add(GraphQLResponseField("endIndice").alias(alias))
        return this
    }

    fun text(): TextMatchHighlightResponseProjection = text(null)

    fun text(alias: String?): TextMatchHighlightResponseProjection {
        fields.add(GraphQLResponseField("text").alias(alias))
        return this
    }

    fun typename(): TextMatchHighlightResponseProjection = typename(null)

    fun typename(alias: String?): TextMatchHighlightResponseProjection {
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
        val that = other as TextMatchHighlightResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
