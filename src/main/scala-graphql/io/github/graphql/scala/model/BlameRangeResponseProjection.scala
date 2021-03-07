package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BlameRange
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BlameRangeResponseProjection extends GraphQLResponseProjection {

    override def all$(): BlameRangeResponseProjection = all$(3)

    override def all$(maxDepth: Int): BlameRangeResponseProjection = {
        this.age()
        if (projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlameRangeResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.endingLine()
        this.startingLine()
        this.typename()
        this
    }

    def age(): BlameRangeResponseProjection = {
        age(null.asInstanceOf[String])
    }

    def age(alias: String): BlameRangeResponseProjection = {
        fields.add(new GraphQLResponseField("age").alias(alias))
        this
    }

    def commit(subProjection: CommitResponseProjection): BlameRangeResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): BlameRangeResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def endingLine(): BlameRangeResponseProjection = {
        endingLine(null.asInstanceOf[String])
    }

    def endingLine(alias: String): BlameRangeResponseProjection = {
        fields.add(new GraphQLResponseField("endingLine").alias(alias))
        this
    }

    def startingLine(): BlameRangeResponseProjection = {
        startingLine(null.asInstanceOf[String])
    }

    def startingLine(alias: String): BlameRangeResponseProjection = {
        fields.add(new GraphQLResponseField("startingLine").alias(alias))
        this
    }

    def typename(): BlameRangeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BlameRangeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BlameRangeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
