package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field repositories in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationRepositoriesParametrizedInput implements GraphQLParametrizedInput {

    private java.util.List<RepositoryAffiliationTO> affiliations = java.util.Arrays.asList(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR);
    private String after;
    private String before;
    private Integer first;
    private Boolean isFork;
    private Boolean isLocked;
    private Integer last;
    private RepositoryOrderTO orderBy;
    private java.util.List<RepositoryAffiliationTO> ownerAffiliations = java.util.Arrays.asList(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR);
    private RepositoryPrivacyTO privacy;

    public OrganizationRepositoriesParametrizedInput() {
    }

    public OrganizationRepositoriesParametrizedInput(java.util.List<RepositoryAffiliationTO> affiliations, String after, String before, Integer first, Boolean isFork, Boolean isLocked, Integer last, RepositoryOrderTO orderBy, java.util.List<RepositoryAffiliationTO> ownerAffiliations, RepositoryPrivacyTO privacy) {
        this.affiliations = affiliations;
        this.after = after;
        this.before = before;
        this.first = first;
        this.isFork = isFork;
        this.isLocked = isLocked;
        this.last = last;
        this.orderBy = orderBy;
        this.ownerAffiliations = ownerAffiliations;
        this.privacy = privacy;
    }

    public OrganizationRepositoriesParametrizedInput affiliations(java.util.List<RepositoryAffiliationTO> affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput isFork(Boolean isFork) {
        this.isFork = isFork;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput orderBy(RepositoryOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput ownerAffiliations(java.util.List<RepositoryAffiliationTO> ownerAffiliations) {
        this.ownerAffiliations = ownerAffiliations;
        return this;
    }

    public OrganizationRepositoriesParametrizedInput privacy(RepositoryPrivacyTO privacy) {
        this.privacy = privacy;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (affiliations != null) {
            joiner.add("affiliations: " + GraphQLRequestSerializer.getEntry(affiliations));
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (isFork != null) {
            joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork));
        }
        if (isLocked != null) {
            joiner.add("isLocked: " + GraphQLRequestSerializer.getEntry(isLocked));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (ownerAffiliations != null) {
            joiner.add("ownerAffiliations: " + GraphQLRequestSerializer.getEntry(ownerAffiliations));
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy));
        }
        return joiner.toString();
    }

}
