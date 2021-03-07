package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Sponsorship
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class SponsorshipResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SponsorshipResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SponsorshipResponseProjection {
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipResponseProjection.UserResponseProjection.maintainer"] = projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) + 1
            this.maintainer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0)))
        }
        this.privacyLevel()
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorshipResponseProjection.UserResponseProjection.sponsor"] = projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) + 1
            this.sponsor(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0)))
        }
        this.typename()
        return this
    }

    fun createdAt(): SponsorshipResponseProjection = createdAt(null)

    fun createdAt(alias: String?): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): SponsorshipResponseProjection = id(null)

    fun id(alias: String?): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun maintainer(subProjection: UserResponseProjection): SponsorshipResponseProjection = maintainer(null, subProjection)

    fun maintainer(alias: String?, subProjection: UserResponseProjection): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("maintainer").alias(alias).projection(subProjection))
        return this
    }

    fun privacyLevel(): SponsorshipResponseProjection = privacyLevel(null)

    fun privacyLevel(alias: String?): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("privacyLevel").alias(alias))
        return this
    }

    fun sponsor(subProjection: UserResponseProjection): SponsorshipResponseProjection = sponsor(null, subProjection)

    fun sponsor(alias: String?, subProjection: UserResponseProjection): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("sponsor").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SponsorshipResponseProjection = typename(null)

    fun typename(alias: String?): SponsorshipResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
