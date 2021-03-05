package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryPackageTO(
    val ecosystem: SecurityAdvisoryEcosystemTO,
    val name: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        return joiner.toString()
    }
}
