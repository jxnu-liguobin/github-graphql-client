package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestCommit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestCommitResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestCommitResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestCommitResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun commit(subProjection: CommitResponseProjection): PullRequestCommitResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PullRequestCommitResponseProjection = id(null)

    fun id(alias: String?): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestCommitResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): PullRequestCommitResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): PullRequestCommitResponseProjection = url(null)

    fun url(alias: String?): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): PullRequestCommitResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestCommitResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
