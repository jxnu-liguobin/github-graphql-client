package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryResponseProjection extends GraphQLResponseProjection {

    public SecurityAdvisoryResponseProjection() {
    }

    @Override
    public SecurityAdvisoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SecurityAdvisoryResponseProjection all$(int maxDepth) {
        this.databaseId();
        this.description();
        this.ghsaId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0) + 1);
            this.identifiers(new SecurityAdvisoryIdentifierResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryIdentifierResponseProjection.identifiers", 0)));
        }
        this.origin();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0) + 1);
            this.references(new SecurityAdvisoryReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityAdvisoryReferenceResponseProjection.references", 0)));
        }
        this.severity();
        this.summary();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0) + 1);
            this.vulnerabilities(new SecurityVulnerabilityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.vulnerabilities", 0)));
        }
        this.withdrawnAt();
        this.typename();
        return this;
    }

    public SecurityAdvisoryResponseProjection databaseId() {
        return databaseId(null);
    }

    public SecurityAdvisoryResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection description() {
        return description(null);
    }

    public SecurityAdvisoryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection ghsaId() {
        return ghsaId(null);
    }

    public SecurityAdvisoryResponseProjection ghsaId(String alias) {
        fields.add(new GraphQLResponseField("ghsaId").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection id() {
        return id(null);
    }

    public SecurityAdvisoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection identifiers(SecurityAdvisoryIdentifierResponseProjection subProjection) {
        return identifiers(null, subProjection);
    }

    public SecurityAdvisoryResponseProjection identifiers(String alias, SecurityAdvisoryIdentifierResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("identifiers").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryResponseProjection origin() {
        return origin(null);
    }

    public SecurityAdvisoryResponseProjection origin(String alias) {
        fields.add(new GraphQLResponseField("origin").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public SecurityAdvisoryResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection references(SecurityAdvisoryReferenceResponseProjection subProjection) {
        return references(null, subProjection);
    }

    public SecurityAdvisoryResponseProjection references(String alias, SecurityAdvisoryReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("references").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryResponseProjection severity() {
        return severity(null);
    }

    public SecurityAdvisoryResponseProjection severity(String alias) {
        fields.add(new GraphQLResponseField("severity").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection summary() {
        return summary(null);
    }

    public SecurityAdvisoryResponseProjection summary(String alias) {
        fields.add(new GraphQLResponseField("summary").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public SecurityAdvisoryResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection vulnerabilities(SecurityVulnerabilityConnectionResponseProjection subProjection) {
        return vulnerabilities((String)null, subProjection);
    }

    public SecurityAdvisoryResponseProjection vulnerabilities(String alias, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("vulnerabilities").alias(alias).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryResponseProjection vulnerabilities(SecurityAdvisoryVulnerabilitiesParametrizedInput input, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        return vulnerabilities(null, input, subProjection);
    }

    public SecurityAdvisoryResponseProjection vulnerabilities(String alias, SecurityAdvisoryVulnerabilitiesParametrizedInput input, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("vulnerabilities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public SecurityAdvisoryResponseProjection withdrawnAt() {
        return withdrawnAt(null);
    }

    public SecurityAdvisoryResponseProjection withdrawnAt(String alias) {
        fields.add(new GraphQLResponseField("withdrawnAt").alias(alias));
        return this;
    }

    public SecurityAdvisoryResponseProjection typename() {
        return typename(null);
    }

    public SecurityAdvisoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
