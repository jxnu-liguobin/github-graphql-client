package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import SecurityAdvisorySeverityTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SecurityAdvisoryTO(
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    description: String,
    @javax.validation.constraints.NotNull
    ghsaId: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    identifiers: Seq[SecurityAdvisoryIdentifierTO],
    @javax.validation.constraints.NotNull
    origin: String,
    @javax.validation.constraints.NotNull
    publishedAt: String,
    @javax.validation.constraints.NotNull
    references: Seq[SecurityAdvisoryReferenceTO],
    @javax.validation.constraints.NotNull
    severity: SecurityAdvisorySeverityTO,
    @javax.validation.constraints.NotNull
    summary: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    withdrawnAt: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (ghsaId != null) "ghsaId: " + GraphQLRequestSerializer.getEntry(ghsaId) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (identifiers != null) "identifiers: " + GraphQLRequestSerializer.getEntry(identifiers.asJava) else "",
            if (origin != null) "origin: " + GraphQLRequestSerializer.getEntry(origin) else "",
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (references != null) "references: " + GraphQLRequestSerializer.getEntry(references.asJava) else "",
            if (severity != null) "severity: " + GraphQLRequestSerializer.getEntry(severity) else "",
            if (summary != null) "summary: " + GraphQLRequestSerializer.getEntry(summary) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (withdrawnAt != null) "withdrawnAt: " + GraphQLRequestSerializer.getEntry(withdrawnAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryTO]
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(description, that.description) &&
        Objects.equals(ghsaId, that.ghsaId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(identifiers, that.identifiers) &&
        Objects.equals(origin, that.origin) &&
        Objects.equals(publishedAt, that.publishedAt) &&
        Objects.equals(references, that.references) &&
        Objects.equals(severity, that.severity) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(withdrawnAt, that.withdrawnAt)
    }

    override def hashCode(): Int = {
        Objects.hash(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt)
    }
}

object SecurityAdvisoryTO {

    def builder(): SecurityAdvisoryTO.Builder = new Builder()

    class Builder {

        private var databaseId: Option[Int] = _
        private var description: String = _
        private var ghsaId: String = _
        private var id: String = _
        private var identifiers: Seq[SecurityAdvisoryIdentifierTO] = _
        private var origin: String = _
        private var publishedAt: String = _
        private var references: Seq[SecurityAdvisoryReferenceTO] = _
        private var severity: SecurityAdvisorySeverityTO = _
        private var summary: String = _
        private var updatedAt: String = _
        private var withdrawnAt: String = _

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setGhsaId(ghsaId: String): Builder = {
            this.ghsaId = ghsaId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIdentifiers(identifiers: Seq[SecurityAdvisoryIdentifierTO]): Builder = {
            this.identifiers = identifiers
            this
        }

        def setOrigin(origin: String): Builder = {
            this.origin = origin
            this
        }

        def setPublishedAt(publishedAt: String): Builder = {
            this.publishedAt = publishedAt
            this
        }

        def setReferences(references: Seq[SecurityAdvisoryReferenceTO]): Builder = {
            this.references = references
            this
        }

        def setSeverity(severity: SecurityAdvisorySeverityTO): Builder = {
            this.severity = severity
            this
        }

        def setSummary(summary: String): Builder = {
            this.summary = summary
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setWithdrawnAt(withdrawnAt: String): Builder = {
            this.withdrawnAt = withdrawnAt
            this
        }

        def build(): SecurityAdvisoryTO = new SecurityAdvisoryTO(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt)

    }
}
