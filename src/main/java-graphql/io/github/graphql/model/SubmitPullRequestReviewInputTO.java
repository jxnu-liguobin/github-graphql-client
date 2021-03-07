package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SubmitPullRequestReviewInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private PullRequestReviewEventTO event;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public SubmitPullRequestReviewInputTO() {
    }

    public SubmitPullRequestReviewInputTO(String body, String clientMutationId, PullRequestReviewEventTO event, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.event = event;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewEventTO getEvent() {
        return event;
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
        if (event != null) {
            joiner.add("event: " + GraphQLRequestSerializer.getEntry(event));
        }
        if (pullRequestReviewId != null) {
            joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId));
        }
        return joiner.toString();
    }

    public static SubmitPullRequestReviewInputTO.Builder builder() {
        return new SubmitPullRequestReviewInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private PullRequestReviewEventTO event;
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

        public Builder setEvent(PullRequestReviewEventTO event) {
            this.event = event;
            return this;
        }

        public Builder setPullRequestReviewId(String pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }


        public SubmitPullRequestReviewInputTO build() {
            return new SubmitPullRequestReviewInputTO(body, clientMutationId, event, pullRequestReviewId);
        }

    }
}
