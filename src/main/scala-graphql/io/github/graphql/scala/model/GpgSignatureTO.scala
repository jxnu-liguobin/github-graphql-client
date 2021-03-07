package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import GitSignatureStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GpgSignatureTO(
    @javax.validation.constraints.NotNull
    override val email: String,
    override val isValid: Boolean,
    keyId: String,
    @javax.validation.constraints.NotNull
    override val payload: String,
    @javax.validation.constraints.NotNull
    override val signature: String,
    override val signer: UserTO,
    @javax.validation.constraints.NotNull
    override val state: GitSignatureStateTO,
    override val wasSignedByGitHub: Boolean
) extends GitSignatureTO {

    override def toString(): String = {
        Seq(
            if (email != null) "email: " + GraphQLRequestSerializer.getEntry(email) else "",
            "isValid: " + GraphQLRequestSerializer.getEntry(isValid),
            if (keyId != null) "keyId: " + GraphQLRequestSerializer.getEntry(keyId) else "",
            if (payload != null) "payload: " + GraphQLRequestSerializer.getEntry(payload) else "",
            if (signature != null) "signature: " + GraphQLRequestSerializer.getEntry(signature) else "",
            if (signer != null) "signer: " + GraphQLRequestSerializer.getEntry(signer) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            "wasSignedByGitHub: " + GraphQLRequestSerializer.getEntry(wasSignedByGitHub)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GpgSignatureTO]
        Objects.equals(email, that.email) &&
        Objects.equals(isValid, that.isValid) &&
        Objects.equals(keyId, that.keyId) &&
        Objects.equals(payload, that.payload) &&
        Objects.equals(signature, that.signature) &&
        Objects.equals(signer, that.signer) &&
        Objects.equals(state, that.state) &&
        Objects.equals(wasSignedByGitHub, that.wasSignedByGitHub)
    }

    override def hashCode(): Int = {
        Objects.hash(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub)
    }
}

object GpgSignatureTO {

    def builder(): GpgSignatureTO.Builder = new Builder()

    class Builder {

        private var email: String = _
        private var isValid: Boolean = _
        private var keyId: String = _
        private var payload: String = _
        private var signature: String = _
        private var signer: UserTO = _
        private var state: GitSignatureStateTO = _
        private var wasSignedByGitHub: Boolean = _

        def setEmail(email: String): Builder = {
            this.email = email
            this
        }

        def setIsValid(isValid: Boolean): Builder = {
            this.isValid = isValid
            this
        }

        def setKeyId(keyId: String): Builder = {
            this.keyId = keyId
            this
        }

        def setPayload(payload: String): Builder = {
            this.payload = payload
            this
        }

        def setSignature(signature: String): Builder = {
            this.signature = signature
            this
        }

        def setSigner(signer: UserTO): Builder = {
            this.signer = signer
            this
        }

        def setState(state: GitSignatureStateTO): Builder = {
            this.state = state
            this
        }

        def setWasSignedByGitHub(wasSignedByGitHub: Boolean): Builder = {
            this.wasSignedByGitHub = wasSignedByGitHub
            this
        }

        def build(): GpgSignatureTO = new GpgSignatureTO(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub)

    }
}
