package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryTopic
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryTopicResponseProjection extends GraphQLResponseProjection {

    public RepositoryTopicResponseProjection() {
    }

    @Override
    public RepositoryTopicResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryTopicResponseProjection all$(int maxDepth) {
        this.id();
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0) + 1);
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicResponseProjection.TopicResponseProjection.topic", 0)));
        }
        this.url();
        this.typename();
        return this;
    }

    public RepositoryTopicResponseProjection id() {
        return id(null);
    }

    public RepositoryTopicResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RepositoryTopicResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public RepositoryTopicResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public RepositoryTopicResponseProjection topic(TopicResponseProjection subProjection) {
        return topic(null, subProjection);
    }

    public RepositoryTopicResponseProjection topic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryTopicResponseProjection url() {
        return url(null);
    }

    public RepositoryTopicResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RepositoryTopicResponseProjection typename() {
        return typename(null);
    }

    public RepositoryTopicResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
