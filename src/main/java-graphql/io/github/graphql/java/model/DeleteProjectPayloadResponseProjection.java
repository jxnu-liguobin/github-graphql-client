package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeleteProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteProjectPayloadResponseProjection() {
    }

    @Override
    public DeleteProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1);
            this.owner(new ProjectOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0)));
        }
        this.typename();
        return this;
    }

    public DeleteProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteProjectPayloadResponseProjection owner(ProjectOwnerResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public DeleteProjectPayloadResponseProjection owner(String alias, ProjectOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public DeleteProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteProjectPayloadResponseProjection typename(String alias) {
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
        final DeleteProjectPayloadResponseProjection that = (DeleteProjectPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
