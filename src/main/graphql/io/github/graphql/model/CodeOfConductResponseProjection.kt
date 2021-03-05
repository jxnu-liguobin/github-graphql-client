package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CodeOfConduct
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
