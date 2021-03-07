package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Blob
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BlobResponseProjection extends GraphQLResponseProjection {

    override def all$(): BlobResponseProjection = all$(3)

    override def all$(maxDepth: Int): BlobResponseProjection = {
        this.abbreviatedOid()
        this.byteSize()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.isBinary()
        this.isTruncated()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlobResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.text()
        this.typename()
        this
    }

    def abbreviatedOid(): BlobResponseProjection = {
        abbreviatedOid(null.asInstanceOf[String])
    }

    def abbreviatedOid(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias))
        this
    }

    def byteSize(): BlobResponseProjection = {
        byteSize(null.asInstanceOf[String])
    }

    def byteSize(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("byteSize").alias(alias))
        this
    }

    def commitResourcePath(): BlobResponseProjection = {
        commitResourcePath(null.asInstanceOf[String])
    }

    def commitResourcePath(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias))
        this
    }

    def commitUrl(): BlobResponseProjection = {
        commitUrl(null.asInstanceOf[String])
    }

    def commitUrl(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias))
        this
    }

    def id(): BlobResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isBinary(): BlobResponseProjection = {
        isBinary(null.asInstanceOf[String])
    }

    def isBinary(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("isBinary").alias(alias))
        this
    }

    def isTruncated(): BlobResponseProjection = {
        isTruncated(null.asInstanceOf[String])
    }

    def isTruncated(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("isTruncated").alias(alias))
        this
    }

    def oid(): BlobResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): BlobResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def text(): BlobResponseProjection = {
        text(null.asInstanceOf[String])
    }

    def text(alias: String): BlobResponseProjection = {
        fields.add(new GraphQLResponseField("text").alias(alias))
        this
    }

    def typename(): BlobResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BlobResponseProjection = {
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
        val that = obj.asInstanceOf[BlobResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
