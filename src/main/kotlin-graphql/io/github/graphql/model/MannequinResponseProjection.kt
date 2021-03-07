package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Mannequin
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MannequinResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MannequinResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MannequinResponseProjection {
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

    fun avatarUrl(): MannequinResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: MannequinAvatarUrlParametrizedInput): MannequinResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: MannequinAvatarUrlParametrizedInput): MannequinResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun createdAt(): MannequinResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): MannequinResponseProjection = databaseId(null)

    fun databaseId(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): MannequinResponseProjection = id(null)

    fun id(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun login(): MannequinResponseProjection = login(null)

    fun login(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun resourcePath(): MannequinResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): MannequinResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): MannequinResponseProjection = url(null)

    fun url(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): MannequinResponseProjection = typename(null)

    fun typename(alias: String?): MannequinResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
