package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryTO(
    val databaseId: Int?,
    val description: String,
    val ghsaId: String,
    override
    val id: String,
    val identifiers: List<SecurityAdvisoryIdentifierTO>,
    val origin: String,
    val publishedAt: String,
    val references: List<SecurityAdvisoryReferenceTO>,
    val severity: SecurityAdvisorySeverityTO,
    val summary: String,
    val updatedAt: String,
    val withdrawnAt: String?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        joiner.add("ghsaId: " + GraphQLRequestSerializer.getEntry(ghsaId))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("identifiers: " + GraphQLRequestSerializer.getEntry(identifiers))
        joiner.add("origin: " + GraphQLRequestSerializer.getEntry(origin))
        joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        joiner.add("references: " + GraphQLRequestSerializer.getEntry(references))
        joiner.add("severity: " + GraphQLRequestSerializer.getEntry(severity))
        joiner.add("summary: " + GraphQLRequestSerializer.getEntry(summary))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        if (withdrawnAt != null) {
            joiner.add("withdrawnAt: " + GraphQLRequestSerializer.getEntry(withdrawnAt))
        }
        return joiner.toString()
    }
}
