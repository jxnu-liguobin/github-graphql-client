package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class GpgSignatureTO(
    override
    val email: String,
    override
    val isValid: Boolean,
    val keyId: String?,
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
        if (keyId != null) {
            joiner.add("keyId: " + GraphQLRequestSerializer.getEntry(keyId))
        }
        joiner.add("payload: " + GraphQLRequestSerializer.getEntry(payload))
        joiner.add("signature: " + GraphQLRequestSerializer.getEntry(signature))
        if (signer != null) {
            joiner.add("signer: " + GraphQLRequestSerializer.getEntry(signer))
        }
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("wasSignedByGitHub: " + GraphQLRequestSerializer.getEntry(wasSignedByGitHub))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as GpgSignatureTO
        return Objects.equals(email, that.email)
                && Objects.equals(isValid, that.isValid)
                && Objects.equals(keyId, that.keyId)
                && Objects.equals(payload, that.payload)
                && Objects.equals(signature, that.signature)
                && Objects.equals(signer, that.signer)
                && Objects.equals(state, that.state)
                && Objects.equals(wasSignedByGitHub, that.wasSignedByGitHub)

    }

    override fun hashCode(): Int = {
        return Objects.hash(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub)
    }

    class Builder {

        private lateinit var email: String
        private var isValid: Boolean = false
        private var keyId: String? = null
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

        fun setKeyId(keyId: String?): Builder {
            this.keyId = keyId
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

        fun build(): GpgSignatureTO {
            return GpgSignatureTO(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub)
        }
    }
}
