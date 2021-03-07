package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field contributionsCollection in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserContributionsCollectionParametrizedInput(
    from: String,
    organizationID: String,
    to: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (from != null) "from: " + GraphQLRequestSerializer.getEntry(from) else "",
            if (organizationID != null) "organizationID: " + GraphQLRequestSerializer.getEntry(organizationID) else "",
            if (to != null) "to: " + GraphQLRequestSerializer.getEntry(to) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
