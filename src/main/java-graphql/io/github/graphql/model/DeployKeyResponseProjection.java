package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for DeployKey
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeployKeyResponseProjection extends GraphQLResponseProjection {

    public DeployKeyResponseProjection() {
    }

    @Override
    public DeployKeyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeployKeyResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.id();
        this.key();
        this.readOnly();
        this.title();
        this.verified();
        this.typename();
        return this;
    }

    public DeployKeyResponseProjection createdAt() {
        return createdAt(null);
    }

    public DeployKeyResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection id() {
        return id(null);
    }

    public DeployKeyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection key() {
        return key(null);
    }

    public DeployKeyResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection readOnly() {
        return readOnly(null);
    }

    public DeployKeyResponseProjection readOnly(String alias) {
        fields.add(new GraphQLResponseField("readOnly").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection title() {
        return title(null);
    }

    public DeployKeyResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection verified() {
        return verified(null);
    }

    public DeployKeyResponseProjection verified(String alias) {
        fields.add(new GraphQLResponseField("verified").alias(alias));
        return this;
    }

    public DeployKeyResponseProjection typename() {
        return typename(null);
    }

    public DeployKeyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
