package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for App
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AppResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AppResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AppResponseProjection {
        this.createdAt()
        this.databaseId()
        this.description()
        this.id()
        this.logoBackgroundColor()
        this.logoUrl()
        this.name()
        this.slug()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun createdAt(): AppResponseProjection = createdAt(null)

    fun createdAt(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): AppResponseProjection = databaseId(null)

    fun databaseId(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun description(): AppResponseProjection = description(null)

    fun description(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun id(): AppResponseProjection = id(null)

    fun id(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun logoBackgroundColor(): AppResponseProjection = logoBackgroundColor(null)

    fun logoBackgroundColor(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("logoBackgroundColor").alias(alias))
        return this
    }

    fun logoUrl(): AppResponseProjection = logoUrl(null)

    fun logoUrl(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("logoUrl").alias(alias))
        return this
    }

    fun logoUrl(input: AppLogoUrlParametrizedInput): AppResponseProjection = logoUrl(null, input)

    fun logoUrl(alias: String?, input: AppLogoUrlParametrizedInput): AppResponseProjection {
        fields.add(GraphQLResponseField("logoUrl").alias(alias).parameters(input))
        return this
    }

    fun name(): AppResponseProjection = name(null)

    fun name(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun slug(): AppResponseProjection = slug(null)

    fun slug(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("slug").alias(alias))
        return this
    }

    fun updatedAt(): AppResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): AppResponseProjection = url(null)

    fun url(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): AppResponseProjection = typename(null)

    fun typename(alias: String?): AppResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
