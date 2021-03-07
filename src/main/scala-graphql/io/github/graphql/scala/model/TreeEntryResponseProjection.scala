package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TreeEntry
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TreeEntryResponseProjection extends GraphQLResponseProjection {

    override def all$(): TreeEntryResponseProjection = all$(3)

    override def all$(maxDepth: Int): TreeEntryResponseProjection = {
        this.mode()
        this.name()
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0) + 1)
            this.`object`(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0)))
        }
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeEntryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.`type`()
        this.typename()
        this
    }

    def mode(): TreeEntryResponseProjection = {
        mode(null.asInstanceOf[String])
    }

    def mode(alias: String): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("mode").alias(alias))
        this
    }

    def name(): TreeEntryResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def `object`(subProjection: GitObjectResponseProjection): TreeEntryResponseProjection = {
        `object`(null.asInstanceOf[String], subProjection)
    }

    def `object`(alias: String, subProjection: GitObjectResponseProjection): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("object").alias(alias).projection(subProjection))
        this
    }

    def oid(): TreeEntryResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): TreeEntryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def `type`(): TreeEntryResponseProjection = {
        `type`(null.asInstanceOf[String])
    }

    def `type`(alias: String): TreeEntryResponseProjection = {
        fields.add(new GraphQLResponseField("type").alias(alias))
        this
    }

    def typename(): TreeEntryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TreeEntryResponseProjection = {
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
        val that = obj.asInstanceOf[TreeEntryResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
