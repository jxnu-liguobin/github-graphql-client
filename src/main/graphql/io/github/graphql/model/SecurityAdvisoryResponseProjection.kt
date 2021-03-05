package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryResponseProjection {
        this.databaseId()
        this.description()
        this.ghsaId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) + 1
            this.identifiers(SecurityAdvisoryIdentifierResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0)))
        }
        this.origin()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) + 1
            this.references(SecurityAdvisoryReferenceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0)))
        }
        this.severity()
        this.summary()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) + 1
            this.vulnerabilities(SecurityVulnerabilityConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0)))
        }
        this.withdrawnAt()
        this.typename()
        return this
    }

    fun databaseId(): SecurityAdvisoryResponseProjection = databaseId(null)

    fun databaseId(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun description(): SecurityAdvisoryResponseProjection = description(null)

    fun description(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun ghsaId(): SecurityAdvisoryResponseProjection = ghsaId(null)

    fun ghsaId(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("ghsaId").alias(alias))
        return this
    }

    fun id(): SecurityAdvisoryResponseProjection = id(null)

    fun id(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun identifiers(subProjection: SecurityAdvisoryIdentifierResponseProjection): SecurityAdvisoryResponseProjection = identifiers(null, subProjection)

    fun identifiers(alias: String?, subProjection: SecurityAdvisoryIdentifierResponseProjection): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("identifiers").alias(alias).projection(subProjection))
        return this
    }

    fun origin(): SecurityAdvisoryResponseProjection = origin(null)

    fun origin(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("origin").alias(alias))
        return this
    }

    fun publishedAt(): SecurityAdvisoryResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun references(subProjection: SecurityAdvisoryReferenceResponseProjection): SecurityAdvisoryResponseProjection = references(null, subProjection)

    fun references(alias: String?, subProjection: SecurityAdvisoryReferenceResponseProjection): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("references").alias(alias).projection(subProjection))
        return this
    }

    fun severity(): SecurityAdvisoryResponseProjection = severity(null)

    fun severity(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("severity").alias(alias))
        return this
    }

    fun summary(): SecurityAdvisoryResponseProjection = summary(null)

    fun summary(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("summary").alias(alias))
        return this
    }

    fun updatedAt(): SecurityAdvisoryResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun vulnerabilities(subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = vulnerabilities(null, subProjection)

    fun vulnerabilities(alias: String?, subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("vulnerabilities").alias(alias).projection(subProjection))
        return this
    }

    fun vulnerabilities(input: SecurityAdvisoryVulnerabilitiesParametrizedInput, subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection = vulnerabilities(null, input, subProjection)

    fun vulnerabilities(alias: String?, input: SecurityAdvisoryVulnerabilitiesParametrizedInput, subProjection: SecurityVulnerabilityConnectionResponseProjection): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("vulnerabilities").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun withdrawnAt(): SecurityAdvisoryResponseProjection = withdrawnAt(null)

    fun withdrawnAt(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("withdrawnAt").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
