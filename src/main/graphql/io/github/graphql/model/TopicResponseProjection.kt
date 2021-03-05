package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Topic
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TopicResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TopicResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TopicResponseProjection {
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) <= maxDepth) {
            projectionDepthOnFields["TopicResponseProjection.TopicResponseProjection.relatedTopics"] = projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) + 1
            this.relatedTopics(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields["TopicResponseProjection.StargazerConnectionResponseProjection.stargazers"] = projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1
            this.stargazers(StargazerConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.viewerHasStarred()
        this.typename()
        return this
    }

    fun id(): TopicResponseProjection = id(null)

    fun id(alias: String?): TopicResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): TopicResponseProjection = name(null)

    fun name(alias: String?): TopicResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun relatedTopics(subProjection: TopicResponseProjection): TopicResponseProjection = relatedTopics(null, subProjection)

    fun relatedTopics(alias: String?, subProjection: TopicResponseProjection): TopicResponseProjection {
        fields.add(GraphQLResponseField("relatedTopics").alias(alias).projection(subProjection))
        return this
    }

    fun relatedTopics(input: TopicRelatedTopicsParametrizedInput, subProjection: TopicResponseProjection): TopicResponseProjection = relatedTopics(null, input, subProjection)

    fun relatedTopics(alias: String?, input: TopicRelatedTopicsParametrizedInput, subProjection: TopicResponseProjection): TopicResponseProjection {
        fields.add(GraphQLResponseField("relatedTopics").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun stargazers(subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = stargazers(null, subProjection)

    fun stargazers(alias: String?, subProjection: StargazerConnectionResponseProjection): TopicResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        return this
    }

    fun stargazers(input: TopicStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = stargazers(null, input, subProjection)

    fun stargazers(alias: String?, input: TopicStargazersParametrizedInput, subProjection: StargazerConnectionResponseProjection): TopicResponseProjection {
        fields.add(GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerHasStarred(): TopicResponseProjection = viewerHasStarred(null)

    fun viewerHasStarred(alias: String?): TopicResponseProjection {
        fields.add(GraphQLResponseField("viewerHasStarred").alias(alias))
        return this
    }

    fun typename(): TopicResponseProjection = typename(null)

    fun typename(alias: String?): TopicResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
