package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PublicKey
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PublicKeyResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PublicKeyResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PublicKeyResponseProjection {
        this.accessedAt()
        this.createdAt()
        this.fingerprint()
        this.id()
        this.isReadOnly()
        this.key()
        this.updatedAt()
        this.typename()
        return this
    }

    fun accessedAt(): PublicKeyResponseProjection = accessedAt(null)

    fun accessedAt(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("accessedAt").alias(alias))
        return this
    }

    fun createdAt(): PublicKeyResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun fingerprint(): PublicKeyResponseProjection = fingerprint(null)

    fun fingerprint(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("fingerprint").alias(alias))
        return this
    }

    fun id(): PublicKeyResponseProjection = id(null)

    fun id(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isReadOnly(): PublicKeyResponseProjection = isReadOnly(null)

    fun isReadOnly(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("isReadOnly").alias(alias))
        return this
    }

    fun key(): PublicKeyResponseProjection = key(null)

    fun key(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("key").alias(alias))
        return this
    }

    fun updatedAt(): PublicKeyResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): PublicKeyResponseProjection = typename(null)

    fun typename(alias: String?): PublicKeyResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
