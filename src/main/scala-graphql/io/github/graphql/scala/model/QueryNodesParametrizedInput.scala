package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field nodes in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryNodesParametrizedInput(
    @javax.validation.constraints.NotNull
    ids: Seq[String]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (ids != null) "ids: " + GraphQLRequestSerializer.getEntry(ids.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
