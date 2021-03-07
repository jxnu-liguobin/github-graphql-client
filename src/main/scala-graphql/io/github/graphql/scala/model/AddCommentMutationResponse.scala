package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
