package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Status
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class StatusResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StatusResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StatusResponseProjection {
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["StatusResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) <= maxDepth) {
            projectionDepthOnFields["StatusResponseProjection.StatusContextResponseProjection.context"] = projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) + 1
            this.context(StatusContextResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) <= maxDepth) {
            projectionDepthOnFields["StatusResponseProjection.StatusContextResponseProjection.contexts"] = projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) + 1
            this.contexts(StatusContextResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0)))
        }
        this.id()
        this.state()
        this.typename()
        return this
    }

    fun commit(subProjection: CommitResponseProjection): StatusResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): StatusResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun context(subProjection: StatusContextResponseProjection): StatusResponseProjection = context(null, subProjection)

    fun context(alias: String?, subProjection: StatusContextResponseProjection): StatusResponseProjection {
        fields.add(GraphQLResponseField("context").alias(alias).projection(subProjection))
        return this
    }

    fun context(input: StatusContextParametrizedInput, subProjection: StatusContextResponseProjection): StatusResponseProjection = context(null, input, subProjection)

    fun context(alias: String?, input: StatusContextParametrizedInput, subProjection: StatusContextResponseProjection): StatusResponseProjection {
        fields.add(GraphQLResponseField("context").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun contexts(subProjection: StatusContextResponseProjection): StatusResponseProjection = contexts(null, subProjection)

    fun contexts(alias: String?, subProjection: StatusContextResponseProjection): StatusResponseProjection {
        fields.add(GraphQLResponseField("contexts").alias(alias).projection(subProjection))
        return this
    }

    fun id(): StatusResponseProjection = id(null)

    fun id(alias: String?): StatusResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun state(): StatusResponseProjection = state(null)

    fun state(alias: String?): StatusResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun typename(): StatusResponseProjection = typename(null)

    fun typename(alias: String?): StatusResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
