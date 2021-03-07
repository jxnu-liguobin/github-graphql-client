package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Topic
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TopicResponseProjection extends GraphQLResponseProjection {

    override def all$(): TopicResponseProjection = all$(3)

    override def all$(maxDepth: Int): TopicResponseProjection = {
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicResponseProjection.TopicResponseProjection.relatedTopics", projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) + 1)
            this.relatedTopics(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1)
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)))
        }
        this.viewerHasStarred()
        this.typename()
        this
    }

    def id(): TopicResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): TopicResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def relatedTopics(subProjection: TopicResponseProjection): TopicResponseProjection = {
        relatedTopics(null.asInstanceOf[String], subProjection)
    }

    def relatedTopics(alias: String, subProjection: TopicResponseProjection): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("relatedTopics").alias(alias).projection(subProjection))
        this
    }

    def relatedTopics(input: TopicRelatedTopicsParametrizedInput,subProjection: TopicResponseProjection): TopicResponseProjection = {
        relatedTopics(null.asInstanceOf[String], input, subProjection)
    }

    def relatedTopics(alias: String, input: TopicRelatedTopicsParametrizedInput , subProjection: TopicResponseProjection): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("relatedTopics").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def stargazers(subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = {
        stargazers(null.asInstanceOf[String], subProjection)
    }

    def stargazers(alias: String, subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection))
        this
    }

    def stargazers(input: TopicStargazersParametrizedInput,subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = {
        stargazers(null.asInstanceOf[String], input, subProjection)
    }

    def stargazers(alias: String, input: TopicStargazersParametrizedInput , subProjection: StargazerConnectionResponseProjection): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerHasStarred(): TopicResponseProjection = {
        viewerHasStarred(null.asInstanceOf[String])
    }

    def viewerHasStarred(alias: String): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias))
        this
    }

    def typename(): TopicResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TopicResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TopicResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
