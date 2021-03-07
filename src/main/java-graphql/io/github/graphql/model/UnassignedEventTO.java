package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnassignedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private AssignableTO assignable;
    private AssigneeTO assignee;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @Deprecated
    private UserTO user;

    public UnassignedEventTO() {
    }

    public UnassignedEventTO(ActorTO actor, AssignableTO assignable, AssigneeTO assignee, String createdAt, String id, UserTO user) {
        this.actor = actor;
        this.assignable = assignable;
        this.assignee = assignee;
        this.createdAt = createdAt;
        this.id = id;
        this.user = user;
    }

    public ActorTO getActor() {
        return actor;
    }

    public AssignableTO getAssignable() {
        return assignable;
    }

    public AssigneeTO getAssignee() {
        return assignee;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    @Deprecated
    public UserTO getUser() {
        return user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (assignable != null) {
            joiner.add("assignable: " + GraphQLRequestSerializer.getEntry(assignable));
        }
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static UnassignedEventTO.Builder builder() {
        return new UnassignedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private AssignableTO assignable;
        private AssigneeTO assignee;
        private String createdAt;
        private String id;
        private UserTO user;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setAssignable(AssignableTO assignable) {
            this.assignable = assignable;
            return this;
        }

        public Builder setAssignee(AssigneeTO assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        @Deprecated
        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public UnassignedEventTO build() {
            return new UnassignedEventTO(actor, assignable, assignee, createdAt, id, user);
        }

    }
}
