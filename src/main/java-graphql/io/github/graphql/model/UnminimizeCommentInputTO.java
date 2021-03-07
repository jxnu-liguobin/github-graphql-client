package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnminimizeCommentInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public UnminimizeCommentInputTO() {
    }

    public UnminimizeCommentInputTO(String clientMutationId, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getSubjectId() {
        return subjectId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (subjectId != null) {
            joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId));
        }
        return joiner.toString();
    }

    public static UnminimizeCommentInputTO.Builder builder() {
        return new UnminimizeCommentInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String subjectId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }


        public UnminimizeCommentInputTO build() {
            return new UnminimizeCommentInputTO(clientMutationId, subjectId);
        }

    }
}
