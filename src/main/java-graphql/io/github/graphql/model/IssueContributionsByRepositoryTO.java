package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueContributionsByRepositoryTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private RepositoryTO repository;

    public IssueContributionsByRepositoryTO() {
    }

    public IssueContributionsByRepositoryTO(RepositoryTO repository) {
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

    public static IssueContributionsByRepositoryTO.Builder builder() {
        return new IssueContributionsByRepositoryTO.Builder();
    }

    public static class Builder {

        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public IssueContributionsByRepositoryTO build() {
            return new IssueContributionsByRepositoryTO(repository);
        }

    }
}
