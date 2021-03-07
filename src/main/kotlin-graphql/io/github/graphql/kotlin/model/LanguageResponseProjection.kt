package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Language
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as LanguageResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
