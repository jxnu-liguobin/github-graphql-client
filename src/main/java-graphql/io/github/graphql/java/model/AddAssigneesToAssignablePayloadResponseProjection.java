package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for AddAssigneesToAssignablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddAssigneesToAssignablePayloadResponseProjection extends GraphQLResponseProjection {

    public AddAssigneesToAssignablePayloadResponseProjection() {
    }

    @Override
    public AddAssigneesToAssignablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AddAssigneesToAssignablePayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1);
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)));
        }
        this.clientMutationId();
        this.typename();
        return this;
    }

    public AddAssigneesToAssignablePayloadResponseProjection assignable(AssignableResponseProjection subProjection) {
        return assignable(null, subProjection);
    }

    public AddAssigneesToAssignablePayloadResponseProjection assignable(String alias, AssignableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection));
        return this;
    }

    public AddAssigneesToAssignablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public AddAssigneesToAssignablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public AddAssigneesToAssignablePayloadResponseProjection typename() {
        return typename(null);
    }

    public AddAssigneesToAssignablePayloadResponseProjection typename(String alias) {
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
        final AddAssigneesToAssignablePayloadResponseProjection that = (AddAssigneesToAssignablePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
