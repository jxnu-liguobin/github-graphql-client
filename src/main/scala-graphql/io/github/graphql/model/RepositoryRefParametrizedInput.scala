package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field ref in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryRefParametrizedInput(
    @javax.validation.constraints.NotNull
    qualifiedName: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (qualifiedName != null) "qualifiedName: " + GraphQLRequestSerializer.getEntry(qualifiedName) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
