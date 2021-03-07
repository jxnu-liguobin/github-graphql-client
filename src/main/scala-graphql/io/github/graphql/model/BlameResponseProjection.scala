package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Blame
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class BlameResponseProjection extends GraphQLResponseProjection {

    override def all$(): BlameResponseProjection = all$(3)

    override def all$(maxDepth: Int): BlameResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlameResponseProjection.BlameRangeResponseProjection.ranges", projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) + 1)
            this.ranges(new BlameRangeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0)))
        }
        this.typename()
        this
    }

    def ranges(subProjection: BlameRangeResponseProjection): BlameResponseProjection = {
        ranges(null.asInstanceOf[String], subProjection)
    }

    def ranges(alias: String, subProjection: BlameRangeResponseProjection): BlameResponseProjection = {
        fields.add(new GraphQLResponseField("ranges").alias(alias).projection(subProjection))
        this
    }

    def typename(): BlameResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BlameResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
