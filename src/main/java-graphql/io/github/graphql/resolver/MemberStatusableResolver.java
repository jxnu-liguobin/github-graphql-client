package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for MemberStatusable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface MemberStatusableResolver {

    @javax.validation.constraints.NotNull
    UserStatusConnectionTO memberStatuses(MemberStatusableTO memberStatusableTO, String after, String before, Integer first, Integer last, UserStatusOrderTO orderBy) throws Exception;

}
