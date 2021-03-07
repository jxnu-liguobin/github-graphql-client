package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Blame
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BlameResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
