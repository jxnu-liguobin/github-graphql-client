package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Blame
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BlameResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BlameResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BlameResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) <= maxDepth) {
            projectionDepthOnFields["BlameResponseProjection.BlameRangeResponseProjection.ranges"] = projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) + 1
            this.ranges(BlameRangeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0)))
        }
        this.typename()
        return this
    }

    fun ranges(subProjection: BlameRangeResponseProjection): BlameResponseProjection = ranges(null, subProjection)

    fun ranges(alias: String?, subProjection: BlameRangeResponseProjection): BlameResponseProjection {
        fields.add(GraphQLResponseField("ranges").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): BlameResponseProjection = typename(null)

    fun typename(alias: String?): BlameResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
