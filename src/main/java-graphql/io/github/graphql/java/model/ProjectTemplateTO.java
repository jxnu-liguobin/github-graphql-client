package io.github.graphql.java.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public enum ProjectTemplateTO {

    AUTOMATED_KANBAN_V2("AUTOMATED_KANBAN_V2"),
    AUTOMATED_REVIEWS_KANBAN("AUTOMATED_REVIEWS_KANBAN"),
    BASIC_KANBAN("BASIC_KANBAN"),
    BUG_TRIAGE("BUG_TRIAGE");

    private final String graphqlName;

    private ProjectTemplateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
