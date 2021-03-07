package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LicenseQueryResponse extends GraphQLResult[JMap[String, LicenseTO]] {

    def license(): LicenseTO = {
        val data: JMap[String, LicenseTO] = getData
        if (data != null) data.get(LicenseQueryResponse.OPERATION_NAME) else null
    }

}

object LicenseQueryResponse {

    private final val OPERATION_NAME: String = "license"

}
