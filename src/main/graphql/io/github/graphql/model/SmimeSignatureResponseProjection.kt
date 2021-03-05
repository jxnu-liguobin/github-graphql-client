package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SmimeSignature
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SmimeSignatureResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SmimeSignatureResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SmimeSignatureResponseProjection {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields["SmimeSignatureResponseProjection.UserResponseProjection.signer"] = projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) + 1
            this.signer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        return this
    }

    fun email(): SmimeSignatureResponseProjection = email(null)

    fun email(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun isValid(): SmimeSignatureResponseProjection = isValid(null)

    fun isValid(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("isValid").alias(alias))
        return this
    }

    fun payload(): SmimeSignatureResponseProjection = payload(null)

    fun payload(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("payload").alias(alias))
        return this
    }

    fun signature(): SmimeSignatureResponseProjection = signature(null)

    fun signature(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("signature").alias(alias))
        return this
    }

    fun signer(subProjection: UserResponseProjection): SmimeSignatureResponseProjection = signer(null, subProjection)

    fun signer(alias: String?, subProjection: UserResponseProjection): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("signer").alias(alias).projection(subProjection))
        return this
    }

    fun state(): SmimeSignatureResponseProjection = state(null)

    fun state(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun wasSignedByGitHub(): SmimeSignatureResponseProjection = wasSignedByGitHub(null)

    fun wasSignedByGitHub(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("wasSignedByGitHub").alias(alias))
        return this
    }

    fun typename(): SmimeSignatureResponseProjection = typename(null)

    fun typename(alias: String?): SmimeSignatureResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
