package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CodeOfConductQueryResponse extends GraphQLResult[JMap[String, CodeOfConductTO]] {

    def codeOfConduct(): CodeOfConductTO = {
        val data: JMap[String, CodeOfConductTO] = getData
        if (data != null) data.get(CodeOfConductQueryResponse.OPERATION_NAME) else null
    }

}

object CodeOfConductQueryResponse {

    private final val OPERATION_NAME: String = "codeOfConduct"

}
