package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Deployment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface DeploymentResolver {

    DeploymentStatusConnectionTO statuses(DeploymentTO deploymentTO, String after, String before, Integer first, Integer last) throws Exception;

}
