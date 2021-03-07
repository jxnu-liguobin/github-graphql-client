package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryTopic
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryTopicResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryTopicResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryTopicResponseProjection = {
        this.id()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) + 1)
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.url()
        this.typename()
        this
    }

    def id(): RepositoryTopicResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RepositoryTopicResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def resourcePath(): RepositoryTopicResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): RepositoryTopicResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def topic(subProjection: TopicResponseProjection): RepositoryTopicResponseProjection = {
        topic(null.asInstanceOf[String], subProjection)
    }

    def topic(alias: String, subProjection: TopicResponseProjection): RepositoryTopicResponseProjection = {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection))
        this
    }

    def url(): RepositoryTopicResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): RepositoryTopicResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): RepositoryTopicResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryTopicResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
