package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SecurityAdvisoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryResponseProjection = {
        this.databaseId()
        this.description()
        this.ghsaId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) + 1)
            this.identifiers(new SecurityAdvisoryIdentifierResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0)))
        }
        this.origin()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) + 1)
            this.references(new SecurityAdvisoryReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0)))
        }
        this.severity()
        this.summary()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) + 1)
            this.vulnerabilities(new SecurityVulnerabilityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0)))
        }
        this.withdrawnAt()
        this.typename()
        this
    }

    def databaseId(): SecurityAdvisoryResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def description(): SecurityAdvisoryResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def ghsaId(): SecurityAdvisoryResponseProjection = {
        ghsaId(null.asInstanceOf[String])
    }

    def ghsaId(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("ghsaId").alias(alias))
        this
    }

    def id(): SecurityAdvisoryResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def identifiers(subProjection: SecurityAdvisoryIdentifierResponseProjection): SecurityAdvisoryResponseProjection = {
        identifiers(null.asInstanceOf[String], subProjection)
    }

    def identifiers(alias: String, subProjection: SecurityAdvisoryIdentifierResponseProjection): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("identifiers").alias(alias).projection(subProjection))
        this
    }

    def origin(): SecurityAdvisoryResponseProjection = {
        origin(null.asInstanceOf[String])
    }

    def origin(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("origin").alias(alias))
        this
    }

    def publishedAt(): SecurityAdvisoryResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def references(subProjection: SecurityAdvisoryReferenceResponseProjection): SecurityAdvisoryResponseProjection = {
        references(null.asInstanceOf[String], subProjection)
    }

    def references(alias: String, subProjection: SecurityAdvisoryReferenceResponseProjection): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("references").alias(alias).projection(subProjection))
        this
    }

    def severity(): SecurityAdvisoryResponseProjection = {
        severity(null.asInstanceOf[String])
    }

    def severity(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("severity").alias(alias))
        this
    }

    def summary(): SecurityAdvisoryResponseProjection = {
        summary(null.asInstanceOf[String])
    }

    def summary(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("summary").alias(alias))
        this
    }

    def updatedAt(): SecurityAdvisoryResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def vulnerabilities(subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = {
        vulnerabilities(null.asInstanceOf[String], subProjection)
    }

    def vulnerabilities(alias: String, subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("vulnerabilities").alias(alias).projection(subProjection))
        this
    }

    def vulnerabilities(input: SecurityAdvisoryVulnerabilitiesParametrizedInput,subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = {
        vulnerabilities(null.asInstanceOf[String], input, subProjection)
    }

    def vulnerabilities(alias: String, input: SecurityAdvisoryVulnerabilitiesParametrizedInput , subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("vulnerabilities").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def withdrawnAt(): SecurityAdvisoryResponseProjection = {
        withdrawnAt(null.asInstanceOf[String])
    }

    def withdrawnAt(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("withdrawnAt").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
