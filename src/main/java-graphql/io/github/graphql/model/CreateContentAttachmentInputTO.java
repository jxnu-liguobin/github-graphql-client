package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateContentAttachmentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String contentReferenceId;
    @javax.validation.constraints.NotNull
    private String title;

    public CreateContentAttachmentInputTO() {
    }

    public CreateContentAttachmentInputTO(String body, String clientMutationId, String contentReferenceId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.contentReferenceId = contentReferenceId;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getContentReferenceId() {
        return contentReferenceId;
    }

    public String getTitle() {
        return title;
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
        if (contentReferenceId != null) {
            joiner.add("contentReferenceId: " + GraphQLRequestSerializer.getEntry(contentReferenceId));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static CreateContentAttachmentInputTO.Builder builder() {
        return new CreateContentAttachmentInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String contentReferenceId;
        private String title;

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

        public Builder setContentReferenceId(String contentReferenceId) {
            this.contentReferenceId = contentReferenceId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public CreateContentAttachmentInputTO build() {
            return new CreateContentAttachmentInputTO(body, clientMutationId, contentReferenceId, title);
        }

    }
}
