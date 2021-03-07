package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeployKey
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeployKeyResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeployKeyResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeployKeyResponseProjection = {
        this.createdAt()
        this.id()
        this.key()
        this.readOnly()
        this.title()
        this.verified()
        this.typename()
        this
    }

    def createdAt(): DeployKeyResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): DeployKeyResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def key(): DeployKeyResponseProjection = {
        key(null.asInstanceOf[String])
    }

    def key(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("key").alias(alias))
        this
    }

    def readOnly(): DeployKeyResponseProjection = {
        readOnly(null.asInstanceOf[String])
    }

    def readOnly(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("readOnly").alias(alias))
        this
    }

    def title(): DeployKeyResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def verified(): DeployKeyResponseProjection = {
        verified(null.asInstanceOf[String])
    }

    def verified(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("verified").alias(alias))
        this
    }

    def typename(): DeployKeyResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeployKeyResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
