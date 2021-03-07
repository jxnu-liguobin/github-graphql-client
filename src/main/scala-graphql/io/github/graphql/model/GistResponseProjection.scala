package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Gist
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class GistResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new GistCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0)))
        }
        this.createdAt()
        this.description()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistFileResponseProjection.files", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) + 1)
            this.files(new GistFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistConnectionResponseProjection.forks", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) + 1)
            this.forks(new GistConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0)))
        }
        this.id()
        this.isFork()
        this.isPublic()
        this.name()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1)
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        this.pushedAt()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1)
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.updatedAt()
        this.url()
        this.viewerHasStarred()
        this.typename()
        this
    }

    def comments(subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: GistCommentsParametrizedInput,subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: GistCommentsParametrizedInput , subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): GistResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def description(): GistResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def files(subProjection: GistFileResponseProjection): GistResponseProjection = {
        files(null.asInstanceOf[String], subProjection)
    }

    def files(alias: String, subProjection: GistFileResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection))
        this
    }

    def files(input: GistFilesParametrizedInput,subProjection: GistFileResponseProjection): GistResponseProjection = {
        files(null.asInstanceOf[String], input, subProjection)
    }

    def files(alias: String, input: GistFilesParametrizedInput , subProjection: GistFileResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def forks(subProjection: GistConnectionResponseProjection): GistResponseProjection = {
        forks(null.asInstanceOf[String], subProjection)
    }

    def forks(alias: String, subProjection: GistConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("forks").alias(alias).projection(subProjection))
        this
    }

    def forks(input: GistForksParametrizedInput,subProjection: GistConnectionResponseProjection): GistResponseProjection = {
        forks(null.asInstanceOf[String], input, subProjection)
    }

    def forks(alias: String, input: GistForksParametrizedInput , subProjection: GistConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): GistResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isFork(): GistResponseProjection = {
        isFork(null.asInstanceOf[String])
    }

    def isFork(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("isFork").alias(alias))
        this
    }

    def isPublic(): GistResponseProjection = {
        isPublic(null.asInstanceOf[String])
    }

    def isPublic(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("isPublic").alias(alias))
        this
    }

    def name(): GistResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def owner(subProjection: RepositoryOwnerResponseProjection): GistResponseProjection = {
        owner(null.asInstanceOf[String], subProjection)
    }

    def owner(alias: String, subProjection: RepositoryOwnerResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection))
        this
    }

    def pushedAt(): GistResponseProjection = {
        pushedAt(null.asInstanceOf[String])
    }

    def pushedAt(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias))
        this
    }

    def resourcePath(): GistResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def stargazers(subProjection: StargazerConnectionResponseProjection): GistResponseProjection = {
        stargazers(null.asInstanceOf[String], subProjection)
    }

    def stargazers(alias: String, subProjection: StargazerConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        this
    }

    def stargazers(input: GistStargazersParametrizedInput,subProjection: StargazerConnectionResponseProjection): GistResponseProjection = {
        stargazers(null.asInstanceOf[String], input, subProjection)
    }

    def stargazers(alias: String, input: GistStargazersParametrizedInput , subProjection: StargazerConnectionResponseProjection): GistResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def updatedAt(): GistResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): GistResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerHasStarred(): GistResponseProjection = {
        viewerHasStarred(null.asInstanceOf[String])
    }

    def viewerHasStarred(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias))
        this
    }

    def typename(): GistResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
