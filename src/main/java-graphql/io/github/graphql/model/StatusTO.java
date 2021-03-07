package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class StatusTO implements java.io.Serializable, NodeTO {

    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private java.util.List<StatusContextTO> contexts;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private StatusStateTO state;

    public StatusTO() {
    }

    public StatusTO(CommitTO commit, java.util.List<StatusContextTO> contexts, String id, StatusStateTO state) {
        this.commit = commit;
        this.contexts = contexts;
        this.id = id;
        this.state = state;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public java.util.List<StatusContextTO> getContexts() {
        return contexts;
    }

    public String getId() {
        return id;
    }

    public StatusStateTO getState() {
        return state;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        if (contexts != null) {
            joiner.add("contexts: " + GraphQLRequestSerializer.getEntry(contexts));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        return joiner.toString();
    }

    public static StatusTO.Builder builder() {
        return new StatusTO.Builder();
    }

    public static class Builder {

        private CommitTO commit;
        private java.util.List<StatusContextTO> contexts;
        private String id;
        private StatusStateTO state;

        public Builder() {
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
            return this;
        }

        public Builder setContexts(java.util.List<StatusContextTO> contexts) {
            this.contexts = contexts;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setState(StatusStateTO state) {
            this.state = state;
            return this;
        }


        public StatusTO build() {
            return new StatusTO(commit, contexts, id, state);
        }

    }
}
