package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for License
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LicenseResponseProjection extends GraphQLResponseProjection {

    public LicenseResponseProjection() {
    }

    @Override
    public LicenseResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LicenseResponseProjection all$(int maxDepth) {
        this.body();
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) + 1);
            this.conditions(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0)));
        }
        this.description();
        this.featured();
        this.hidden();
        this.id();
        this.implementation();
        this.key();
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) + 1);
            this.limitations(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0)));
        }
        this.name();
        this.nickname();
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) + 1);
            this.permissions(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0)));
        }
        this.pseudoLicense();
        this.spdxId();
        this.url();
        this.typename();
        return this;
    }

    public LicenseResponseProjection body() {
        return body(null);
    }

    public LicenseResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public LicenseResponseProjection conditions(LicenseRuleResponseProjection subProjection) {
        return conditions(null, subProjection);
    }

    public LicenseResponseProjection conditions(String alias, LicenseRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("conditions").alias(alias).projection(subProjection));
        return this;
    }

    public LicenseResponseProjection description() {
        return description(null);
    }

    public LicenseResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public LicenseResponseProjection featured() {
        return featured(null);
    }

    public LicenseResponseProjection featured(String alias) {
        fields.add(new GraphQLResponseField("featured").alias(alias));
        return this;
    }

    public LicenseResponseProjection hidden() {
        return hidden(null);
    }

    public LicenseResponseProjection hidden(String alias) {
        fields.add(new GraphQLResponseField("hidden").alias(alias));
        return this;
    }

    public LicenseResponseProjection id() {
        return id(null);
    }

    public LicenseResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LicenseResponseProjection implementation() {
        return implementation(null);
    }

    public LicenseResponseProjection implementation(String alias) {
        fields.add(new GraphQLResponseField("implementation").alias(alias));
        return this;
    }

    public LicenseResponseProjection key() {
        return key(null);
    }

    public LicenseResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public LicenseResponseProjection limitations(LicenseRuleResponseProjection subProjection) {
        return limitations(null, subProjection);
    }

    public LicenseResponseProjection limitations(String alias, LicenseRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("limitations").alias(alias).projection(subProjection));
        return this;
    }

    public LicenseResponseProjection name() {
        return name(null);
    }

    public LicenseResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LicenseResponseProjection nickname() {
        return nickname(null);
    }

    public LicenseResponseProjection nickname(String alias) {
        fields.add(new GraphQLResponseField("nickname").alias(alias));
        return this;
    }

    public LicenseResponseProjection permissions(LicenseRuleResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public LicenseResponseProjection permissions(String alias, LicenseRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public LicenseResponseProjection pseudoLicense() {
        return pseudoLicense(null);
    }

    public LicenseResponseProjection pseudoLicense(String alias) {
        fields.add(new GraphQLResponseField("pseudoLicense").alias(alias));
        return this;
    }

    public LicenseResponseProjection spdxId() {
        return spdxId(null);
    }

    public LicenseResponseProjection spdxId(String alias) {
        fields.add(new GraphQLResponseField("spdxId").alias(alias));
        return this;
    }

    public LicenseResponseProjection url() {
        return url(null);
    }

    public LicenseResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public LicenseResponseProjection typename() {
        return typename(null);
    }

    public LicenseResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LicenseResponseProjection that = (LicenseResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
