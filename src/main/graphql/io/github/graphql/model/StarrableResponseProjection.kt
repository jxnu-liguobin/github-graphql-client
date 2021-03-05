package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Starrable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class StarrableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StarrableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StarrableResponseProjection {
        this.id()
        if (projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields["StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers"] = projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1
            this.stargazers(StargazerConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.viewerHasStarred()
        this.typename()
        return this
    }

    fun id(): StarrableResponseProjection = id(null)

    fun id(alias: String?): StarrableResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun stargazers(subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = stargazers(null, subProjection)

    fun stargazers(alias: String?, subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        return this
    }

    fun stargazers(input: StarrableStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = stargazers(null, input, subProjection)

    fun stargazers(alias: String?, input: StarrableStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerHasStarred(): StarrableResponseProjection = viewerHasStarred(null)

    fun viewerHasStarred(alias: String?): StarrableResponseProjection {
        fields.add(GraphQLResponseField("viewerHasStarred").alias(alias))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): StarrableResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): StarrableResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onGist(subProjection: GistResponseProjection): StarrableResponseProjection = onGist(null, subProjection)

    fun onGist(alias: String?, subProjection: GistResponseProjection): StarrableResponseProjection {
        fields.add(GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        return this
    }

    fun onTopic(subProjection: TopicResponseProjection): StarrableResponseProjection = onTopic(null, subProjection)

    fun onTopic(alias: String?, subProjection: TopicResponseProjection): StarrableResponseProjection {
        fields.add(GraphQLResponseField("...on Topic").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): StarrableResponseProjection = typename(null)

    fun typename(alias: String?): StarrableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
