package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for App
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AppResponseProjection extends GraphQLResponseProjection {

    override def all$(): AppResponseProjection = all$(3)

    override def all$(maxDepth: Int): AppResponseProjection = {
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
        this
    }

    def createdAt(): AppResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): AppResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def description(): AppResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def id(): AppResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def logoBackgroundColor(): AppResponseProjection = {
        logoBackgroundColor(null.asInstanceOf[String])
    }

    def logoBackgroundColor(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("logoBackgroundColor").alias(alias))
        this
    }

    def logoUrl(): AppResponseProjection = {
        logoUrl(null.asInstanceOf[String])
    }

    def logoUrl(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias))
        this
    }

    def logoUrl(input: AppLogoUrlParametrizedInput): AppResponseProjection = {
        logoUrl(null.asInstanceOf[String], input)
    }

    def logoUrl(alias: String, input: AppLogoUrlParametrizedInput ): AppResponseProjection = {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias).parameters(input))
        this
    }

    def name(): AppResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def slug(): AppResponseProjection = {
        slug(null.asInstanceOf[String])
    }

    def slug(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("slug").alias(alias))
        this
    }

    def updatedAt(): AppResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): AppResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): AppResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): AppResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AppResponseProjection = {
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
        val that = obj.asInstanceOf[AppResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
