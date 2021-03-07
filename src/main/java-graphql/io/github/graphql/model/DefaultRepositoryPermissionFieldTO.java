package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum DefaultRepositoryPermissionFieldTO {

    ADMIN("ADMIN"),
    NONE("NONE"),
    READ("READ"),
    WRITE("WRITE");

    private final String graphqlName;

    private DefaultRepositoryPermissionFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
