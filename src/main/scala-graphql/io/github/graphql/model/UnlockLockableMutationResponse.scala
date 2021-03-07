package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
