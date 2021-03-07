package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RemoveAssigneesFromAssignablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RemoveAssigneesFromAssignablePayloadResponseProjection extends GraphQLResponseProjection {

    public RemoveAssigneesFromAssignablePayloadResponseProjection() {
    }

    @Override
    public RemoveAssigneesFromAssignablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemoveAssigneesFromAssignablePayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1);
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)));
        }
        this.clientMutationId();
        this.typename();
        return this;
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection assignable(AssignableResponseProjection subProjection) {
        return assignable(null, subProjection);
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection assignable(String alias, AssignableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection typename() {
        return typename(null);
    }

    public RemoveAssigneesFromAssignablePayloadResponseProjection typename(String alias) {
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
        final RemoveAssigneesFromAssignablePayloadResponseProjection that = (RemoveAssigneesFromAssignablePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
