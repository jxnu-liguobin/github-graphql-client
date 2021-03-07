package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddPullRequestReviewCommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    private String commitOID;
    private String inReplyTo;
    private String path;
    private Integer position;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public AddPullRequestReviewCommentInputTO() {
    }

    public AddPullRequestReviewCommentInputTO(String body, String clientMutationId, String commitOID, String inReplyTo, String path, Integer position, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.commitOID = commitOID;
        this.inReplyTo = inReplyTo;
        this.path = path;
        this.position = position;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getCommitOID() {
        return commitOID;
    }

    public String getInReplyTo() {
        return inReplyTo;
    }

    public String getPath() {
        return path;
    }

    public Integer getPosition() {
        return position;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
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
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID));
        }
        if (inReplyTo != null) {
            joiner.add("inReplyTo: " + GraphQLRequestSerializer.getEntry(inReplyTo));
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        }
        if (pullRequestReviewId != null) {
            joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId));
        }
        return joiner.toString();
    }

    public static AddPullRequestReviewCommentInputTO.Builder builder() {
        return new AddPullRequestReviewCommentInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String commitOID;
        private String inReplyTo;
        private String path;
        private Integer position;
        private String pullRequestReviewId;

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

        public Builder setCommitOID(String commitOID) {
            this.commitOID = commitOID;
            return this;
        }

        public Builder setInReplyTo(String inReplyTo) {
            this.inReplyTo = inReplyTo;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = position;
            return this;
        }

        public Builder setPullRequestReviewId(String pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }


        public AddPullRequestReviewCommentInputTO build() {
            return new AddPullRequestReviewCommentInputTO(body, clientMutationId, commitOID, inReplyTo, path, position, pullRequestReviewId);
        }

    }
}
