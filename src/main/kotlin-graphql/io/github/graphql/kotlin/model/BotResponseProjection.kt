package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Bot
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BotResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BotResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BotResponseProjection {
        this.avatarUrl()
        this.createdAt()
        this.databaseId()
        this.id()
        this.login()
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun avatarUrl(): BotResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: BotAvatarUrlParametrizedInput): BotResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: BotAvatarUrlParametrizedInput): BotResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun createdAt(): BotResponseProjection = createdAt(null)

    fun createdAt(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): BotResponseProjection = databaseId(null)

    fun databaseId(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): BotResponseProjection = id(null)

    fun id(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun login(): BotResponseProjection = login(null)

    fun login(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun resourcePath(): BotResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): BotResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): BotResponseProjection = url(null)

    fun url(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): BotResponseProjection = typename(null)

    fun typename(alias: String?): BotResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BotResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
