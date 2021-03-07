package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field clearLabelsFromLabelable in type Mutation
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class MutationClearLabelsFromLabelableParametrizedInput(
    @javax.validation.constraints.NotNull
    input: ClearLabelsFromLabelableInputTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (input != null) "input: " + GraphQLRequestSerializer.getEntry(input) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
