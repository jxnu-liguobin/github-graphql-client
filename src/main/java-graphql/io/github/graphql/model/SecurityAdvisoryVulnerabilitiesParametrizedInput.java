package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field vulnerabilities in type SecurityAdvisory
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryVulnerabilitiesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private SecurityAdvisoryEcosystemTO ecosystem;
    private Integer first;
    private Integer last;
    private SecurityVulnerabilityOrderTO orderBy;
    private String Package;
    @javax.validation.constraints.NotNull
    private java.util.List<SecurityAdvisorySeverityTO> severities;

    public SecurityAdvisoryVulnerabilitiesParametrizedInput() {
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput(String after, String before, SecurityAdvisoryEcosystemTO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderTO orderBy, String Package, java.util.List<SecurityAdvisorySeverityTO> severities) {
        this.after = after;
        this.before = before;
        this.ecosystem = ecosystem;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.Package = Package;
        this.severities = severities;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput ecosystem(SecurityAdvisoryEcosystemTO ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput orderBy(SecurityVulnerabilityOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput Package(String Package) {
        this.Package = Package;
        return this;
    }

    public SecurityAdvisoryVulnerabilitiesParametrizedInput severities(java.util.List<SecurityAdvisorySeverityTO> severities) {
        this.severities = severities;
        return this;
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
