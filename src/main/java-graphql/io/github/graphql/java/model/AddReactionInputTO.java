package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddReactionInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private ReactionContentTO content;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public AddReactionInputTO() {
    }

    public AddReactionInputTO(String clientMutationId, ReactionContentTO content, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.content = content;
        this.subjectId = subjectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ReactionContentTO getContent() {
        return content;
    }

    public String getSubjectId() {
        return subjectId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddReactionInputTO that = (AddReactionInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(content, that.content)
            && Objects.equals(subjectId, that.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, content, subjectId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
        }
        if (subjectId != null) {
            joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId));
        }
        return joiner.toString();
    }

    public static AddReactionInputTO.Builder builder() {
        return new AddReactionInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ReactionContentTO content;
        private String subjectId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setContent(ReactionContentTO content) {
            this.content = content;
            return this;
        }

        public Builder setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }


        public AddReactionInputTO build() {
            return new AddReactionInputTO(clientMutationId, content, subjectId);
        }

    }
}
