package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Actor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ActorResponseProjection extends GraphQLResponseProjection {

    override def all$(): ActorResponseProjection = all$(3)

    override def all$(maxDepth: Int): ActorResponseProjection = {
        this.avatarUrl()
        this.login()
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def avatarUrl(): ActorResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: ActorAvatarUrlParametrizedInput): ActorResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: ActorAvatarUrlParametrizedInput ): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def login(): ActorResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def resourcePath(): ActorResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): ActorResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): ActorResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): ActorResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onMannequin(subProjection: MannequinResponseProjection): ActorResponseProjection = {
        onMannequin(null.asInstanceOf[String], subProjection)
    }

    def onMannequin(alias: String, subProjection: MannequinResponseProjection): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        this
    }

    def onBot(subProjection: BotResponseProjection): ActorResponseProjection = {
        onBot(null.asInstanceOf[String], subProjection)
    }

    def onBot(alias: String, subProjection: BotResponseProjection): ActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        this
    }

    def typename(): ActorResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ActorResponseProjection = {
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
        val that = obj.asInstanceOf[ActorResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
