package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CodeOfConduct
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CodeOfConductResponseProjection extends GraphQLResponseProjection {

    override def all$(): CodeOfConductResponseProjection = all$(3)

    override def all$(maxDepth: Int): CodeOfConductResponseProjection = {
        this.body()
        this.id()
        this.key()
        this.name()
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def body(): CodeOfConductResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def id(): CodeOfConductResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def key(): CodeOfConductResponseProjection = {
        key(null.asInstanceOf[String])
    }

    def key(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("key").alias(alias))
        this
    }

    def name(): CodeOfConductResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def resourcePath(): CodeOfConductResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): CodeOfConductResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): CodeOfConductResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CodeOfConductResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
