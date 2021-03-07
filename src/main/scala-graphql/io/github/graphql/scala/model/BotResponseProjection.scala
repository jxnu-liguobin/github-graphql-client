package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Bot
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BotResponseProjection extends GraphQLResponseProjection {

    override def all$(): BotResponseProjection = all$(3)

    override def all$(maxDepth: Int): BotResponseProjection = {
        this.avatarUrl()
        this.createdAt()
        this.databaseId()
        this.id()
        this.login()
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def avatarUrl(): BotResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: BotAvatarUrlParametrizedInput): BotResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: BotAvatarUrlParametrizedInput ): BotResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def createdAt(): BotResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): BotResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): BotResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def login(): BotResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def resourcePath(): BotResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def updatedAt(): BotResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): BotResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): BotResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): BotResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BotResponseProjection = {
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
        val that = obj.asInstanceOf[BotResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
