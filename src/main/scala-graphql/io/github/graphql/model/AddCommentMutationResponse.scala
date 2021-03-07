package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddCommentMutationResponse extends GraphQLResult[JMap[String, AddCommentPayloadTO]] {

    def addComment(): AddCommentPayloadTO = {
        val data: JMap[String, AddCommentPayloadTO] = getData
        if (data != null) data.get(AddCommentMutationResponse.OPERATION_NAME) else null
    }

}

object AddCommentMutationResponse {

    private final val OPERATION_NAME: String = "addComment"

}
