package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
interface LockableTO {

    val activeLockReason: LockReasonTO?

    val locked: Boolean

}
