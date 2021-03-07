package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GitSignature
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GitSignatureResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GitSignatureResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GitSignatureResponseProjection {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields["GitSignatureResponseProjection.UserResponseProjection.signer"] = projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) + 1
            this.signer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        return this
    }

    fun email(): GitSignatureResponseProjection = email(null)

    fun email(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun isValid(): GitSignatureResponseProjection = isValid(null)

    fun isValid(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("isValid").alias(alias))
        return this
    }

    fun payload(): GitSignatureResponseProjection = payload(null)

    fun payload(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("payload").alias(alias))
        return this
    }

    fun signature(): GitSignatureResponseProjection = signature(null)

    fun signature(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("signature").alias(alias))
        return this
    }

    fun signer(subProjection: UserResponseProjection): GitSignatureResponseProjection = signer(null, subProjection)

    fun signer(alias: String?, subProjection: UserResponseProjection): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("signer").alias(alias).projection(subProjection))
        return this
    }

    fun state(): GitSignatureResponseProjection = state(null)

    fun state(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun wasSignedByGitHub(): GitSignatureResponseProjection = wasSignedByGitHub(null)

    fun wasSignedByGitHub(alias: String?): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("wasSignedByGitHub").alias(alias))
        return this
    }

    fun onUnknownSignature(subProjection: UnknownSignatureResponseProjection): GitSignatureResponseProjection = onUnknownSignature(null, subProjection)

    fun onUnknownSignature(alias: String?, subProjection: UnknownSignatureResponseProjection): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("...on UnknownSignature").alias(alias).projection(subProjection))
        return this
    }

    fun onGpgSignature(subProjection: GpgSignatureResponseProjection): GitSignatureResponseProjection = onGpgSignature(null, subProjection)

    fun onGpgSignature(alias: String?, subProjection: GpgSignatureResponseProjection): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("...on GpgSignature").alias(alias).projection(subProjection))
        return this
    }

    fun onSmimeSignature(subProjection: SmimeSignatureResponseProjection): GitSignatureResponseProjection = onSmimeSignature(null, subProjection)

    fun onSmimeSignature(alias: String?, subProjection: SmimeSignatureResponseProjection): GitSignatureResponseProjection {
        fields.add(GraphQLResponseField("...on SmimeSignature").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): GitSignatureResponseProjection = typename(null)

    fun typename(alias: String?): GitSignatureResponseProjection {
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
        val that = other as GitSignatureResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
