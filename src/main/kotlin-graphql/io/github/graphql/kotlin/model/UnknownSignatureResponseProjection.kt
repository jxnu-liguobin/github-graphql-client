package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnknownSignature
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UnknownSignatureResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnknownSignatureResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnknownSignatureResponseProjection {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields["UnknownSignatureResponseProjection.UserResponseProjection.signer"] = projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) + 1
            this.signer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        return this
    }

    fun email(): UnknownSignatureResponseProjection = email(null)

    fun email(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun isValid(): UnknownSignatureResponseProjection = isValid(null)

    fun isValid(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("isValid").alias(alias))
        return this
    }

    fun payload(): UnknownSignatureResponseProjection = payload(null)

    fun payload(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("payload").alias(alias))
        return this
    }

    fun signature(): UnknownSignatureResponseProjection = signature(null)

    fun signature(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("signature").alias(alias))
        return this
    }

    fun signer(subProjection: UserResponseProjection): UnknownSignatureResponseProjection = signer(null, subProjection)

    fun signer(alias: String?, subProjection: UserResponseProjection): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("signer").alias(alias).projection(subProjection))
        return this
    }

    fun state(): UnknownSignatureResponseProjection = state(null)

    fun state(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun wasSignedByGitHub(): UnknownSignatureResponseProjection = wasSignedByGitHub(null)

    fun wasSignedByGitHub(alias: String?): UnknownSignatureResponseProjection {
        fields.add(GraphQLResponseField("wasSignedByGitHub").alias(alias))
        return this
    }

    fun typename(): UnknownSignatureResponseProjection = typename(null)

    fun typename(alias: String?): UnknownSignatureResponseProjection {
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
        val that = other as UnknownSignatureResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
