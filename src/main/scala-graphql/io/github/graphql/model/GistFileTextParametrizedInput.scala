package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field text in type GistFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class GistFileTextParametrizedInput(
    truncate: Option[Int]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (truncate.isDefined) "truncate: " + GraphQLRequestSerializer.getEntry(truncate.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
