package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AddCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public AddCommentPayloadResponseProjection() {
    }

    @Override
    public AddCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0) + 1);
            this.commentEdge(new IssueCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueCommentEdgeResponseProjection.commentEdge", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0) + 1);
            this.subject(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.NodeResponseProjection.subject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0) + 1);
            this.timelineEdge(new IssueTimelineItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddCommentPayloadResponseProjection.IssueTimelineItemEdgeResponseProjection.timelineEdge", 0)));
        }
        this.typename();
        return this;
    }

    public AddCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddCommentPayloadResponseProjection commentEdge(IssueCommentEdgeResponseProjection subProjection) {
        return commentEdge(null, subProjection);
    }

    public AddCommentPayloadResponseProjection commentEdge(String alias, IssueCommentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commentEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddCommentPayloadResponseProjection subject(NodeResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public AddCommentPayloadResponseProjection subject(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public AddCommentPayloadResponseProjection timelineEdge(IssueTimelineItemEdgeResponseProjection subProjection) {
        return timelineEdge(null, subProjection);
    }

    public AddCommentPayloadResponseProjection timelineEdge(String alias, IssueTimelineItemEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timelineEdge").alias(alias).projection(subProjection));
        return this;
    }

    public AddCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddCommentPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
