package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateRefInputTO implements java.io.Serializable {

    private String clientMutationId;
    private Boolean force = false;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private String refId;

    public UpdateRefInputTO() {
    }

    public UpdateRefInputTO(String clientMutationId, Boolean force, String oid, String refId) {
        this.clientMutationId = clientMutationId;
        this.force = force;
        this.oid = oid;
        this.refId = refId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public Boolean getForce() {
        return force;
    }

    public String getOid() {
        return oid;
    }

    public String getRefId() {
        return refId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateRefInputTO that = (UpdateRefInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(force, that.force)
            && Objects.equals(oid, that.oid)
            && Objects.equals(refId, that.refId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, force, oid, refId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (force != null) {
            joiner.add("force: " + GraphQLRequestSerializer.getEntry(force));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (refId != null) {
            joiner.add("refId: " + GraphQLRequestSerializer.getEntry(refId));
        }
        return joiner.toString();
    }

    public static UpdateRefInputTO.Builder builder() {
        return new UpdateRefInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private Boolean force = false;
        private String oid;
        private String refId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setForce(Boolean force) {
            this.force = force;
            return this;
        }

        public Builder setOid(String oid) {
            this.oid = oid;
            return this;
        }

        public Builder setRefId(String refId) {
            this.refId = refId;
            return this;
        }


        public UpdateRefInputTO build() {
            return new UpdateRefInputTO(clientMutationId, force, oid, refId);
        }

    }
}
