package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Status
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StatusResponseProjection extends GraphQLResponseProjection {

    override def all$(): StatusResponseProjection = all$(3)

    override def all$(maxDepth: Int): StatusResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.StatusContextResponseProjection.context", projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) + 1)
            this.context(new StatusContextResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.StatusContextResponseProjection.contexts", projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) + 1)
            this.contexts(new StatusContextResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0)))
        }
        this.id()
        this.state()
        this.typename()
        this
    }

    def commit(subProjection: CommitResponseProjection): StatusResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def context(subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        context(null.asInstanceOf[String], subProjection)
    }

    def context(alias: String, subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("context").alias(alias).projection(subProjection))
        this
    }

    def context(input: StatusContextParametrizedInput,subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        context(null.asInstanceOf[String], input, subProjection)
    }

    def context(alias: String, input: StatusContextParametrizedInput , subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("context").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def contexts(subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        contexts(null.asInstanceOf[String], subProjection)
    }

    def contexts(alias: String, subProjection: StatusContextResponseProjection): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("contexts").alias(alias).projection(subProjection))
        this
    }

    def id(): StatusResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def state(): StatusResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def typename(): StatusResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StatusResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
