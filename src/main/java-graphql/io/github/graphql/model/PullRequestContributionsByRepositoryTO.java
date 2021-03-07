package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestContributionsByRepositoryTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private RepositoryTO repository;

    public PullRequestContributionsByRepositoryTO() {
    }

    public PullRequestContributionsByRepositoryTO(RepositoryTO repository) {
        this.repository = repository;
    }

    public RepositoryTO getRepository() {
        return repository;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static PullRequestContributionsByRepositoryTO.Builder builder() {
        return new PullRequestContributionsByRepositoryTO.Builder();
    }

    public static class Builder {

        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public PullRequestContributionsByRepositoryTO build() {
            return new PullRequestContributionsByRepositoryTO(repository);
        }

    }
}
