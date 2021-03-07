package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CloneProjectPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CloneProjectPayloadResponseProjection extends GraphQLResponseProjection {

    public CloneProjectPayloadResponseProjection() {
    }

    @Override
    public CloneProjectPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CloneProjectPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.jobStatusId();
        if (projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.typename();
        return this;
    }

    public CloneProjectPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CloneProjectPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CloneProjectPayloadResponseProjection jobStatusId() {
        return jobStatusId(null);
    }

    public CloneProjectPayloadResponseProjection jobStatusId(String alias) {
        fields.add(new GraphQLResponseField("jobStatusId").alias(alias));
        return this;
    }

    public CloneProjectPayloadResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public CloneProjectPayloadResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public CloneProjectPayloadResponseProjection typename() {
        return typename(null);
    }

    public CloneProjectPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
