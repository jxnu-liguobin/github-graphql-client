package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Deployment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface DeploymentResolver {

    DeploymentStatusConnectionTO statuses(DeploymentTO deploymentTO, String after, String before, Integer first, Integer last) throws Exception;

}
