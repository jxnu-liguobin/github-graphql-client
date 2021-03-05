package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnknownSignatureTO(
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
}
