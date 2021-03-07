package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface SecurityAdvisoryResolver {

    @javax.validation.constraints.NotNull
    SecurityVulnerabilityConnectionTO vulnerabilities(SecurityAdvisoryTO securityAdvisoryTO, String after, String before, SecurityAdvisoryEcosystemTO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderTO orderBy, String Package, java.util.List<SecurityAdvisorySeverityTO> severities) throws Exception;

}
