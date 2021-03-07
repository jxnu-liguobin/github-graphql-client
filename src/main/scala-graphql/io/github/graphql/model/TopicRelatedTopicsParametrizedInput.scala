package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field relatedTopics in type Topic
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class TopicRelatedTopicsParametrizedInput(
    first: Option[Int] = Some(3)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
