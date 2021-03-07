package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityVulnerabilitiesQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "securityVulnerabilities";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public SecurityVulnerabilitiesQueryRequest() {
    }

    public SecurityVulnerabilitiesQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setEcosystem(SecurityAdvisoryEcosystemTO ecosystem) {
        this.input.put("ecosystem", ecosystem);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setOrderBy(SecurityVulnerabilityOrderTO orderBy) {
        this.input.put("orderBy", orderBy);
    }

    public void setPackage(String Package) {
        this.input.put("package", Package);
    }

    public void setSeverities(java.util.List<SecurityAdvisorySeverityTO> severities) {
        this.input.put("severities", severities);
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
    public String toString() {
        return Objects.toString(input);
    }

    public static SecurityVulnerabilitiesQueryRequest.Builder builder() {
        return new SecurityVulnerabilitiesQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String after;
        private String before;
        private SecurityAdvisoryEcosystemTO ecosystem;
        private Integer first;
        private Integer last;
        private SecurityVulnerabilityOrderTO orderBy;
        private String Package;
        private java.util.List<SecurityAdvisorySeverityTO> severities;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setEcosystem(SecurityAdvisoryEcosystemTO ecosystem) {
            this.ecosystem = ecosystem;
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

        public Builder setOrderBy(SecurityVulnerabilityOrderTO orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setPackage(String Package) {
            this.Package = Package;
            return this;
        }

        public Builder setSeverities(java.util.List<SecurityAdvisorySeverityTO> severities) {
            this.severities = severities;
            return this;
        }


        public SecurityVulnerabilitiesQueryRequest build() {
            SecurityVulnerabilitiesQueryRequest obj = new SecurityVulnerabilitiesQueryRequest($alias);
            obj.setAfter(after);
            obj.setBefore(before);
            obj.setEcosystem(ecosystem);
            obj.setFirst(first);
            obj.setLast(last);
            obj.setOrderBy(orderBy);
            obj.setPackage(Package);
            obj.setSeverities(severities);
            return obj;
        }

    }
}
