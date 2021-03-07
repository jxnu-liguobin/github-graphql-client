package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for MemberStatusable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface MemberStatusableResolver {

    @javax.validation.constraints.NotNull
    UserStatusConnectionTO memberStatuses(MemberStatusableTO memberStatusableTO, String after, String before, Integer first, Integer last, UserStatusOrderTO orderBy) throws Exception;

}
