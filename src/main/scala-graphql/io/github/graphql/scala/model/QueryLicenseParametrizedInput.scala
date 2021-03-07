package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field license in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryLicenseParametrizedInput(
    @javax.validation.constraints.NotNull
    key: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
