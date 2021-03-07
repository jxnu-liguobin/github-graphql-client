package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LicensesQueryResponse extends GraphQLResult[JMap[String, Seq[LicenseTO]]] {

    def licenses(): Seq[LicenseTO] = {
        val data: JMap[String, Seq[LicenseTO]] = getData
        if (data != null) data.get(LicensesQueryResponse.OPERATION_NAME) else null
    }

}

object LicensesQueryResponse {

    private final val OPERATION_NAME: String = "licenses"

}
