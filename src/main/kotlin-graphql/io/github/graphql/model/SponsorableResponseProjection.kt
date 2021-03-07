package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Sponsorable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class SponsorableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SponsorableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SponsorableResponseProjection {
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer"] = projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1
            this.sponsorshipsAsMaintainer(SponsorshipConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields["SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor"] = projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1
            this.sponsorshipsAsSponsor(SponsorshipConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)))
        }
        this.typename()
        return this
    }

    fun sponsorshipsAsMaintainer(subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = sponsorshipsAsMaintainer(null, subProjection)

    fun sponsorshipsAsMaintainer(alias: String?, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection))
        return this
    }

    fun sponsorshipsAsMaintainer(input: SponsorableSponsorshipsAsMaintainerParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = sponsorshipsAsMaintainer(null, input, subProjection)

    fun sponsorshipsAsMaintainer(alias: String?, input: SponsorableSponsorshipsAsMaintainerParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun sponsorshipsAsSponsor(subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = sponsorshipsAsSponsor(null, subProjection)

    fun sponsorshipsAsSponsor(alias: String?, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection))
        return this
    }

    fun sponsorshipsAsSponsor(input: SponsorableSponsorshipsAsSponsorParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = sponsorshipsAsSponsor(null, input, subProjection)

    fun sponsorshipsAsSponsor(alias: String?, input: SponsorableSponsorshipsAsSponsorParametrizedInput, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): SponsorableResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SponsorableResponseProjection = typename(null)

    fun typename(alias: String?): SponsorableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
