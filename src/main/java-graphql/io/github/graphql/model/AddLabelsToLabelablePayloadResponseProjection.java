package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AddLabelsToLabelablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddLabelsToLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    public AddLabelsToLabelablePayloadResponseProjection() {
    }

    @Override
    public AddLabelsToLabelablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddLabelsToLabelablePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1);
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)));
        }
        this.typename();
        return this;
    }

    public AddLabelsToLabelablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddLabelsToLabelablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddLabelsToLabelablePayloadResponseProjection labelable(LabelableResponseProjection subProjection) {
        return labelable(null, subProjection);
    }

    public AddLabelsToLabelablePayloadResponseProjection labelable(String alias, LabelableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection));
        return this;
    }

    public AddLabelsToLabelablePayloadResponseProjection typename() {
        return typename(null);
    }

    public AddLabelsToLabelablePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
