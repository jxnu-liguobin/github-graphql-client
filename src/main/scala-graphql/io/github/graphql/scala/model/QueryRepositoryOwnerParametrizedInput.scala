package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field repositoryOwner in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryRepositoryOwnerParametrizedInput(
    @javax.validation.constraints.NotNull
    login: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (login != null) "login: " + GraphQLRequestSerializer.getEntry(login) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
