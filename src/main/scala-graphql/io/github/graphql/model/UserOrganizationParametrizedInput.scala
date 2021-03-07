package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field organization in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserOrganizationParametrizedInput(
    @javax.validation.constraints.NotNull
    login: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (login != null) "login: " + GraphQLRequestSerializer.getEntry(login) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
