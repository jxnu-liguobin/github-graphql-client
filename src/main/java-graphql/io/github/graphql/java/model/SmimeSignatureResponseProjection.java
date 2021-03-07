package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SmimeSignature
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SmimeSignatureResponseProjection extends GraphQLResponseProjection {

    public SmimeSignatureResponseProjection() {
    }

    @Override
    public SmimeSignatureResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SmimeSignatureResponseProjection all$(int maxDepth) {
        this.email();
        this.isValid();
        this.payload();
        this.signature();
        if (projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SmimeSignatureResponseProjection.UserResponseProjection.signer", projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0) + 1);
            this.signer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SmimeSignatureResponseProjection.UserResponseProjection.signer", 0)));
        }
        this.state();
        this.wasSignedByGitHub();
        this.typename();
        return this;
    }

    public SmimeSignatureResponseProjection email() {
        return email(null);
    }

    public SmimeSignatureResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection isValid() {
        return isValid(null);
    }

    public SmimeSignatureResponseProjection isValid(String alias) {
        fields.add(new GraphQLResponseField("isValid").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection payload() {
        return payload(null);
    }

    public SmimeSignatureResponseProjection payload(String alias) {
        fields.add(new GraphQLResponseField("payload").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection signature() {
        return signature(null);
    }

    public SmimeSignatureResponseProjection signature(String alias) {
        fields.add(new GraphQLResponseField("signature").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection signer(UserResponseProjection subProjection) {
        return signer(null, subProjection);
    }

    public SmimeSignatureResponseProjection signer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("signer").alias(alias).projection(subProjection));
        return this;
    }

    public SmimeSignatureResponseProjection state() {
        return state(null);
    }

    public SmimeSignatureResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection wasSignedByGitHub() {
        return wasSignedByGitHub(null);
    }

    public SmimeSignatureResponseProjection wasSignedByGitHub(String alias) {
        fields.add(new GraphQLResponseField("wasSignedByGitHub").alias(alias));
        return this;
    }

    public SmimeSignatureResponseProjection typename() {
        return typename(null);
    }

    public SmimeSignatureResponseProjection typename(String alias) {
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
        final SmimeSignatureResponseProjection that = (SmimeSignatureResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
