package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddCommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public AddCommentInputTO() {
    }

    public AddCommentInputTO(String body, String clientMutationId, String subjectId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
    }

    public String getBody() {
        return body;
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
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (subjectId != null) {
            joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId));
        }
        return joiner.toString();
    }

    public static AddCommentInputTO.Builder builder() {
        return new AddCommentInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String subjectId;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }


        public AddCommentInputTO build() {
            return new AddCommentInputTO(body, clientMutationId, subjectId);
        }

    }
}
