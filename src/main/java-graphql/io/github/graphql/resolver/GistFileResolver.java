package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for GistFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface GistFileResolver {

    String text(GistFileTO gistFileTO, Integer truncate) throws Exception;

}
