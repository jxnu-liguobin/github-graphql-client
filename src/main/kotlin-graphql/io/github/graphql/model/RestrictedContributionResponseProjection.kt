package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RestrictedContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RestrictedContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RestrictedContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RestrictedContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["RestrictedContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RestrictedContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): RestrictedContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): RestrictedContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun resourcePath(): RestrictedContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): RestrictedContributionResponseProjection = url(null)

    fun url(alias: String?): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): RestrictedContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RestrictedContributionResponseProjection = typename(null)

    fun typename(alias: String?): RestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
