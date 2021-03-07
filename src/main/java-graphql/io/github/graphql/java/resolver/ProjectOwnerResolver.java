package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for ProjectOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ProjectOwnerResolver {

    ProjectTO project(ProjectOwnerTO projectOwnerTO, int number) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectConnectionTO projects(ProjectOwnerTO projectOwnerTO, String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) throws Exception;

}
