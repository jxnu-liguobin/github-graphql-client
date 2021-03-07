package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewDismissalAllowanceActor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReviewDismissalAllowanceActorResponseProjection extends GraphQLResponseProjection {

    public ReviewDismissalAllowanceActorResponseProjection() {
    }

    @Override
    public ReviewDismissalAllowanceActorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewDismissalAllowanceActorResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public ReviewDismissalAllowanceActorResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public ReviewDismissalAllowanceActorResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceActorResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public ReviewDismissalAllowanceActorResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissalAllowanceActorResponseProjection typename() {
        return typename(null);
    }

    public ReviewDismissalAllowanceActorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
