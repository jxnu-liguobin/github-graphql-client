package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitCommentThread
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitCommentThreadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitCommentThreadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitCommentThreadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        this.path()
        this.position()
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def comments(subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: CommitCommentThreadCommentsParametrizedInput,subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: CommitCommentThreadCommentsParametrizedInput , subProjection: CommitCommentConnectionResponseProjection): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commit(subProjection: CommitResponseProjection): CommitCommentThreadResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def id(): CommitCommentThreadResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def path(): CommitCommentThreadResponseProjection = {
        path(null.asInstanceOf[String])
    }

    def path(alias: String): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("path").alias(alias))
        this
    }

    def position(): CommitCommentThreadResponseProjection = {
        position(null.asInstanceOf[String])
    }

    def position(alias: String): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("position").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CommitCommentThreadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): CommitCommentThreadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
