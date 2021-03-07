package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field marketplaceListings in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryMarketplaceListingsParametrizedInput implements GraphQLParametrizedInput {

    private String adminId;
    private String after;
    private Boolean allStates;
    private String before;
    private String categorySlug;
    private Integer first;
    private Integer last;
    private String organizationId;
    private Boolean primaryCategoryOnly = false;
    private java.util.List<String> slugs;
    private Boolean useTopicAliases;
    private Boolean viewerCanAdmin;
    private Boolean withFreeTrialsOnly = false;

    public QueryMarketplaceListingsParametrizedInput() {
    }

    public QueryMarketplaceListingsParametrizedInput(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, java.util.List<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) {
        this.adminId = adminId;
        this.after = after;
        this.allStates = allStates;
        this.before = before;
        this.categorySlug = categorySlug;
        this.first = first;
        this.last = last;
        this.organizationId = organizationId;
        this.primaryCategoryOnly = primaryCategoryOnly;
        this.slugs = slugs;
        this.useTopicAliases = useTopicAliases;
        this.viewerCanAdmin = viewerCanAdmin;
        this.withFreeTrialsOnly = withFreeTrialsOnly;
    }

    public QueryMarketplaceListingsParametrizedInput adminId(String adminId) {
        this.adminId = adminId;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput allStates(Boolean allStates) {
        this.allStates = allStates;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput categorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput organizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput primaryCategoryOnly(Boolean primaryCategoryOnly) {
        this.primaryCategoryOnly = primaryCategoryOnly;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput slugs(java.util.List<String> slugs) {
        this.slugs = slugs;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput useTopicAliases(Boolean useTopicAliases) {
        this.useTopicAliases = useTopicAliases;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput viewerCanAdmin(Boolean viewerCanAdmin) {
        this.viewerCanAdmin = viewerCanAdmin;
        return this;
    }

    public QueryMarketplaceListingsParametrizedInput withFreeTrialsOnly(Boolean withFreeTrialsOnly) {
        this.withFreeTrialsOnly = withFreeTrialsOnly;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final QueryMarketplaceListingsParametrizedInput that = (QueryMarketplaceListingsParametrizedInput) obj;
        return Objects.equals(adminId, that.adminId)
            && Objects.equals(after, that.after)
            && Objects.equals(allStates, that.allStates)
            && Objects.equals(before, that.before)
            && Objects.equals(categorySlug, that.categorySlug)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(organizationId, that.organizationId)
            && Objects.equals(primaryCategoryOnly, that.primaryCategoryOnly)
            && Objects.equals(slugs, that.slugs)
            && Objects.equals(useTopicAliases, that.useTopicAliases)
            && Objects.equals(viewerCanAdmin, that.viewerCanAdmin)
            && Objects.equals(withFreeTrialsOnly, that.withFreeTrialsOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, after, allStates, before, categorySlug, first, last, organizationId, primaryCategoryOnly, slugs, useTopicAliases, viewerCanAdmin, withFreeTrialsOnly);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (adminId != null) {
            joiner.add("adminId: " + GraphQLRequestSerializer.getEntry(adminId));
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (allStates != null) {
            joiner.add("allStates: " + GraphQLRequestSerializer.getEntry(allStates));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (categorySlug != null) {
            joiner.add("categorySlug: " + GraphQLRequestSerializer.getEntry(categorySlug));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId));
        }
        if (primaryCategoryOnly != null) {
            joiner.add("primaryCategoryOnly: " + GraphQLRequestSerializer.getEntry(primaryCategoryOnly));
        }
        if (slugs != null) {
            joiner.add("slugs: " + GraphQLRequestSerializer.getEntry(slugs));
        }
        if (useTopicAliases != null) {
            joiner.add("useTopicAliases: " + GraphQLRequestSerializer.getEntry(useTopicAliases));
        }
        if (viewerCanAdmin != null) {
            joiner.add("viewerCanAdmin: " + GraphQLRequestSerializer.getEntry(viewerCanAdmin));
        }
        if (withFreeTrialsOnly != null) {
            joiner.add("withFreeTrialsOnly: " + GraphQLRequestSerializer.getEntry(withFreeTrialsOnly));
        }
        return joiner.toString();
    }

}
