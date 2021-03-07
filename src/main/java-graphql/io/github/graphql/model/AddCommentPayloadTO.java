package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddCommentPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private IssueCommentEdgeTO commentEdge;
    private NodeTO subject;
    private IssueTimelineItemEdgeTO timelineEdge;

    public AddCommentPayloadTO() {
    }

    public AddCommentPayloadTO(String clientMutationId, IssueCommentEdgeTO commentEdge, NodeTO subject, IssueTimelineItemEdgeTO timelineEdge) {
        this.clientMutationId = clientMutationId;
        this.commentEdge = commentEdge;
        this.subject = subject;
        this.timelineEdge = timelineEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public IssueCommentEdgeTO getCommentEdge() {
        return commentEdge;
    }

    public NodeTO getSubject() {
        return subject;
    }

    public IssueTimelineItemEdgeTO getTimelineEdge() {
        return timelineEdge;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        if (timelineEdge != null) {
            joiner.add("timelineEdge: " + GraphQLRequestSerializer.getEntry(timelineEdge));
        }
        return joiner.toString();
    }

    public static AddCommentPayloadTO.Builder builder() {
        return new AddCommentPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private IssueCommentEdgeTO commentEdge;
        private NodeTO subject;
        private IssueTimelineItemEdgeTO timelineEdge;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setCommentEdge(IssueCommentEdgeTO commentEdge) {
            this.commentEdge = commentEdge;
            return this;
        }

        public Builder setSubject(NodeTO subject) {
            this.subject = subject;
            return this;
        }

        public Builder setTimelineEdge(IssueTimelineItemEdgeTO timelineEdge) {
            this.timelineEdge = timelineEdge;
            return this;
        }


        public AddCommentPayloadTO build() {
            return new AddCommentPayloadTO(clientMutationId, commentEdge, subject, timelineEdge);
        }

    }
}
