package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GpgSignatureTO implements java.io.Serializable, GitSignatureTO {

    @javax.validation.constraints.NotNull
    private String email;
    private boolean isValid;
    private String keyId;
    @javax.validation.constraints.NotNull
    private String payload;
    @javax.validation.constraints.NotNull
    private String signature;
    private UserTO signer;
    @javax.validation.constraints.NotNull
    private GitSignatureStateTO state;
    private boolean wasSignedByGitHub;

    public GpgSignatureTO() {
    }

    public GpgSignatureTO(String email, boolean isValid, String keyId, String payload, String signature, UserTO signer, GitSignatureStateTO state, boolean wasSignedByGitHub) {
        this.email = email;
        this.isValid = isValid;
        this.keyId = keyId;
        this.payload = payload;
        this.signature = signature;
        this.signer = signer;
        this.state = state;
        this.wasSignedByGitHub = wasSignedByGitHub;
    }

    public String getEmail() {
        return email;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public String getKeyId() {
        return keyId;
    }

    public String getPayload() {
        return payload;
    }

    public String getSignature() {
        return signature;
    }

    public UserTO getSigner() {
        return signer;
    }

    public GitSignatureStateTO getState() {
        return state;
    }

    public boolean getWasSignedByGitHub() {
        return wasSignedByGitHub;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GpgSignatureTO that = (GpgSignatureTO) obj;
        return Objects.equals(email, that.email)
            && Objects.equals(isValid, that.isValid)
            && Objects.equals(keyId, that.keyId)
            && Objects.equals(payload, that.payload)
            && Objects.equals(signature, that.signature)
            && Objects.equals(signer, that.signer)
            && Objects.equals(state, that.state)
            && Objects.equals(wasSignedByGitHub, that.wasSignedByGitHub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        joiner.add("isValid: " + GraphQLRequestSerializer.getEntry(isValid));
        if (keyId != null) {
            joiner.add("keyId: " + GraphQLRequestSerializer.getEntry(keyId));
        }
        if (payload != null) {
            joiner.add("payload: " + GraphQLRequestSerializer.getEntry(payload));
        }
        if (signature != null) {
            joiner.add("signature: " + GraphQLRequestSerializer.getEntry(signature));
        }
        if (signer != null) {
            joiner.add("signer: " + GraphQLRequestSerializer.getEntry(signer));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        joiner.add("wasSignedByGitHub: " + GraphQLRequestSerializer.getEntry(wasSignedByGitHub));
        return joiner.toString();
    }

    public static GpgSignatureTO.Builder builder() {
        return new GpgSignatureTO.Builder();
    }

    public static class Builder {

        private String email;
        private boolean isValid;
        private String keyId;
        private String payload;
        private String signature;
        private UserTO signer;
        private GitSignatureStateTO state;
        private boolean wasSignedByGitHub;

        public Builder() {
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setIsValid(boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public Builder setSignature(String signature) {
            this.signature = signature;
            return this;
        }

        public Builder setSigner(UserTO signer) {
            this.signer = signer;
            return this;
        }

        public Builder setState(GitSignatureStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setWasSignedByGitHub(boolean wasSignedByGitHub) {
            this.wasSignedByGitHub = wasSignedByGitHub;
            return this;
        }


        public GpgSignatureTO build() {
            return new GpgSignatureTO(email, isValid, keyId, payload, signature, signer, state, wasSignedByGitHub);
        }

    }
}
