package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PublicKey
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PublicKeyResponseProjection extends GraphQLResponseProjection {

    public PublicKeyResponseProjection() {
    }

    @Override
    public PublicKeyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PublicKeyResponseProjection all$(int maxDepth) {
        this.accessedAt();
        this.createdAt();
        this.fingerprint();
        this.id();
        this.isReadOnly();
        this.key();
        this.updatedAt();
        this.typename();
        return this;
    }

    public PublicKeyResponseProjection accessedAt() {
        return accessedAt(null);
    }

    public PublicKeyResponseProjection accessedAt(String alias) {
        fields.add(new GraphQLResponseField("accessedAt").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection createdAt() {
        return createdAt(null);
    }

    public PublicKeyResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection fingerprint() {
        return fingerprint(null);
    }

    public PublicKeyResponseProjection fingerprint(String alias) {
        fields.add(new GraphQLResponseField("fingerprint").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection id() {
        return id(null);
    }

    public PublicKeyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection isReadOnly() {
        return isReadOnly(null);
    }

    public PublicKeyResponseProjection isReadOnly(String alias) {
        fields.add(new GraphQLResponseField("isReadOnly").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection key() {
        return key(null);
    }

    public PublicKeyResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public PublicKeyResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public PublicKeyResponseProjection typename() {
        return typename(null);
    }

    public PublicKeyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
