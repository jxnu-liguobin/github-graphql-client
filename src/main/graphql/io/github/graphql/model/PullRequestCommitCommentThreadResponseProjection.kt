package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestCommitCommentThreadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestCommitCommentThreadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestCommitCommentThreadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(CommitCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        this.path()
        this.position()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun comments(subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: PullRequestCommitCommentThreadCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: PullRequestCommitCommentThreadCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): PullRequestCommitCommentThreadResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PullRequestCommitCommentThreadResponseProjection = id(null)

    fun id(alias: String?): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun path(): PullRequestCommitCommentThreadResponseProjection = path(null)

    fun path(alias: String?): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("path").alias(alias))
        return this
    }

    fun position(): PullRequestCommitCommentThreadResponseProjection = position(null)

    fun position(alias: String?): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("position").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestCommitCommentThreadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestCommitCommentThreadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestCommitCommentThreadResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestCommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
