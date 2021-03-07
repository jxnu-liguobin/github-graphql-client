package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GitObject
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class GitObjectResponseProjection extends GraphQLResponseProjection {

    override def all$(): GitObjectResponseProjection = all$(3)

    override def all$(maxDepth: Int): GitObjectResponseProjection = {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitObjectResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def abbreviatedOid(): GitObjectResponseProjection = {
        abbreviatedOid(null.asInstanceOf[String])
    }

    def abbreviatedOid(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias))
        this
    }

    def commitResourcePath(): GitObjectResponseProjection = {
        commitResourcePath(null.asInstanceOf[String])
    }

    def commitResourcePath(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias))
        this
    }

    def commitUrl(): GitObjectResponseProjection = {
        commitUrl(null.asInstanceOf[String])
    }

    def commitUrl(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias))
        this
    }

    def id(): GitObjectResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def oid(): GitObjectResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): GitObjectResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def onBlob(subProjection: BlobResponseProjection): GitObjectResponseProjection = {
        onBlob(null.asInstanceOf[String], subProjection)
    }

    def onBlob(alias: String, subProjection: BlobResponseProjection): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Blob").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): GitObjectResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onTree(subProjection: TreeResponseProjection): GitObjectResponseProjection = {
        onTree(null.asInstanceOf[String], subProjection)
    }

    def onTree(alias: String, subProjection: TreeResponseProjection): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Tree").alias(alias).projection(subProjection))
        this
    }

    def onTag(subProjection: TagResponseProjection): GitObjectResponseProjection = {
        onTag(null.asInstanceOf[String], subProjection)
    }

    def onTag(alias: String, subProjection: TagResponseProjection): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection))
        this
    }

    def typename(): GitObjectResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GitObjectResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
