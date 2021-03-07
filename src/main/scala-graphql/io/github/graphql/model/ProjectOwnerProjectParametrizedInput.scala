package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field project in type ProjectOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class ProjectOwnerProjectParametrizedInput(
    number: Int
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            "number: " + GraphQLRequestSerializer.getEntry(number)
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
