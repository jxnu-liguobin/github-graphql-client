package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for RepositoryOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface RepositoryOwnerResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(RepositoryOwnerTO repositoryOwnerTO, Integer size) throws Exception;

    @Deprecated
    @javax.validation.constraints.NotNull
    RepositoryConnectionTO pinnedRepositories(RepositoryOwnerTO repositoryOwnerTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    @javax.validation.constraints.NotNull
    RepositoryConnectionTO repositories(RepositoryOwnerTO repositoryOwnerTO, java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isFork, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) throws Exception;

    RepositoryTO repository(RepositoryOwnerTO repositoryOwnerTO, String name) throws Exception;

}
