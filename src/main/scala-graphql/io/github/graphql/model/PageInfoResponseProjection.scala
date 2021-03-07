package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PageInfo
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PageInfoResponseProjection extends GraphQLResponseProjection {

    override def all$(): PageInfoResponseProjection = all$(3)

    override def all$(maxDepth: Int): PageInfoResponseProjection = {
        this.endCursor()
        this.hasNextPage()
        this.hasPreviousPage()
        this.startCursor()
        this.typename()
        this
    }

    def endCursor(): PageInfoResponseProjection = {
        endCursor(null.asInstanceOf[String])
    }

    def endCursor(alias: String): PageInfoResponseProjection = {
        fields.add(new GraphQLResponseField("endCursor").alias(alias))
        this
    }

    def hasNextPage(): PageInfoResponseProjection = {
        hasNextPage(null.asInstanceOf[String])
    }

    def hasNextPage(alias: String): PageInfoResponseProjection = {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias))
        this
    }

    def hasPreviousPage(): PageInfoResponseProjection = {
        hasPreviousPage(null.asInstanceOf[String])
    }

    def hasPreviousPage(alias: String): PageInfoResponseProjection = {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias))
        this
    }

    def startCursor(): PageInfoResponseProjection = {
        startCursor(null.asInstanceOf[String])
    }

    def startCursor(alias: String): PageInfoResponseProjection = {
        fields.add(new GraphQLResponseField("startCursor").alias(alias))
        this
    }

    def typename(): PageInfoResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PageInfoResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
