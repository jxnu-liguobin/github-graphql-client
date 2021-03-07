package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Assignee
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AssigneeResponseProjection extends GraphQLResponseProjection {

    public AssigneeResponseProjection() {
    }

    @Override
    public AssigneeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AssigneeResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public AssigneeResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public AssigneeResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public AssigneeResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public AssigneeResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public AssigneeResponseProjection onMannequin(MannequinResponseProjection subProjection) {
        return onMannequin(null, subProjection);
    }

    public AssigneeResponseProjection onMannequin(String alias, MannequinResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection));
        return this;
    }

    public AssigneeResponseProjection onBot(BotResponseProjection subProjection) {
        return onBot(null, subProjection);
    }

    public AssigneeResponseProjection onBot(String alias, BotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection));
        return this;
    }

    public AssigneeResponseProjection typename() {
        return typename(null);
    }

    public AssigneeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
