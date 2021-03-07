package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field repository in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserRepositoryParametrizedInput(
    @javax.validation.constraints.NotNull
    name: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
