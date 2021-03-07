package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CodesOfConductQueryResponse extends GraphQLResult[JMap[String, Seq[CodeOfConductTO]]] {

    def codesOfConduct(): Seq[CodeOfConductTO] = {
        val data: JMap[String, Seq[CodeOfConductTO]] = getData
        if (data != null) data.get(CodesOfConductQueryResponse.OPERATION_NAME) else null
    }

}

object CodesOfConductQueryResponse {

    private final val OPERATION_NAME: String = "codesOfConduct"

}
