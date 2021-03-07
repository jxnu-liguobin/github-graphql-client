package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GitActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class GitActorResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GitActorResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GitActorResponseProjection {
        this.avatarUrl()
        this.date()
        this.email()
        this.name()
        if (projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["GitActorResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun avatarUrl(): GitActorResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): GitActorResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: GitActorAvatarUrlParametrizedInput): GitActorResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: GitActorAvatarUrlParametrizedInput): GitActorResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun date(): GitActorResponseProjection = date(null)

    fun date(alias: String?): GitActorResponseProjection {
        fields.add(GraphQLResponseField("date").alias(alias))
        return this
    }

    fun email(): GitActorResponseProjection = email(null)

    fun email(alias: String?): GitActorResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun name(): GitActorResponseProjection = name(null)

    fun name(alias: String?): GitActorResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): GitActorResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): GitActorResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): GitActorResponseProjection = typename(null)

    fun typename(alias: String?): GitActorResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
