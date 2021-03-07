package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ProfileItemShowcaseResolver {

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO items(ProfileItemShowcaseTO profileItemShowcaseTO, String after, String before, Integer first, Integer last) throws Exception;

}
