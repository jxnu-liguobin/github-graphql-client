package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Starrable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StarrableResponseProjection extends GraphQLResponseProjection {

    override def all$(): StarrableResponseProjection = all$(3)

    override def all$(maxDepth: Int): StarrableResponseProjection = {
        this.id()
        if (projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1)
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.viewerHasStarred()
        this.typename()
        this
    }

    def id(): StarrableResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def stargazers(subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = {
        stargazers(null.asInstanceOf[String], subProjection)
    }

    def stargazers(alias: String, subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        this
    }

    def stargazers(input: StarrableStargazersParametrizedInput,subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = {
        stargazers(null.asInstanceOf[String], input, subProjection)
    }

    def stargazers(alias: String, input: StarrableStargazersParametrizedInput , subProjection: StargazerConnectionResponseProjection): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerHasStarred(): StarrableResponseProjection = {
        viewerHasStarred(null.asInstanceOf[String])
    }

    def viewerHasStarred(alias: String): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): StarrableResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onGist(subProjection: GistResponseProjection): StarrableResponseProjection = {
        onGist(null.asInstanceOf[String], subProjection)
    }

    def onGist(alias: String, subProjection: GistResponseProjection): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        this
    }

    def onTopic(subProjection: TopicResponseProjection): StarrableResponseProjection = {
        onTopic(null.asInstanceOf[String], subProjection)
    }

    def onTopic(alias: String, subProjection: TopicResponseProjection): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Topic").alias(alias).projection(subProjection))
        this
    }

    def typename(): StarrableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StarrableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
