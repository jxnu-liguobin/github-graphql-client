package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SmimeSignature
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SmimeSignatureResponseProjection extends GraphQLResponseProjection {

    override def all$(): SmimeSignatureResponseProjection = all$(3)

    override def all$(maxDepth: Int): SmimeSignatureResponseProjection = {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SmimeSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) + 1)
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        this
    }

    def email(): SmimeSignatureResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def isValid(): SmimeSignatureResponseProjection = {
        isValid(null.asInstanceOf[String])
    }

    def isValid(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("isValid").alias(alias))
        this
    }

    def payload(): SmimeSignatureResponseProjection = {
        payload(null.asInstanceOf[String])
    }

    def payload(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("payload").alias(alias))
        this
    }

    def signature(): SmimeSignatureResponseProjection = {
        signature(null.asInstanceOf[String])
    }

    def signature(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signature").alias(alias))
        this
    }

    def signer(subProjection: UserResponseProjection): SmimeSignatureResponseProjection = {
        signer(null.asInstanceOf[String], subProjection)
    }

    def signer(alias: String, subProjection: UserResponseProjection): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection))
        this
    }

    def state(): SmimeSignatureResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def wasSignedByGitHub(): SmimeSignatureResponseProjection = {
        wasSignedByGitHub(null.asInstanceOf[String])
    }

    def wasSignedByGitHub(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias))
        this
    }

    def typename(): SmimeSignatureResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SmimeSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
