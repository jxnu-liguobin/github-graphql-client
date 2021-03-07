package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnlockLockableMutationResponse extends GraphQLResult[JMap[String, UnlockLockablePayloadTO]] {

    def unlockLockable(): UnlockLockablePayloadTO = {
        val data: JMap[String, UnlockLockablePayloadTO] = getData
        if (data != null) data.get(UnlockLockableMutationResponse.OPERATION_NAME) else null
    }

}

object UnlockLockableMutationResponse {

    private final val OPERATION_NAME: String = "unlockLockable"

}
