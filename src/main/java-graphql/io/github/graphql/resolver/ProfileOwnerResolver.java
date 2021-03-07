package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for ProfileOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface ProfileOwnerResolver {

    boolean anyPinnableItems(ProfileOwnerTO profileOwnerTO, PinnableItemTypeTO type) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnableItems(ProfileOwnerTO profileOwnerTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnedItems(ProfileOwnerTO profileOwnerTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

}
