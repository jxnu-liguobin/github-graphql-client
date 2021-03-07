package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LockLockableMutationResponse extends GraphQLResult<Map<String, LockLockablePayloadTO>> {

    private static final String OPERATION_NAME = "lockLockable";

    public LockLockableMutationResponse() {
    }

    public LockLockablePayloadTO lockLockable() {
        Map<String, LockLockablePayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
