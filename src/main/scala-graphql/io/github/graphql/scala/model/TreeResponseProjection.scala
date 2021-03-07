package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Tree
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TreeResponseProjection extends GraphQLResponseProjection {

    override def all$(): TreeResponseProjection = all$(3)

    override def all$(maxDepth: Int): TreeResponseProjection = {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeResponseProjection.TreeEntryResponseProjection.entries", projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) + 1)
            this.entries(new TreeEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0)))
        }
        this.id()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def abbreviatedOid(): TreeResponseProjection = {
        abbreviatedOid(null.asInstanceOf[String])
    }

    def abbreviatedOid(alias: String): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias))
        this
    }

    def commitResourcePath(): TreeResponseProjection = {
        commitResourcePath(null.asInstanceOf[String])
    }

    def commitResourcePath(alias: String): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias))
        this
    }

    def commitUrl(): TreeResponseProjection = {
        commitUrl(null.asInstanceOf[String])
    }

    def commitUrl(alias: String): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias))
        this
    }

    def entries(subProjection: TreeEntryResponseProjection): TreeResponseProjection = {
        entries(null.asInstanceOf[String], subProjection)
    }

    def entries(alias: String, subProjection: TreeEntryResponseProjection): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("entries").alias(alias).projection(subProjection))
        this
    }

    def id(): TreeResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def oid(): TreeResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): TreeResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): TreeResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): TreeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TreeResponseProjection = {
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
        val that = obj.asInstanceOf[TreeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
