package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class IssueFiltersTO implements java.io.Serializable {

    private String assignee;
    private String createdBy;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labels;
    private String mentioned;
    private String milestone;
    private String since;
    @javax.validation.constraints.NotNull
    private java.util.List<IssueStateTO> states;
    private Boolean viewerSubscribed = false;

    public IssueFiltersTO() {
    }

    public IssueFiltersTO(String assignee, String createdBy, java.util.List<String> labels, String mentioned, String milestone, String since, java.util.List<IssueStateTO> states, Boolean viewerSubscribed) {
        this.assignee = assignee;
        this.createdBy = createdBy;
        this.labels = labels;
        this.mentioned = mentioned;
        this.milestone = milestone;
        this.since = since;
        this.states = states;
        this.viewerSubscribed = viewerSubscribed;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }

    public String getMentioned() {
        return mentioned;
    }

    public String getMilestone() {
        return milestone;
    }

    public String getSince() {
        return since;
    }

    public java.util.List<IssueStateTO> getStates() {
        return states;
    }

    public Boolean getViewerSubscribed() {
        return viewerSubscribed;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee));
        }
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy));
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels));
        }
        if (mentioned != null) {
            joiner.add("mentioned: " + GraphQLRequestSerializer.getEntry(mentioned));
        }
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone));
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        if (viewerSubscribed != null) {
            joiner.add("viewerSubscribed: " + GraphQLRequestSerializer.getEntry(viewerSubscribed));
        }
        return joiner.toString();
    }

    public static IssueFiltersTO.Builder builder() {
        return new IssueFiltersTO.Builder();
    }

    public static class Builder {

        private String assignee;
        private String createdBy;
        private java.util.List<String> labels;
        private String mentioned;
        private String milestone;
        private String since;
        private java.util.List<IssueStateTO> states;
        private Boolean viewerSubscribed = false;

        public Builder() {
        }

        public Builder setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMentioned(String mentioned) {
            this.mentioned = mentioned;
            return this;
        }

        public Builder setMilestone(String milestone) {
            this.milestone = milestone;
            return this;
        }

        public Builder setSince(String since) {
            this.since = since;
            return this;
        }

        public Builder setStates(java.util.List<IssueStateTO> states) {
            this.states = states;
            return this;
        }

        public Builder setViewerSubscribed(Boolean viewerSubscribed) {
            this.viewerSubscribed = viewerSubscribed;
            return this;
        }


        public IssueFiltersTO build() {
            return new IssueFiltersTO(assignee, createdBy, labels, mentioned, milestone, since, states, viewerSubscribed);
        }

    }
}
