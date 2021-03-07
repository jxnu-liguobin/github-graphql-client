package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field repository in type RepositoryOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryOwnerRepositoryParametrizedInput(
    @javax.validation.constraints.NotNull
    name: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
