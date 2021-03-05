package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field fileByName in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class RegistryPackageVersionFileByNameParametrizedInput(
    val filename: String
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("filename: " + GraphQLRequestSerializer.getEntry(filename))
        return joiner.toString()
    }
}
