package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MinimizeCommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ReportedContentClassifiersTO classifier;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String subjectId;

    public MinimizeCommentInputTO() {
    }

    public MinimizeCommentInputTO(ReportedContentClassifiersTO classifier, String clientMutationId, String subjectId) {
        this.classifier = classifier;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
    }

    public ReportedContentClassifiersTO getClassifier() {
        return classifier;
    }

    public String getClientMutationId() {
        return clientMutationId;
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
        final MinimizeCommentInputTO that = (MinimizeCommentInputTO) obj;
        return Objects.equals(classifier, that.classifier)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(subjectId, that.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classifier, clientMutationId, subjectId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (classifier != null) {
            joiner.add("classifier: " + GraphQLRequestSerializer.getEntry(classifier));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (subjectId != null) {
            joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId));
        }
        return joiner.toString();
    }

    public static MinimizeCommentInputTO.Builder builder() {
        return new MinimizeCommentInputTO.Builder();
    }

    public static class Builder {

        private ReportedContentClassifiersTO classifier;
        private String clientMutationId;
        private String subjectId;

        public Builder() {
        }

        public Builder setClassifier(ReportedContentClassifiersTO classifier) {
            this.classifier = classifier;
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


        public MinimizeCommentInputTO build() {
            return new MinimizeCommentInputTO(classifier, clientMutationId, subjectId);
        }

    }
}
