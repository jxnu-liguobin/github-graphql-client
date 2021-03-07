package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactingUserEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReactingUserEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactingUserEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactingUserEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReactingUserEdgeResponseProjection.UserResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0) + 1
            this.node(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.reactedAt()
        this.typename()
        return this
    }

    fun cursor(): ReactingUserEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReactingUserEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: UserResponseProjection): ReactingUserEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: UserResponseProjection): ReactingUserEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun reactedAt(): ReactingUserEdgeResponseProjection = reactedAt(null)

    fun reactedAt(alias: String?): ReactingUserEdgeResponseProjection {
        fields.add(GraphQLResponseField("reactedAt").alias(alias))
        return this
    }

    fun typename(): ReactingUserEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReactingUserEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
