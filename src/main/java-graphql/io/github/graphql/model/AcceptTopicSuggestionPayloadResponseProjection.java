package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AcceptTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AcceptTopicSuggestionPayloadResponseProjection extends GraphQLResponseProjection {

    public AcceptTopicSuggestionPayloadResponseProjection() {
    }

    @Override
    public AcceptTopicSuggestionPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AcceptTopicSuggestionPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1);
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)));
        }
        this.typename();
        return this;
    }

    public AcceptTopicSuggestionPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AcceptTopicSuggestionPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AcceptTopicSuggestionPayloadResponseProjection topic(TopicResponseProjection subProjection) {
        return topic(null, subProjection);
    }

    public AcceptTopicSuggestionPayloadResponseProjection topic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection));
        return this;
    }

    public AcceptTopicSuggestionPayloadResponseProjection typename() {
        return typename(null);
    }

    public AcceptTopicSuggestionPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
