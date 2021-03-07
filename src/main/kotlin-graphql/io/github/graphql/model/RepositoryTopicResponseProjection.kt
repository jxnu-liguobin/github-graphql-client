package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryTopic
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RepositoryTopicResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryTopicResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryTopicResponseProjection {
        this.id()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryTopicResponseProjection.TopicResponseProjection.topic"] = projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) + 1
            this.topic(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.url()
        this.typename()
        return this
    }

    fun id(): RepositoryTopicResponseProjection = id(null)

    fun id(alias: String?): RepositoryTopicResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun resourcePath(): RepositoryTopicResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): RepositoryTopicResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun topic(subProjection: TopicResponseProjection): RepositoryTopicResponseProjection = topic(null, subProjection)

    fun topic(alias: String?, subProjection: TopicResponseProjection): RepositoryTopicResponseProjection {
        fields.add(GraphQLResponseField("topic").alias(alias).projection(subProjection))
        return this
    }

    fun url(): RepositoryTopicResponseProjection = url(null)

    fun url(alias: String?): RepositoryTopicResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): RepositoryTopicResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryTopicResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
