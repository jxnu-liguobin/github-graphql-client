package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Blob
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BlobResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BlobResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BlobResponseProjection {
        this.abbreviatedOid()
        this.byteSize()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.isBinary()
        this.isTruncated()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["BlobResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.text()
        this.typename()
        return this
    }

    fun abbreviatedOid(): BlobResponseProjection = abbreviatedOid(null)

    fun abbreviatedOid(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("abbreviatedOid").alias(alias))
        return this
    }

    fun byteSize(): BlobResponseProjection = byteSize(null)

    fun byteSize(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("byteSize").alias(alias))
        return this
    }

    fun commitResourcePath(): BlobResponseProjection = commitResourcePath(null)

    fun commitResourcePath(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("commitResourcePath").alias(alias))
        return this
    }

    fun commitUrl(): BlobResponseProjection = commitUrl(null)

    fun commitUrl(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("commitUrl").alias(alias))
        return this
    }

    fun id(): BlobResponseProjection = id(null)

    fun id(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isBinary(): BlobResponseProjection = isBinary(null)

    fun isBinary(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("isBinary").alias(alias))
        return this
    }

    fun isTruncated(): BlobResponseProjection = isTruncated(null)

    fun isTruncated(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("isTruncated").alias(alias))
        return this
    }

    fun oid(): BlobResponseProjection = oid(null)

    fun oid(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): BlobResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): BlobResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun text(): BlobResponseProjection = text(null)

    fun text(alias: String?): BlobResponseProjection {
        fields.add(GraphQLResponseField("text").alias(alias))
        return this
    }

    fun typename(): BlobResponseProjection = typename(null)

    fun typename(alias: String?): BlobResponseProjection {
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
        val that = other as BlobResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
