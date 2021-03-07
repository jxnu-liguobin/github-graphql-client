package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Project
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ProjectResolver {

    @javax.validation.constraints.NotNull
    ProjectColumnConnectionTO columns(ProjectTO projectTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectCardConnectionTO pendingCards(ProjectTO projectTO, String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) throws Exception;

}
