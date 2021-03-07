package io.github.graphql.model

import LockReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait LockableTO {

    val activeLockReason: LockReasonTO

    val locked: Boolean

}
