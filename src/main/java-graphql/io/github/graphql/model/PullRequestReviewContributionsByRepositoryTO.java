package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReviewContributionsByRepositoryTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private RepositoryTO repository;

    public PullRequestReviewContributionsByRepositoryTO() {
    }

    public PullRequestReviewContributionsByRepositoryTO(RepositoryTO repository) {
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

    public static PullRequestReviewContributionsByRepositoryTO.Builder builder() {
        return new PullRequestReviewContributionsByRepositoryTO.Builder();
    }

    public static class Builder {

        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public PullRequestReviewContributionsByRepositoryTO build() {
            return new PullRequestReviewContributionsByRepositoryTO(repository);
        }

    }
}
