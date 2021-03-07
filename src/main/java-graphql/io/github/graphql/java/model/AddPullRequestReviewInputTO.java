package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddPullRequestReviewInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    private java.util.List<DraftPullRequestReviewCommentTO> comments;
    private String commitOID;
    private PullRequestReviewEventTO event;
    @javax.validation.constraints.NotNull
    private String pullRequestId;

    public AddPullRequestReviewInputTO() {
    }

    public AddPullRequestReviewInputTO(String body, String clientMutationId, java.util.List<DraftPullRequestReviewCommentTO> comments, String commitOID, PullRequestReviewEventTO event, String pullRequestId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.comments = comments;
        this.commitOID = commitOID;
        this.event = event;
        this.pullRequestId = pullRequestId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public java.util.List<DraftPullRequestReviewCommentTO> getComments() {
        return comments;
    }

    public String getCommitOID() {
        return commitOID;
    }

    public PullRequestReviewEventTO getEvent() {
        return event;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddPullRequestReviewInputTO that = (AddPullRequestReviewInputTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(comments, that.comments)
            && Objects.equals(commitOID, that.commitOID)
            && Objects.equals(event, that.event)
            && Objects.equals(pullRequestId, that.pullRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, clientMutationId, comments, commitOID, event, pullRequestId);
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
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments));
        }
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID));
        }
        if (event != null) {
            joiner.add("event: " + GraphQLRequestSerializer.getEntry(event));
        }
        if (pullRequestId != null) {
            joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId));
        }
        return joiner.toString();
    }

    public static AddPullRequestReviewInputTO.Builder builder() {
        return new AddPullRequestReviewInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private java.util.List<DraftPullRequestReviewCommentTO> comments;
        private String commitOID;
        private PullRequestReviewEventTO event;
        private String pullRequestId;

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

        public Builder setComments(java.util.List<DraftPullRequestReviewCommentTO> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setCommitOID(String commitOID) {
            this.commitOID = commitOID;
            return this;
        }

        public Builder setEvent(PullRequestReviewEventTO event) {
            this.event = event;
            return this;
        }

        public Builder setPullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }


        public AddPullRequestReviewInputTO build() {
            return new AddPullRequestReviewInputTO(body, clientMutationId, comments, commitOID, event, pullRequestId);
        }

    }
}
