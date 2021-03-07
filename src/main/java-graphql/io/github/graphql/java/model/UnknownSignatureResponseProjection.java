package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UnknownSignature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnknownSignatureResponseProjection extends GraphQLResponseProjection {

    public UnknownSignatureResponseProjection() {
    }

    @Override
    public UnknownSignatureResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnknownSignatureResponseProjection all$(int maxDepth) {
        this.email();
        this.isValid();
        this.payload();
        this.signature();
        if (projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnknownSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0) + 1);
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnknownSignatureResponseProjection.UserResponseProjection.signer", 0)));
        }
        this.state();
        this.wasSignedByGitHub();
        this.typename();
        return this;
    }

    public UnknownSignatureResponseProjection email() {
        return email(null);
    }

    public UnknownSignatureResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection isValid() {
        return isValid(null);
    }

    public UnknownSignatureResponseProjection isValid(String alias) {
        fields.add(new GraphQLResponseField("isValid").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection payload() {
        return payload(null);
    }

    public UnknownSignatureResponseProjection payload(String alias) {
        fields.add(new GraphQLResponseField("payload").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection signature() {
        return signature(null);
    }

    public UnknownSignatureResponseProjection signature(String alias) {
        fields.add(new GraphQLResponseField("signature").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection signer(UserResponseProjection subProjection) {
        return signer(null, subProjection);
    }

    public UnknownSignatureResponseProjection signer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection));
        return this;
    }

    public UnknownSignatureResponseProjection state() {
        return state(null);
    }

    public UnknownSignatureResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection wasSignedByGitHub() {
        return wasSignedByGitHub(null);
    }

    public UnknownSignatureResponseProjection wasSignedByGitHub(String alias) {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias));
        return this;
    }

    public UnknownSignatureResponseProjection typename() {
        return typename(null);
    }

    public UnknownSignatureResponseProjection typename(String alias) {
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
        final UnknownSignatureResponseProjection that = (UnknownSignatureResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
