package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Sponsorable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SponsorableResponseProjection extends GraphQLResponseProjection {

    override def all$(): SponsorableResponseProjection = all$(3)

    override def all$(maxDepth: Int): SponsorableResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1)
            this.sponsorshipsAsMaintainer(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1)
            this.sponsorshipsAsSponsor(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)))
        }
        this.typename()
        this
    }

    def sponsorshipsAsMaintainer(subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        sponsorshipsAsMaintainer(null.asInstanceOf[String], subProjection)
    }

    def sponsorshipsAsMaintainer(alias: String, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection))
        this
    }

    def sponsorshipsAsMaintainer(input: SponsorableSponsorshipsAsMaintainerParametrizedInput,subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        sponsorshipsAsMaintainer(null.asInstanceOf[String], input, subProjection)
    }

    def sponsorshipsAsMaintainer(alias: String, input: SponsorableSponsorshipsAsMaintainerParametrizedInput , subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def sponsorshipsAsSponsor(subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        sponsorshipsAsSponsor(null.asInstanceOf[String], subProjection)
    }

    def sponsorshipsAsSponsor(alias: String, subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection))
        this
    }

    def sponsorshipsAsSponsor(input: SponsorableSponsorshipsAsSponsorParametrizedInput,subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        sponsorshipsAsSponsor(null.asInstanceOf[String], input, subProjection)
    }

    def sponsorshipsAsSponsor(alias: String, input: SponsorableSponsorshipsAsSponsorParametrizedInput , subProjection: SponsorshipConnectionResponseProjection): SponsorableResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): SponsorableResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): SponsorableResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): SponsorableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SponsorableResponseProjection = {
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
        val that = obj.asInstanceOf[SponsorableResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
