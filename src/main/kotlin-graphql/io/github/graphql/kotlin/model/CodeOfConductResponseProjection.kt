package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CodeOfConduct
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CodeOfConductResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CodeOfConductResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CodeOfConductResponseProjection {
        this.body()
        this.id()
        this.key()
        this.name()
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun body(): CodeOfConductResponseProjection = body(null)

    fun body(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun id(): CodeOfConductResponseProjection = id(null)

    fun id(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun key(): CodeOfConductResponseProjection = key(null)

    fun key(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("key").alias(alias))
        return this
    }

    fun name(): CodeOfConductResponseProjection = name(null)

    fun name(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun resourcePath(): CodeOfConductResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CodeOfConductResponseProjection = url(null)

    fun url(alias: String?): CodeOfConductResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): CodeOfConductResponseProjection = typename(null)

    fun typename(alias: String?): CodeOfConductResponseProjection {
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
        val that = other as CodeOfConductResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
