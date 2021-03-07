package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Release
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ReleaseResolver {

    @javax.validation.constraints.NotNull
    ReleaseAssetConnectionTO releaseAssets(ReleaseTO releaseTO, String after, String before, Integer first, Integer last, String name) throws Exception;

}
