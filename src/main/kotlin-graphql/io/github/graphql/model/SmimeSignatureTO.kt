package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class SmimeSignatureTO(
    override
    val email: String,
    override
    val isValid: Boolean,
    override
    val payload: String,
    override
    val signature: String,
    override
    val signer: UserTO?,
    override
    val state: GitSignatureStateTO,
    override
    val wasSignedByGitHub: Boolean
) : GitSignatureTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        joiner.add("isValid: " + GraphQLRequestSerializer.getEntry(isValid))
        joiner.add("payload: " + GraphQLRequestSerializer.getEntry(payload))
        joiner.add("signature: " + GraphQLRequestSerializer.getEntry(signature))
        if (signer != null) {
            joiner.add("signer: " + GraphQLRequestSerializer.getEntry(signer))
        }
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("wasSignedByGitHub: " + GraphQLRequestSerializer.getEntry(wasSignedByGitHub))
        return joiner.toString()
    }

    class Builder {

        private lateinit var email: String
        private var isValid: Boolean = false
        private lateinit var payload: String
        private lateinit var signature: String
        private var signer: UserTO? = null
        private lateinit var state: GitSignatureStateTO
        private var wasSignedByGitHub: Boolean = false

        fun setEmail(email: String): Builder {
            this.email = email
            return this
        }

        fun setIsValid(isValid: Boolean): Builder {
            this.isValid = isValid
            return this
        }

        fun setPayload(payload: String): Builder {
            this.payload = payload
            return this
        }

        fun setSignature(signature: String): Builder {
            this.signature = signature
            return this
        }

        fun setSigner(signer: UserTO?): Builder {
            this.signer = signer
            return this
        }

        fun setState(state: GitSignatureStateTO): Builder {
            this.state = state
            return this
        }

        fun setWasSignedByGitHub(wasSignedByGitHub: Boolean): Builder {
            this.wasSignedByGitHub = wasSignedByGitHub
            return this
        }

        fun build(): SmimeSignatureTO {
            return SmimeSignatureTO(email, isValid, payload, signature, signer, state, wasSignedByGitHub)
        }
    }
}
