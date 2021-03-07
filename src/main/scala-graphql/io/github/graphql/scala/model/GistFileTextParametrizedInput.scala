package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field text in type GistFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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
