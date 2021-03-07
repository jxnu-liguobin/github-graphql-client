package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import PinnableItemTypeTO._

/**
 * Parametrized input for field anyPinnableItems in type ProfileOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class ProfileOwnerAnyPinnableItemsParametrizedInput(
    `type`: PinnableItemTypeTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
