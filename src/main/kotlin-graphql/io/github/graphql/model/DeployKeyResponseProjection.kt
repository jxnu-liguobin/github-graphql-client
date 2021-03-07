package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeployKey
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeployKeyResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeployKeyResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeployKeyResponseProjection {
        this.createdAt()
        this.id()
        this.key()
        this.readOnly()
        this.title()
        this.verified()
        this.typename()
        return this
    }

    fun createdAt(): DeployKeyResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): DeployKeyResponseProjection = id(null)

    fun id(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun key(): DeployKeyResponseProjection = key(null)

    fun key(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("key").alias(alias))
        return this
    }

    fun readOnly(): DeployKeyResponseProjection = readOnly(null)

    fun readOnly(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("readOnly").alias(alias))
        return this
    }

    fun title(): DeployKeyResponseProjection = title(null)

    fun title(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun verified(): DeployKeyResponseProjection = verified(null)

    fun verified(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("verified").alias(alias))
        return this
    }

    fun typename(): DeployKeyResponseProjection = typename(null)

    fun typename(alias: String?): DeployKeyResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
