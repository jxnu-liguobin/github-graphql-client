package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PushAllowanceActor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PushAllowanceActorResponseProjection extends GraphQLResponseProjection {

    public PushAllowanceActorResponseProjection() {
    }

    @Override
    public PushAllowanceActorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PushAllowanceActorResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public PushAllowanceActorResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public PushAllowanceActorResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceActorResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public PushAllowanceActorResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public PushAllowanceActorResponseProjection typename() {
        return typename(null);
    }

    public PushAllowanceActorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
