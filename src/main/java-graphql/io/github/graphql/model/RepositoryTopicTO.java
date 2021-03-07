package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RepositoryTopicTO implements java.io.Serializable, UniformResourceLocatableTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private TopicTO topic;
    @javax.validation.constraints.NotNull
    private String url;

    public RepositoryTopicTO() {
    }

    public RepositoryTopicTO(String id, String resourcePath, TopicTO topic, String url) {
        this.id = id;
        this.resourcePath = resourcePath;
        this.topic = topic;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public TopicTO getTopic() {
        return topic;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (topic != null) {
            joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static RepositoryTopicTO.Builder builder() {
        return new RepositoryTopicTO.Builder();
    }

    public static class Builder {

        private String id;
        private String resourcePath;
        private TopicTO topic;
        private String url;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setTopic(TopicTO topic) {
            this.topic = topic;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public RepositoryTopicTO build() {
            return new RepositoryTopicTO(id, resourcePath, topic, url);
        }

    }
}
