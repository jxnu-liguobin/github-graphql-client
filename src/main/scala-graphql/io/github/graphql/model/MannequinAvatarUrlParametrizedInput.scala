package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field avatarUrl in type Mannequin
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class MannequinAvatarUrlParametrizedInput(
    size: Option[Int]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (size.isDefined) "size: " + GraphQLRequestSerializer.getEntry(size.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
