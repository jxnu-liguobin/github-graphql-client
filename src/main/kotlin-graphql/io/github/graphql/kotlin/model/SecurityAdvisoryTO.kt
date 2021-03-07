package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityAdvisoryTO
        return Objects.equals(databaseId, that.databaseId)
                && Objects.equals(description, that.description)
                && Objects.equals(ghsaId, that.ghsaId)
                && Objects.equals(id, that.id)
                && Objects.equals(identifiers, that.identifiers)
                && Objects.equals(origin, that.origin)
                && Objects.equals(publishedAt, that.publishedAt)
                && Objects.equals(references, that.references)
                && Objects.equals(severity, that.severity)
                && Objects.equals(summary, that.summary)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(withdrawnAt, that.withdrawnAt)

    }

    override fun hashCode(): Int = {
        return Objects.hash(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt)
    }

    class Builder {

        private var databaseId: Int? = null
        private lateinit var description: String
        private lateinit var ghsaId: String
        private lateinit var id: String
        private lateinit var identifiers: List<SecurityAdvisoryIdentifierTO>
        private lateinit var origin: String
        private lateinit var publishedAt: String
        private lateinit var references: List<SecurityAdvisoryReferenceTO>
        private lateinit var severity: SecurityAdvisorySeverityTO
        private lateinit var summary: String
        private lateinit var updatedAt: String
        private var withdrawnAt: String? = null

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDescription(description: String): Builder {
            this.description = description
            return this
        }

        fun setGhsaId(ghsaId: String): Builder {
            this.ghsaId = ghsaId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIdentifiers(identifiers: List<SecurityAdvisoryIdentifierTO>): Builder {
            this.identifiers = identifiers
            return this
        }

        fun setOrigin(origin: String): Builder {
            this.origin = origin
            return this
        }

        fun setPublishedAt(publishedAt: String): Builder {
            this.publishedAt = publishedAt
            return this
        }

        fun setReferences(references: List<SecurityAdvisoryReferenceTO>): Builder {
            this.references = references
            return this
        }

        fun setSeverity(severity: SecurityAdvisorySeverityTO): Builder {
            this.severity = severity
            return this
        }

        fun setSummary(summary: String): Builder {
            this.summary = summary
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setWithdrawnAt(withdrawnAt: String?): Builder {
            this.withdrawnAt = withdrawnAt
            return this
        }

        fun build(): SecurityAdvisoryTO {
            return SecurityAdvisoryTO(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt)
        }
    }
}
