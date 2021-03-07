package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field rateLimit in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryRateLimitParametrizedInput(
    dryRun: Option[Boolean] = Some(false)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (dryRun.isDefined) "dryRun: " + GraphQLRequestSerializer.getEntry(dryRun.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
