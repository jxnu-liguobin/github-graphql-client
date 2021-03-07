package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import GitSignatureStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SmimeSignatureTO(
    @javax.validation.constraints.NotNull
    override val email: String,
    override val isValid: Boolean,
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
            if (payload != null) "payload: " + GraphQLRequestSerializer.getEntry(payload) else "",
            if (signature != null) "signature: " + GraphQLRequestSerializer.getEntry(signature) else "",
            if (signer != null) "signer: " + GraphQLRequestSerializer.getEntry(signer) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            "wasSignedByGitHub: " + GraphQLRequestSerializer.getEntry(wasSignedByGitHub)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SmimeSignatureTO {

    def builder(): SmimeSignatureTO.Builder = new Builder()

    class Builder {

        private var email: String = _
        private var isValid: Boolean = _
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

        def build(): SmimeSignatureTO = new SmimeSignatureTO(email, isValid, payload, signature, signer, state, wasSignedByGitHub)

    }
}
