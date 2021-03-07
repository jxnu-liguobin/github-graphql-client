package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TopicTO implements java.io.Serializable, StarrableTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private boolean viewerHasStarred;

    public TopicTO() {
    }

    public TopicTO(String id, String name, boolean viewerHasStarred) {
        this.id = id;
        this.name = name;
        this.viewerHasStarred = viewerHasStarred;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getViewerHasStarred() {
        return viewerHasStarred;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TopicTO that = (TopicTO) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(viewerHasStarred, that.viewerHasStarred);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, viewerHasStarred);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred));
        return joiner.toString();
    }

    public static TopicTO.Builder builder() {
        return new TopicTO.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private boolean viewerHasStarred;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setViewerHasStarred(boolean viewerHasStarred) {
            this.viewerHasStarred = viewerHasStarred;
            return this;
        }


        public TopicTO build() {
            return new TopicTO(id, name, viewerHasStarred);
        }

    }
}
