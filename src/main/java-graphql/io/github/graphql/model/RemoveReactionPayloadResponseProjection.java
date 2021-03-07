package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RemoveReactionPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RemoveReactionPayloadResponseProjection extends GraphQLResponseProjection {

    public RemoveReactionPayloadResponseProjection() {
    }

    @Override
    public RemoveReactionPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemoveReactionPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1);
            this.reaction(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1);
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public RemoveReactionPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RemoveReactionPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RemoveReactionPayloadResponseProjection reaction(ReactionResponseProjection subProjection) {
        return reaction(null, subProjection);
    }

    public RemoveReactionPayloadResponseProjection reaction(String alias, ReactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reaction").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveReactionPayloadResponseProjection subject(ReactableResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public RemoveReactionPayloadResponseProjection subject(String alias, ReactableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveReactionPayloadResponseProjection typename() {
        return typename(null);
    }

    public RemoveReactionPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
