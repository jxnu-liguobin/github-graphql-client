package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field blame in type Commit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class CommitBlameParametrizedInput(
    @javax.validation.constraints.NotNull
    path: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
