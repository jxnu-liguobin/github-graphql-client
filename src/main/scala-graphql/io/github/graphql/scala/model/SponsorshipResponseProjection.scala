package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Sponsorship
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SponsorshipResponseProjection extends GraphQLResponseProjection {

    override def all$(): SponsorshipResponseProjection = all$(3)

    override def all$(maxDepth: Int): SponsorshipResponseProjection = {
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipResponseProjection.UserResponseProjection.maintainer", projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) + 1)
            this.maintainer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0)))
        }
        this.privacyLevel()
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipResponseProjection.UserResponseProjection.sponsor", projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) + 1)
            this.sponsor(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0)))
        }
        this.typename()
        this
    }

    def createdAt(): SponsorshipResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): SponsorshipResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): SponsorshipResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SponsorshipResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def maintainer(subProjection: UserResponseProjection): SponsorshipResponseProjection = {
        maintainer(null.asInstanceOf[String], subProjection)
    }

    def maintainer(alias: String, subProjection: UserResponseProjection): SponsorshipResponseProjection = {
        fields.add(new GraphQLResponseField("maintainer").alias(alias).projection(subProjection))
        this
    }

    def privacyLevel(): SponsorshipResponseProjection = {
        privacyLevel(null.asInstanceOf[String])
    }

    def privacyLevel(alias: String): SponsorshipResponseProjection = {
        fields.add(new GraphQLResponseField("privacyLevel").alias(alias))
        this
    }

    def sponsor(subProjection: UserResponseProjection): SponsorshipResponseProjection = {
        sponsor(null.asInstanceOf[String], subProjection)
    }

    def sponsor(alias: String, subProjection: UserResponseProjection): SponsorshipResponseProjection = {
        fields.add(new GraphQLResponseField("sponsor").alias(alias).projection(subProjection))
        this
    }

    def typename(): SponsorshipResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SponsorshipResponseProjection = {
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
        val that = obj.asInstanceOf[SponsorshipResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
