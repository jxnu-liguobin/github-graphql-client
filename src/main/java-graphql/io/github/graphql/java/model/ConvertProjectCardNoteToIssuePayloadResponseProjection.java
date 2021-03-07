package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ConvertProjectCardNoteToIssuePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ConvertProjectCardNoteToIssuePayloadResponseProjection extends GraphQLResponseProjection {

    public ConvertProjectCardNoteToIssuePayloadResponseProjection() {
    }

    @Override
    public ConvertProjectCardNoteToIssuePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ConvertProjectCardNoteToIssuePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1);
            this.projectCard(new ProjectCardResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConvertProjectCardNoteToIssuePayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)));
        }
        this.typename();
        return this;
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection projectCard(ProjectCardResponseProjection subProjection) {
        return projectCard(null, subProjection);
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection projectCard(String alias, ProjectCardResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCard").alias(alias).projection(subProjection));
        return this;
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection typename() {
        return typename(null);
    }

    public ConvertProjectCardNoteToIssuePayloadResponseProjection typename(String alias) {
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
        final ConvertProjectCardNoteToIssuePayloadResponseProjection that = (ConvertProjectCardNoteToIssuePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
