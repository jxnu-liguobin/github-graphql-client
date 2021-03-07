package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BlameRange
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BlameRangeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BlameRangeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BlameRangeResponseProjection {
        this.age()
        if (projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["BlameRangeResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.endingLine()
        this.startingLine()
        this.typename()
        return this
    }

    fun age(): BlameRangeResponseProjection = age(null)

    fun age(alias: String?): BlameRangeResponseProjection {
        fields.add(GraphQLResponseField("age").alias(alias))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): BlameRangeResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): BlameRangeResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun endingLine(): BlameRangeResponseProjection = endingLine(null)

    fun endingLine(alias: String?): BlameRangeResponseProjection {
        fields.add(GraphQLResponseField("endingLine").alias(alias))
        return this
    }

    fun startingLine(): BlameRangeResponseProjection = startingLine(null)

    fun startingLine(alias: String?): BlameRangeResponseProjection {
        fields.add(GraphQLResponseField("startingLine").alias(alias))
        return this
    }

    fun typename(): BlameRangeResponseProjection = typename(null)

    fun typename(alias: String?): BlameRangeResponseProjection {
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
        val that = other as BlameRangeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
