package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Topic
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TopicResponseProjection extends GraphQLResponseProjection {

    public TopicResponseProjection() {
    }

    @Override
    public TopicResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TopicResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicResponseProjection.TopicResponseProjection.relatedTopics", projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0) + 1);
            this.relatedTopics(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.TopicResponseProjection.relatedTopics", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1);
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)));
        }
        this.viewerHasStarred();
        this.typename();
        return this;
    }

    public TopicResponseProjection id() {
        return id(null);
    }

    public TopicResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TopicResponseProjection name() {
        return name(null);
    }

    public TopicResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TopicResponseProjection relatedTopics(TopicResponseProjection subProjection) {
        return relatedTopics((String)null, subProjection);
    }

    public TopicResponseProjection relatedTopics(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedTopics").alias(alias).projection(subProjection));
        return this;
    }

    public TopicResponseProjection relatedTopics(TopicRelatedTopicsParametrizedInput input, TopicResponseProjection subProjection) {
        return relatedTopics(null, input, subProjection);
    }

    public TopicResponseProjection relatedTopics(String alias, TopicRelatedTopicsParametrizedInput input, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedTopics").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TopicResponseProjection stargazers(StargazerConnectionResponseProjection subProjection) {
        return stargazers((String)null, subProjection);
    }

    public TopicResponseProjection stargazers(String alias, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection));
        return this;
    }

    public TopicResponseProjection stargazers(TopicStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        return stargazers(null, input, subProjection);
    }

    public TopicResponseProjection stargazers(String alias, TopicStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public TopicResponseProjection viewerHasStarred() {
        return viewerHasStarred(null);
    }

    public TopicResponseProjection viewerHasStarred(String alias) {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias));
        return this;
    }

    public TopicResponseProjection typename() {
        return typename(null);
    }

    public TopicResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
