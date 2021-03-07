package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
interface GitSignatureTO {

    val email: String

    val isValid: Boolean

    val payload: String

    val signature: String

    val signer: UserTO?

    val state: GitSignatureStateTO

    val wasSignedByGitHub: Boolean

}
