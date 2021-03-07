package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Mannequin
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MannequinResponseProjection extends GraphQLResponseProjection {

    override def all$(): MannequinResponseProjection = all$(3)

    override def all$(maxDepth: Int): MannequinResponseProjection = {
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

    def avatarUrl(): MannequinResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: MannequinAvatarUrlParametrizedInput): MannequinResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: MannequinAvatarUrlParametrizedInput ): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def createdAt(): MannequinResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): MannequinResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): MannequinResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def login(): MannequinResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def resourcePath(): MannequinResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def updatedAt(): MannequinResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): MannequinResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): MannequinResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MannequinResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
