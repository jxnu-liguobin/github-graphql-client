package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LockLockableMutationResponse extends GraphQLResult[JMap[String, LockLockablePayloadTO]] {

    def lockLockable(): LockLockablePayloadTO = {
        val data: JMap[String, LockLockablePayloadTO] = getData
        if (data != null) data.get(LockLockableMutationResponse.OPERATION_NAME) else null
    }

}

object LockLockableMutationResponse {

    private final val OPERATION_NAME: String = "lockLockable"

}
