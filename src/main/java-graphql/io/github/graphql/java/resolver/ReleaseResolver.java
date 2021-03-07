package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Release
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ReleaseResolver {

    @javax.validation.constraints.NotNull
    ReleaseAssetConnectionTO releaseAssets(ReleaseTO releaseTO, String after, String before, Integer first, Integer last, String name) throws Exception;

}
