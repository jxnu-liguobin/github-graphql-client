package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Gist
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class GistResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistResponseProjection {
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["GistResponseProjection.GistCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(GistCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0)))
        }
        this.createdAt()
        this.description()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields["GistResponseProjection.GistFileResponseProjection.files"] = projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) + 1
            this.files(GistFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields["GistResponseProjection.GistConnectionResponseProjection.forks"] = projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) + 1
            this.forks(GistConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0)))
        }
        this.id()
        this.isFork()
        this.isPublic()
        this.name()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields["GistResponseProjection.RepositoryOwnerResponseProjection.owner"] = projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1
            this.owner(RepositoryOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        this.pushedAt()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields["GistResponseProjection.StargazerConnectionResponseProjection.stargazers"] = projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1
            this.stargazers(StargazerConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.updatedAt()
        this.url()
        this.viewerHasStarred()
        this.typename()
        return this
    }

    fun comments(subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: GistCommentConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: GistCommentsParametrizedInput, subProjection: GistCommentConnectionResponseProjection): GistResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: GistCommentsParametrizedInput, subProjection: GistCommentConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): GistResponseProjection = createdAt(null)

    fun createdAt(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun description(): GistResponseProjection = description(null)

    fun description(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun files(subProjection: GistFileResponseProjection): GistResponseProjection = files(null, subProjection)

    fun files(alias: String?, subProjection: GistFileResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).projection(subProjection))
        return this
    }

    fun files(input: GistFilesParametrizedInput, subProjection: GistFileResponseProjection): GistResponseProjection = files(null, input, subProjection)

    fun files(alias: String?, input: GistFilesParametrizedInput, subProjection: GistFileResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun forks(subProjection: GistConnectionResponseProjection): GistResponseProjection = forks(null, subProjection)

    fun forks(alias: String?, subProjection: GistConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("forks").alias(alias).projection(subProjection))
        return this
    }

    fun forks(input: GistForksParametrizedInput, subProjection: GistConnectionResponseProjection): GistResponseProjection = forks(null, input, subProjection)

    fun forks(alias: String?, input: GistForksParametrizedInput, subProjection: GistConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): GistResponseProjection = id(null)

    fun id(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isFork(): GistResponseProjection = isFork(null)

    fun isFork(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("isFork").alias(alias))
        return this
    }

    fun isPublic(): GistResponseProjection = isPublic(null)

    fun isPublic(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("isPublic").alias(alias))
        return this
    }

    fun name(): GistResponseProjection = name(null)

    fun name(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun owner(subProjection: RepositoryOwnerResponseProjection): GistResponseProjection = owner(null, subProjection)

    fun owner(alias: String?, subProjection: RepositoryOwnerResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("owner").alias(alias).projection(subProjection))
        return this
    }

    fun pushedAt(): GistResponseProjection = pushedAt(null)

    fun pushedAt(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("pushedAt").alias(alias))
        return this
    }

    fun resourcePath(): GistResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun stargazers(subProjection: StargazerConnectionResponseProjection): GistResponseProjection = stargazers(null, subProjection)

    fun stargazers(alias: String?, subProjection: StargazerConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        return this
    }

    fun stargazers(input: GistStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): GistResponseProjection = stargazers(null, input, subProjection)

    fun stargazers(alias: String?, input: GistStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): GistResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun updatedAt(): GistResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): GistResponseProjection = url(null)

    fun url(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerHasStarred(): GistResponseProjection = viewerHasStarred(null)

    fun viewerHasStarred(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("viewerHasStarred").alias(alias))
        return this
    }

    fun typename(): GistResponseProjection = typename(null)

    fun typename(alias: String?): GistResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
