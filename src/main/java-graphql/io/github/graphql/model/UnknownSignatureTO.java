package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnknownSignatureTO implements java.io.Serializable, GitSignatureTO {

    @javax.validation.constraints.NotNull
    private String email;
    private boolean isValid;
    @javax.validation.constraints.NotNull
    private String payload;
    @javax.validation.constraints.NotNull
    private String signature;
    private UserTO signer;
    @javax.validation.constraints.NotNull
    private GitSignatureStateTO state;
    private boolean wasSignedByGitHub;

    public UnknownSignatureTO() {
    }

    public UnknownSignatureTO(String email, boolean isValid, String payload, String signature, UserTO signer, GitSignatureStateTO state, boolean wasSignedByGitHub) {
        this.email = email;
        this.isValid = isValid;
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        joiner.add("isValid: " + GraphQLRequestSerializer.getEntry(isValid));
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

    public static UnknownSignatureTO.Builder builder() {
        return new UnknownSignatureTO.Builder();
    }

    public static class Builder {

        private String email;
        private boolean isValid;
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


        public UnknownSignatureTO build() {
            return new UnknownSignatureTO(email, isValid, payload, signature, signer, state, wasSignedByGitHub);
        }

    }
}
