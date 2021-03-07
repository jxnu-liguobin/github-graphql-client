package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GitSignature
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GitSignatureResponseProjection extends GraphQLResponseProjection {

    override def all$(): GitSignatureResponseProjection = all$(3)

    override def all$(maxDepth: Int): GitSignatureResponseProjection = {
        this.email()
        this.isValid()
        this.payload()
        this.signature()
        if (projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) + 1)
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0)))
        }
        this.state()
        this.wasSignedByGitHub()
        this.typename()
        this
    }

    def email(): GitSignatureResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def isValid(): GitSignatureResponseProjection = {
        isValid(null.asInstanceOf[String])
    }

    def isValid(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("isValid").alias(alias))
        this
    }

    def payload(): GitSignatureResponseProjection = {
        payload(null.asInstanceOf[String])
    }

    def payload(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("payload").alias(alias))
        this
    }

    def signature(): GitSignatureResponseProjection = {
        signature(null.asInstanceOf[String])
    }

    def signature(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signature").alias(alias))
        this
    }

    def signer(subProjection: UserResponseProjection): GitSignatureResponseProjection = {
        signer(null.asInstanceOf[String], subProjection)
    }

    def signer(alias: String, subProjection: UserResponseProjection): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection))
        this
    }

    def state(): GitSignatureResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def wasSignedByGitHub(): GitSignatureResponseProjection = {
        wasSignedByGitHub(null.asInstanceOf[String])
    }

    def wasSignedByGitHub(alias: String): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias))
        this
    }

    def onUnknownSignature(subProjection: UnknownSignatureResponseProjection): GitSignatureResponseProjection = {
        onUnknownSignature(null.asInstanceOf[String], subProjection)
    }

    def onUnknownSignature(alias: String, subProjection: UnknownSignatureResponseProjection): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("...on UnknownSignature").alias(alias).projection(subProjection))
        this
    }

    def onGpgSignature(subProjection: GpgSignatureResponseProjection): GitSignatureResponseProjection = {
        onGpgSignature(null.asInstanceOf[String], subProjection)
    }

    def onGpgSignature(alias: String, subProjection: GpgSignatureResponseProjection): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("...on GpgSignature").alias(alias).projection(subProjection))
        this
    }

    def onSmimeSignature(subProjection: SmimeSignatureResponseProjection): GitSignatureResponseProjection = {
        onSmimeSignature(null.asInstanceOf[String], subProjection)
    }

    def onSmimeSignature(alias: String, subProjection: SmimeSignatureResponseProjection): GitSignatureResponseProjection = {
        fields.add(new GraphQLResponseField("...on SmimeSignature").alias(alias).projection(subProjection))
        this
    }

    def typename(): GitSignatureResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GitSignatureResponseProjection = {
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
        val that = obj.asInstanceOf[GitSignatureResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
