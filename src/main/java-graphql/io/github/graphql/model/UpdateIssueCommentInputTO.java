package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateIssueCommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String id;

    public UpdateIssueCommentInputTO() {
    }

    public UpdateIssueCommentInputTO(String body, String clientMutationId, String id) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getId() {
        return id;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static UpdateIssueCommentInputTO.Builder builder() {
        return new UpdateIssueCommentInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String id;

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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public UpdateIssueCommentInputTO build() {
            return new UpdateIssueCommentInputTO(body, clientMutationId, id);
        }

    }
}
