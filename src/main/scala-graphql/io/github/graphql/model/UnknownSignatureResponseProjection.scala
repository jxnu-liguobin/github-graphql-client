package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnknownSignature
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UnknownSignatureResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnknownSignatureResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnknownSignatureResponseProjection = {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnknownSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) + 1)
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        this
    }

    def email(): UnknownSignatureResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def isValid(): UnknownSignatureResponseProjection = {
        isValid(null.asInstanceOf[String])
    }

    def isValid(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("isValid").alias(alias))
        this
    }

    def payload(): UnknownSignatureResponseProjection = {
        payload(null.asInstanceOf[String])
    }

    def payload(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("payload").alias(alias))
        this
    }

    def signature(): UnknownSignatureResponseProjection = {
        signature(null.asInstanceOf[String])
    }

    def signature(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signature").alias(alias))
        this
    }

    def signer(subProjection: UserResponseProjection): UnknownSignatureResponseProjection = {
        signer(null.asInstanceOf[String], subProjection)
    }

    def signer(alias: String, subProjection: UserResponseProjection): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection))
        this
    }

    def state(): UnknownSignatureResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def wasSignedByGitHub(): UnknownSignatureResponseProjection = {
        wasSignedByGitHub(null.asInstanceOf[String])
    }

    def wasSignedByGitHub(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias))
        this
    }

    def typename(): UnknownSignatureResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnknownSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
