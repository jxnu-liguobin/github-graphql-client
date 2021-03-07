package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PublicKey
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PublicKeyResponseProjection extends GraphQLResponseProjection {

    override def all$(): PublicKeyResponseProjection = all$(3)

    override def all$(maxDepth: Int): PublicKeyResponseProjection = {
        this.accessedAt()
        this.createdAt()
        this.fingerprint()
        this.id()
        this.isReadOnly()
        this.key()
        this.updatedAt()
        this.typename()
        this
    }

    def accessedAt(): PublicKeyResponseProjection = {
        accessedAt(null.asInstanceOf[String])
    }

    def accessedAt(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("accessedAt").alias(alias))
        this
    }

    def createdAt(): PublicKeyResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def fingerprint(): PublicKeyResponseProjection = {
        fingerprint(null.asInstanceOf[String])
    }

    def fingerprint(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("fingerprint").alias(alias))
        this
    }

    def id(): PublicKeyResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isReadOnly(): PublicKeyResponseProjection = {
        isReadOnly(null.asInstanceOf[String])
    }

    def isReadOnly(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("isReadOnly").alias(alias))
        this
    }

    def key(): PublicKeyResponseProjection = {
        key(null.asInstanceOf[String])
    }

    def key(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("key").alias(alias))
        this
    }

    def updatedAt(): PublicKeyResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): PublicKeyResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): PublicKeyResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PublicKeyResponseProjection = {
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
        val that = obj.asInstanceOf[PublicKeyResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
