package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GpgSignature
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GpgSignatureResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GpgSignatureResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GpgSignatureResponseProjection {
        this.email()
        this.isValid()
        this.keyId()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields["GpgSignatureResponseProjection.UserResponseProjection.signer"] = projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) + 1
            this.signer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        return this
    }

    fun email(): GpgSignatureResponseProjection = email(null)

    fun email(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun isValid(): GpgSignatureResponseProjection = isValid(null)

    fun isValid(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("isValid").alias(alias))
        return this
    }

    fun keyId(): GpgSignatureResponseProjection = keyId(null)

    fun keyId(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("keyId").alias(alias))
        return this
    }

    fun payload(): GpgSignatureResponseProjection = payload(null)

    fun payload(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("payload").alias(alias))
        return this
    }

    fun signature(): GpgSignatureResponseProjection = signature(null)

    fun signature(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("signature").alias(alias))
        return this
    }

    fun signer(subProjection: UserResponseProjection): GpgSignatureResponseProjection = signer(null, subProjection)

    fun signer(alias: String?, subProjection: UserResponseProjection): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("signer").alias(alias).projection(subProjection))
        return this
    }

    fun state(): GpgSignatureResponseProjection = state(null)

    fun state(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun wasSignedByGitHub(): GpgSignatureResponseProjection = wasSignedByGitHub(null)

    fun wasSignedByGitHub(alias: String?): GpgSignatureResponseProjection {
        fields.add(GraphQLResponseField("wasSignedByGitHub").alias(alias))
        return this
    }

    fun typename(): GpgSignatureResponseProjection = typename(null)

    fun typename(alias: String?): GpgSignatureResponseProjection {
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
        val that = other as GpgSignatureResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
