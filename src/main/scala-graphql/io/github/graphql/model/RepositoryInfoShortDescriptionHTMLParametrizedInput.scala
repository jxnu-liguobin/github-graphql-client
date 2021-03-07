package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field shortDescriptionHTML in type RepositoryInfo
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryInfoShortDescriptionHTMLParametrizedInput(
    limit: Option[Int] = Some(200)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (limit.isDefined) "limit: " + GraphQLRequestSerializer.getEntry(limit.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
