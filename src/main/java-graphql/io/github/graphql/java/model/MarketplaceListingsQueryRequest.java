package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MarketplaceListingsQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "marketplaceListings";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public MarketplaceListingsQueryRequest() {
    }

    public MarketplaceListingsQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setAdminId(String adminId) {
        this.input.put("adminId", adminId);
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setAllStates(Boolean allStates) {
        this.input.put("allStates", allStates);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setCategorySlug(String categorySlug) {
        this.input.put("categorySlug", categorySlug);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setOrganizationId(String organizationId) {
        this.input.put("organizationId", organizationId);
    }

    public void setPrimaryCategoryOnly(Boolean primaryCategoryOnly) {
        this.input.put("primaryCategoryOnly", primaryCategoryOnly);
    }

    public void setSlugs(java.util.List<String> slugs) {
        this.input.put("slugs", slugs);
    }

    public void setUseTopicAliases(Boolean useTopicAliases) {
        this.input.put("useTopicAliases", useTopicAliases);
    }

    public void setViewerCanAdmin(Boolean viewerCanAdmin) {
        this.input.put("viewerCanAdmin", viewerCanAdmin);
    }

    public void setWithFreeTrialsOnly(Boolean withFreeTrialsOnly) {
        this.input.put("withFreeTrialsOnly", withFreeTrialsOnly);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MarketplaceListingsQueryRequest that = (MarketplaceListingsQueryRequest) obj;
        return Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperationType(), getOperationName(), input);
    }
    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static MarketplaceListingsQueryRequest.Builder builder() {
        return new MarketplaceListingsQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
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

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setAllStates(Boolean allStates) {
            this.allStates = allStates;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setCategorySlug(String categorySlug) {
            this.categorySlug = categorySlug;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder setPrimaryCategoryOnly(Boolean primaryCategoryOnly) {
            this.primaryCategoryOnly = primaryCategoryOnly;
            return this;
        }

        public Builder setSlugs(java.util.List<String> slugs) {
            this.slugs = slugs;
            return this;
        }

        public Builder setUseTopicAliases(Boolean useTopicAliases) {
            this.useTopicAliases = useTopicAliases;
            return this;
        }

        public Builder setViewerCanAdmin(Boolean viewerCanAdmin) {
            this.viewerCanAdmin = viewerCanAdmin;
            return this;
        }

        public Builder setWithFreeTrialsOnly(Boolean withFreeTrialsOnly) {
            this.withFreeTrialsOnly = withFreeTrialsOnly;
            return this;
        }


        public MarketplaceListingsQueryRequest build() {
            MarketplaceListingsQueryRequest obj = new MarketplaceListingsQueryRequest($alias);
            obj.setAdminId(adminId);
            obj.setAfter(after);
            obj.setAllStates(allStates);
            obj.setBefore(before);
            obj.setCategorySlug(categorySlug);
            obj.setFirst(first);
            obj.setLast(last);
            obj.setOrganizationId(organizationId);
            obj.setPrimaryCategoryOnly(primaryCategoryOnly);
            obj.setSlugs(slugs);
            obj.setUseTopicAliases(useTopicAliases);
            obj.setViewerCanAdmin(viewerCanAdmin);
            obj.setWithFreeTrialsOnly(withFreeTrialsOnly);
            return obj;
        }

    }
}
