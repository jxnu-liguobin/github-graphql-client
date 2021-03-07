package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GitActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class GitActorResponseProjection extends GraphQLResponseProjection {

    override def all$(): GitActorResponseProjection = all$(3)

    override def all$(maxDepth: Int): GitActorResponseProjection = {
        this.avatarUrl()
        this.date()
        this.email()
        this.name()
        if (projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitActorResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def avatarUrl(): GitActorResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: GitActorAvatarUrlParametrizedInput): GitActorResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: GitActorAvatarUrlParametrizedInput ): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def date(): GitActorResponseProjection = {
        date(null.asInstanceOf[String])
    }

    def date(alias: String): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("date").alias(alias))
        this
    }

    def email(): GitActorResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def name(): GitActorResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): GitActorResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): GitActorResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GitActorResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
