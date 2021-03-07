package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GpgSignature
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GpgSignatureResponseProjection extends GraphQLResponseProjection {

    override def all$(): GpgSignatureResponseProjection = all$(3)

    override def all$(maxDepth: Int): GpgSignatureResponseProjection = {
        this.email()
        this.isValid()
        this.keyId()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("GpgSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) + 1)
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        this
    }

    def email(): GpgSignatureResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def isValid(): GpgSignatureResponseProjection = {
        isValid(null.asInstanceOf[String])
    }

    def isValid(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("isValid").alias(alias))
        this
    }

    def keyId(): GpgSignatureResponseProjection = {
        keyId(null.asInstanceOf[String])
    }

    def keyId(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("keyId").alias(alias))
        this
    }

    def payload(): GpgSignatureResponseProjection = {
        payload(null.asInstanceOf[String])
    }

    def payload(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("payload").alias(alias))
        this
    }

    def signature(): GpgSignatureResponseProjection = {
        signature(null.asInstanceOf[String])
    }

    def signature(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signature").alias(alias))
        this
    }

    def signer(subProjection: UserResponseProjection): GpgSignatureResponseProjection = {
        signer(null.asInstanceOf[String], subProjection)
    }

    def signer(alias: String, subProjection: UserResponseProjection): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection))
        this
    }

    def state(): GpgSignatureResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def wasSignedByGitHub(): GpgSignatureResponseProjection = {
        wasSignedByGitHub(null.asInstanceOf[String])
    }

    def wasSignedByGitHub(alias: String): GpgSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias))
        this
    }

    def typename(): GpgSignatureResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GpgSignatureResponseProjection = {
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
        val that = obj.asInstanceOf[GpgSignatureResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
