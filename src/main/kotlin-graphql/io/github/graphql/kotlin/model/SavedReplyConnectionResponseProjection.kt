package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SavedReplyConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SavedReplyConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SavedReplyConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SavedReplyConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) + 1
            this.edges(SavedReplyEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) + 1
            this.nodes(SavedReplyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: SavedReplyEdgeResponseProjection): SavedReplyConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: SavedReplyEdgeResponseProjection): SavedReplyConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: SavedReplyResponseProjection): SavedReplyConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: SavedReplyResponseProjection): SavedReplyConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): SavedReplyConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): SavedReplyConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): SavedReplyConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): SavedReplyConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): SavedReplyConnectionResponseProjection = typename(null)

    fun typename(alias: String?): SavedReplyConnectionResponseProjection {
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
        val that = other as SavedReplyConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
