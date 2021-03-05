package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PageInfo
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PageInfoResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PageInfoResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PageInfoResponseProjection {
        this.endCursor()
        this.hasNextPage()
        this.hasPreviousPage()
        this.startCursor()
        this.typename()
        return this
    }

    fun endCursor(): PageInfoResponseProjection = endCursor(null)

    fun endCursor(alias: String?): PageInfoResponseProjection {
        fields.add(GraphQLResponseField("endCursor").alias(alias))
        return this
    }

    fun hasNextPage(): PageInfoResponseProjection = hasNextPage(null)

    fun hasNextPage(alias: String?): PageInfoResponseProjection {
        fields.add(GraphQLResponseField("hasNextPage").alias(alias))
        return this
    }

    fun hasPreviousPage(): PageInfoResponseProjection = hasPreviousPage(null)

    fun hasPreviousPage(alias: String?): PageInfoResponseProjection {
        fields.add(GraphQLResponseField("hasPreviousPage").alias(alias))
        return this
    }

    fun startCursor(): PageInfoResponseProjection = startCursor(null)

    fun startCursor(alias: String?): PageInfoResponseProjection {
        fields.add(GraphQLResponseField("startCursor").alias(alias))
        return this
    }

    fun typename(): PageInfoResponseProjection = typename(null)

    fun typename(alias: String?): PageInfoResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
