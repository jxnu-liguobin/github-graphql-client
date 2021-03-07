package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field object in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class RepositoryObjectParametrizedInput(
    expression: String,
    oid: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (expression != null) "expression: " + GraphQLRequestSerializer.getEntry(expression) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
