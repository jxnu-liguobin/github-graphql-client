package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for ProjectColumn
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ProjectColumnResolver {

    @javax.validation.constraints.NotNull
    ProjectCardConnectionTO cards(ProjectColumnTO projectColumnTO, String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) throws Exception;

}
