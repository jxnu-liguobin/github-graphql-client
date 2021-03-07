package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Actor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ActorResponseProjection extends GraphQLResponseProjection {

    public ActorResponseProjection() {
    }

    @Override
    public ActorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ActorResponseProjection all$(int maxDepth) {
        this.avatarUrl();
        this.login();
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public ActorResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public ActorResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public ActorResponseProjection avatarUrl(ActorAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public ActorResponseProjection avatarUrl(String alias, ActorAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public ActorResponseProjection login() {
        return login(null);
    }

    public ActorResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public ActorResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ActorResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ActorResponseProjection url() {
        return url(null);
    }

    public ActorResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ActorResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public ActorResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public ActorResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public ActorResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public ActorResponseProjection onMannequin(MannequinResponseProjection subProjection) {
        return onMannequin(null, subProjection);
    }

    public ActorResponseProjection onMannequin(String alias, MannequinResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection));
        return this;
    }

    public ActorResponseProjection onBot(BotResponseProjection subProjection) {
        return onBot(null, subProjection);
    }

    public ActorResponseProjection onBot(String alias, BotResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection));
        return this;
    }

    public ActorResponseProjection typename() {
        return typename(null);
    }

    public ActorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
