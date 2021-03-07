package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for ProjectColumn
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ProjectColumnResolver {

    @javax.validation.constraints.NotNull
    ProjectCardConnectionTO cards(ProjectColumnTO projectColumnTO, String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) throws Exception;

}
