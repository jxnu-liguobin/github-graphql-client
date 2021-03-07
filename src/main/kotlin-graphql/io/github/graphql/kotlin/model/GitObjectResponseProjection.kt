package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GitObject
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GitObjectResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GitObjectResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GitObjectResponseProjection {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["GitObjectResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun abbreviatedOid(): GitObjectResponseProjection = abbreviatedOid(null)

    fun abbreviatedOid(alias: String?): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("abbreviatedOid").alias(alias))
        return this
    }

    fun commitResourcePath(): GitObjectResponseProjection = commitResourcePath(null)

    fun commitResourcePath(alias: String?): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("commitResourcePath").alias(alias))
        return this
    }

    fun commitUrl(): GitObjectResponseProjection = commitUrl(null)

    fun commitUrl(alias: String?): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("commitUrl").alias(alias))
        return this
    }

    fun id(): GitObjectResponseProjection = id(null)

    fun id(alias: String?): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun oid(): GitObjectResponseProjection = oid(null)

    fun oid(alias: String?): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): GitObjectResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun onBlob(subProjection: BlobResponseProjection): GitObjectResponseProjection = onBlob(null, subProjection)

    fun onBlob(alias: String?, subProjection: BlobResponseProjection): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("...on Blob").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): GitObjectResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onTree(subProjection: TreeResponseProjection): GitObjectResponseProjection = onTree(null, subProjection)

    fun onTree(alias: String?, subProjection: TreeResponseProjection): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("...on Tree").alias(alias).projection(subProjection))
        return this
    }

    fun onTag(subProjection: TagResponseProjection): GitObjectResponseProjection = onTag(null, subProjection)

    fun onTag(alias: String?, subProjection: TagResponseProjection): GitObjectResponseProjection {
        fields.add(GraphQLResponseField("...on Tag").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): GitObjectResponseProjection = typename(null)

    fun typename(alias: String?): GitObjectResponseProjection {
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
        val that = other as GitObjectResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
