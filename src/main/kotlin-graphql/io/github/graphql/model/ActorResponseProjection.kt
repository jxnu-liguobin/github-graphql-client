package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Actor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ActorResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ActorResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ActorResponseProjection {
        this.avatarUrl()
        this.login()
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun avatarUrl(): ActorResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): ActorResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: ActorAvatarUrlParametrizedInput): ActorResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: ActorAvatarUrlParametrizedInput): ActorResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun login(): ActorResponseProjection = login(null)

    fun login(alias: String?): ActorResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun resourcePath(): ActorResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ActorResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): ActorResponseProjection = url(null)

    fun url(alias: String?): ActorResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): ActorResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): ActorResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): ActorResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): ActorResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onMannequin(subProjection: MannequinResponseProjection): ActorResponseProjection = onMannequin(null, subProjection)

    fun onMannequin(alias: String?, subProjection: MannequinResponseProjection): ActorResponseProjection {
        fields.add(GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        return this
    }

    fun onBot(subProjection: BotResponseProjection): ActorResponseProjection = onBot(null, subProjection)

    fun onBot(alias: String?, subProjection: BotResponseProjection): ActorResponseProjection {
        fields.add(GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ActorResponseProjection = typename(null)

    fun typename(alias: String?): ActorResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
