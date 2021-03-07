package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Language
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class LanguageResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LanguageResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LanguageResponseProjection {
        this.color()
        this.id()
        this.name()
        this.typename()
        return this
    }

    fun color(): LanguageResponseProjection = color(null)

    fun color(alias: String?): LanguageResponseProjection {
        fields.add(GraphQLResponseField("color").alias(alias))
        return this
    }

    fun id(): LanguageResponseProjection = id(null)

    fun id(alias: String?): LanguageResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): LanguageResponseProjection = name(null)

    fun name(alias: String?): LanguageResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun typename(): LanguageResponseProjection = typename(null)

    fun typename(alias: String?): LanguageResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
