package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field files in type Gist
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class GistFilesParametrizedInput(
    limit: Option[Int] = Some(10),
    oid: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (limit.isDefined) "limit: " + GraphQLRequestSerializer.getEntry(limit.get) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
