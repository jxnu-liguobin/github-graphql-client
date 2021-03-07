package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TextMatchHighlight
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
