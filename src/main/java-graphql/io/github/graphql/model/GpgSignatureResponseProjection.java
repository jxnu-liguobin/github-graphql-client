package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GpgSignature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GpgSignatureResponseProjection extends GraphQLResponseProjection {

    public GpgSignatureResponseProjection() {
    }

    @Override
    public GpgSignatureResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GpgSignatureResponseProjection all$(int maxDepth) {
        this.email();
        this.isValid();
        this.keyId();
        this.payload();
        this.signature();
        if (projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("GpgSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0) + 1);
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GpgSignatureResponseProjection.UserResponseProjection.signer", 0)));
        }
        this.state();
        this.wasSignedByGitHub();
        this.typename();
        return this;
    }

    public GpgSignatureResponseProjection email() {
        return email(null);
    }

    public GpgSignatureResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection isValid() {
        return isValid(null);
    }

    public GpgSignatureResponseProjection isValid(String alias) {
        fields.add(new GraphQLResponseField("isValid").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection keyId() {
        return keyId(null);
    }

    public GpgSignatureResponseProjection keyId(String alias) {
        fields.add(new GraphQLResponseField("keyId").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection payload() {
        return payload(null);
    }

    public GpgSignatureResponseProjection payload(String alias) {
        fields.add(new GraphQLResponseField("payload").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection signature() {
        return signature(null);
    }

    public GpgSignatureResponseProjection signature(String alias) {
        fields.add(new GraphQLResponseField("signature").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection signer(UserResponseProjection subProjection) {
        return signer(null, subProjection);
    }

    public GpgSignatureResponseProjection signer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection));
        return this;
    }

    public GpgSignatureResponseProjection state() {
        return state(null);
    }

    public GpgSignatureResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection wasSignedByGitHub() {
        return wasSignedByGitHub(null);
    }

    public GpgSignatureResponseProjection wasSignedByGitHub(String alias) {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias));
        return this;
    }

    public GpgSignatureResponseProjection typename() {
        return typename(null);
    }

    public GpgSignatureResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
