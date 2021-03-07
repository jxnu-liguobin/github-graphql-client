package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeclineTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeclineTopicSuggestionPayloadResponseProjection extends GraphQLResponseProjection {

    public DeclineTopicSuggestionPayloadResponseProjection() {
    }

    @Override
    public DeclineTopicSuggestionPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeclineTopicSuggestionPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1);
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)));
        }
        this.typename();
        return this;
    }

    public DeclineTopicSuggestionPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeclineTopicSuggestionPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeclineTopicSuggestionPayloadResponseProjection topic(TopicResponseProjection subProjection) {
        return topic(null, subProjection);
    }

    public DeclineTopicSuggestionPayloadResponseProjection topic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection));
        return this;
    }

    public DeclineTopicSuggestionPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeclineTopicSuggestionPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeclineTopicSuggestionPayloadResponseProjection that = (DeclineTopicSuggestionPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
