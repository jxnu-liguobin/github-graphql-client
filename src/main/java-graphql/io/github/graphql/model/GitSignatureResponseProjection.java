package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GitSignature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GitSignatureResponseProjection extends GraphQLResponseProjection {

    public GitSignatureResponseProjection() {
    }

    @Override
    public GitSignatureResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GitSignatureResponseProjection all$(int maxDepth) {
        this.email();
        this.isValid();
        this.payload();
        this.signature();
        if (projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0) + 1);
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitSignatureResponseProjection.UserResponseProjection.signer", 0)));
        }
        this.state();
        this.wasSignedByGitHub();
        this.typename();
        return this;
    }

    public GitSignatureResponseProjection email() {
        return email(null);
    }

    public GitSignatureResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection isValid() {
        return isValid(null);
    }

    public GitSignatureResponseProjection isValid(String alias) {
        fields.add(new GraphQLResponseField("isValid").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection payload() {
        return payload(null);
    }

    public GitSignatureResponseProjection payload(String alias) {
        fields.add(new GraphQLResponseField("payload").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection signature() {
        return signature(null);
    }

    public GitSignatureResponseProjection signature(String alias) {
        fields.add(new GraphQLResponseField("signature").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection signer(UserResponseProjection subProjection) {
        return signer(null, subProjection);
    }

    public GitSignatureResponseProjection signer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection));
        return this;
    }

    public GitSignatureResponseProjection state() {
        return state(null);
    }

    public GitSignatureResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection wasSignedByGitHub() {
        return wasSignedByGitHub(null);
    }

    public GitSignatureResponseProjection wasSignedByGitHub(String alias) {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias));
        return this;
    }

    public GitSignatureResponseProjection onUnknownSignature(UnknownSignatureResponseProjection subProjection) {
        return onUnknownSignature(null, subProjection);
    }

    public GitSignatureResponseProjection onUnknownSignature(String alias, UnknownSignatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on UnknownSignature").alias(alias).projection(subProjection));
        return this;
    }

    public GitSignatureResponseProjection onGpgSignature(GpgSignatureResponseProjection subProjection) {
        return onGpgSignature(null, subProjection);
    }

    public GitSignatureResponseProjection onGpgSignature(String alias, GpgSignatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GpgSignature").alias(alias).projection(subProjection));
        return this;
    }

    public GitSignatureResponseProjection onSmimeSignature(SmimeSignatureResponseProjection subProjection) {
        return onSmimeSignature(null, subProjection);
    }

    public GitSignatureResponseProjection onSmimeSignature(String alias, SmimeSignatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on SmimeSignature").alias(alias).projection(subProjection));
        return this;
    }

    public GitSignatureResponseProjection typename() {
        return typename(null);
    }

    public GitSignatureResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
