package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ClearLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ClearLabelsFromLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    public ClearLabelsFromLabelablePayloadResponseProjection() {
    }

    @Override
    public ClearLabelsFromLabelablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ClearLabelsFromLabelablePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1);
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)));
        }
        this.typename();
        return this;
    }

    public ClearLabelsFromLabelablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ClearLabelsFromLabelablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ClearLabelsFromLabelablePayloadResponseProjection labelable(LabelableResponseProjection subProjection) {
        return labelable(null, subProjection);
    }

    public ClearLabelsFromLabelablePayloadResponseProjection labelable(String alias, LabelableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection));
        return this;
    }

    public ClearLabelsFromLabelablePayloadResponseProjection typename() {
        return typename(null);
    }

    public ClearLabelsFromLabelablePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
