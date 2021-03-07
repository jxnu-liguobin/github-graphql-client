package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddReactionPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddReactionPayloadResponseProjection extends GraphQLResponseProjection {

    public AddReactionPayloadResponseProjection() {
    }

    @Override
    public AddReactionPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddReactionPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1);
            this.reaction(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1);
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public AddReactionPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddReactionPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddReactionPayloadResponseProjection reaction(ReactionResponseProjection subProjection) {
        return reaction(null, subProjection);
    }

    public AddReactionPayloadResponseProjection reaction(String alias, ReactionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reaction").alias(alias).projection(subProjection));
        return this;
    }

    public AddReactionPayloadResponseProjection subject(ReactableResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public AddReactionPayloadResponseProjection subject(String alias, ReactableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public AddReactionPayloadResponseProjection typename() {
        return typename(null);
    }

    public AddReactionPayloadResponseProjection typename(String alias) {
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
        final AddReactionPayloadResponseProjection that = (AddReactionPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
