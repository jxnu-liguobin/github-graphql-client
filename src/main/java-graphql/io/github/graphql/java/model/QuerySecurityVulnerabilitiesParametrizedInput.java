package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field securityVulnerabilities in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QuerySecurityVulnerabilitiesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private SecurityAdvisoryEcosystemTO ecosystem;
    private Integer first;
    private Integer last;
    private SecurityVulnerabilityOrderTO orderBy;
    private String Package;
    @javax.validation.constraints.NotNull
    private java.util.List<SecurityAdvisorySeverityTO> severities;

    public QuerySecurityVulnerabilitiesParametrizedInput() {
    }

    public QuerySecurityVulnerabilitiesParametrizedInput(String after, String before, SecurityAdvisoryEcosystemTO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderTO orderBy, String Package, java.util.List<SecurityAdvisorySeverityTO> severities) {
        this.after = after;
        this.before = before;
        this.ecosystem = ecosystem;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.Package = Package;
        this.severities = severities;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput ecosystem(SecurityAdvisoryEcosystemTO ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput orderBy(SecurityVulnerabilityOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput Package(String Package) {
        this.Package = Package;
        return this;
    }

    public QuerySecurityVulnerabilitiesParametrizedInput severities(java.util.List<SecurityAdvisorySeverityTO> severities) {
        this.severities = severities;
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
        final QuerySecurityVulnerabilitiesParametrizedInput that = (QuerySecurityVulnerabilitiesParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(ecosystem, that.ecosystem)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(Package, that.Package)
            && Objects.equals(severities, that.severities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, ecosystem, first, last, orderBy, Package, severities);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (ecosystem != null) {
            joiner.add("ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (Package != null) {
            joiner.add("package: " + GraphQLRequestSerializer.getEntry(Package));
        }
        if (severities != null) {
            joiner.add("severities: " + GraphQLRequestSerializer.getEntry(severities));
        }
        return joiner.toString();
    }

}
