package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CommitCommentThreadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitCommentThreadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitCommentThreadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(CommitCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentThreadResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        this.path()
        this.position()
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun comments(subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: CommitCommentThreadCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: CommitCommentThreadCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): CommitCommentThreadResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun id(): CommitCommentThreadResponseProjection = id(null)

    fun id(alias: String?): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun path(): CommitCommentThreadResponseProjection = path(null)

    fun path(alias: String?): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("path").alias(alias))
        return this
    }

    fun position(): CommitCommentThreadResponseProjection = position(null)

    fun position(alias: String?): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("position").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CommitCommentThreadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CommitCommentThreadResponseProjection = typename(null)

    fun typename(alias: String?): CommitCommentThreadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
