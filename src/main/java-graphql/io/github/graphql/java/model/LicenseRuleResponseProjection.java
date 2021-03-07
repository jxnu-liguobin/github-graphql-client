package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LicenseRule
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LicenseRuleResponseProjection extends GraphQLResponseProjection {

    public LicenseRuleResponseProjection() {
    }

    @Override
    public LicenseRuleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LicenseRuleResponseProjection all$(int maxDepth) {
        this.description();
        this.key();
        this.label();
        this.typename();
        return this;
    }

    public LicenseRuleResponseProjection description() {
        return description(null);
    }

    public LicenseRuleResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public LicenseRuleResponseProjection key() {
        return key(null);
    }

    public LicenseRuleResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public LicenseRuleResponseProjection label() {
        return label(null);
    }

    public LicenseRuleResponseProjection label(String alias) {
        fields.add(new GraphQLResponseField("label").alias(alias));
        return this;
    }

    public LicenseRuleResponseProjection typename() {
        return typename(null);
    }

    public LicenseRuleResponseProjection typename(String alias) {
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
        final LicenseRuleResponseProjection that = (LicenseRuleResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
