package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Starrable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class StarrableResponseProjection extends GraphQLResponseProjection {

    public StarrableResponseProjection() {
    }

    @Override
    public StarrableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StarrableResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1);
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarrableResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)));
        }
        this.viewerHasStarred();
        this.typename();
        return this;
    }

    public StarrableResponseProjection id() {
        return id(null);
    }

    public StarrableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StarrableResponseProjection stargazers(StargazerConnectionResponseProjection subProjection) {
        return stargazers((String)null, subProjection);
    }

    public StarrableResponseProjection stargazers(String alias, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection));
        return this;
    }

    public StarrableResponseProjection stargazers(StarrableStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        return stargazers(null, input, subProjection);
    }

    public StarrableResponseProjection stargazers(String alias, StarrableStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public StarrableResponseProjection viewerHasStarred() {
        return viewerHasStarred(null);
    }

    public StarrableResponseProjection viewerHasStarred(String alias) {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias));
        return this;
    }

    public StarrableResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public StarrableResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public StarrableResponseProjection onGist(GistResponseProjection subProjection) {
        return onGist(null, subProjection);
    }

    public StarrableResponseProjection onGist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection));
        return this;
    }

    public StarrableResponseProjection onTopic(TopicResponseProjection subProjection) {
        return onTopic(null, subProjection);
    }

    public StarrableResponseProjection onTopic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Topic").alias(alias).projection(subProjection));
        return this;
    }

    public StarrableResponseProjection typename() {
        return typename(null);
    }

    public StarrableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
