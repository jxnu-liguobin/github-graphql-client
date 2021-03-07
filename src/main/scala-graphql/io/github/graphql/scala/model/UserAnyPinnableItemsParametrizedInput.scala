package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import PinnableItemTypeTO._

/**
 * Parametrized input for field anyPinnableItems in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class UserAnyPinnableItemsParametrizedInput(
    `type`: PinnableItemTypeTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
