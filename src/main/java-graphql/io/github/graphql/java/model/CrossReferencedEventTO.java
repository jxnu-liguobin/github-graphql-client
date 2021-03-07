package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CrossReferencedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isCrossRepository;
    @javax.validation.constraints.NotNull
    private String referencedAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectTO source;
    @javax.validation.constraints.NotNull
    private ReferencedSubjectTO target;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean willCloseTarget;

    public CrossReferencedEventTO() {
    }

    public CrossReferencedEventTO(ActorTO actor, String createdAt, String id, boolean isCrossRepository, String referencedAt, String resourcePath, ReferencedSubjectTO source, ReferencedSubjectTO target, String url, boolean willCloseTarget) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.referencedAt = referencedAt;
        this.resourcePath = resourcePath;
        this.source = source;
        this.target = target;
        this.url = url;
        this.willCloseTarget = willCloseTarget;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public boolean getIsCrossRepository() {
        return isCrossRepository;
    }

    public String getReferencedAt() {
        return referencedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public ReferencedSubjectTO getSource() {
        return source;
    }

    public ReferencedSubjectTO getTarget() {
        return target;
    }

    public String getUrl() {
        return url;
    }

    public boolean getWillCloseTarget() {
        return willCloseTarget;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CrossReferencedEventTO that = (CrossReferencedEventTO) obj;
        return Objects.equals(actor, that.actor)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(isCrossRepository, that.isCrossRepository)
            && Objects.equals(referencedAt, that.referencedAt)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(source, that.source)
            && Objects.equals(target, that.target)
            && Objects.equals(url, that.url)
            && Objects.equals(willCloseTarget, that.willCloseTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository));
        if (referencedAt != null) {
            joiner.add("referencedAt: " + GraphQLRequestSerializer.getEntry(referencedAt));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("willCloseTarget: " + GraphQLRequestSerializer.getEntry(willCloseTarget));
        return joiner.toString();
    }

    public static CrossReferencedEventTO.Builder builder() {
        return new CrossReferencedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private boolean isCrossRepository;
        private String referencedAt;
        private String resourcePath;
        private ReferencedSubjectTO source;
        private ReferencedSubjectTO target;
        private String url;
        private boolean willCloseTarget;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
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

        public Builder setIsCrossRepository(boolean isCrossRepository) {
            this.isCrossRepository = isCrossRepository;
            return this;
        }

        public Builder setReferencedAt(String referencedAt) {
            this.referencedAt = referencedAt;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setSource(ReferencedSubjectTO source) {
            this.source = source;
            return this;
        }

        public Builder setTarget(ReferencedSubjectTO target) {
            this.target = target;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setWillCloseTarget(boolean willCloseTarget) {
            this.willCloseTarget = willCloseTarget;
            return this;
        }


        public CrossReferencedEventTO build() {
            return new CrossReferencedEventTO(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget);
        }

    }
}
