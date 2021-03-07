package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorshipTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserTO maintainer;
    @javax.validation.constraints.NotNull
    private SponsorshipPrivacyTO privacyLevel;
    private UserTO sponsor;

    public SponsorshipTO() {
    }

    public SponsorshipTO(String createdAt, String id, UserTO maintainer, SponsorshipPrivacyTO privacyLevel, UserTO sponsor) {
        this.createdAt = createdAt;
        this.id = id;
        this.maintainer = maintainer;
        this.privacyLevel = privacyLevel;
        this.sponsor = sponsor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public UserTO getMaintainer() {
        return maintainer;
    }

    public SponsorshipPrivacyTO getPrivacyLevel() {
        return privacyLevel;
    }

    public UserTO getSponsor() {
        return sponsor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SponsorshipTO that = (SponsorshipTO) obj;
        return Objects.equals(createdAt, that.createdAt)
            && Objects.equals(id, that.id)
            && Objects.equals(maintainer, that.maintainer)
            && Objects.equals(privacyLevel, that.privacyLevel)
            && Objects.equals(sponsor, that.sponsor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id, maintainer, privacyLevel, sponsor);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (maintainer != null) {
            joiner.add("maintainer: " + GraphQLRequestSerializer.getEntry(maintainer));
        }
        if (privacyLevel != null) {
            joiner.add("privacyLevel: " + GraphQLRequestSerializer.getEntry(privacyLevel));
        }
        if (sponsor != null) {
            joiner.add("sponsor: " + GraphQLRequestSerializer.getEntry(sponsor));
        }
        return joiner.toString();
    }

    public static SponsorshipTO.Builder builder() {
        return new SponsorshipTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String id;
        private UserTO maintainer;
        private SponsorshipPrivacyTO privacyLevel;
        private UserTO sponsor;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMaintainer(UserTO maintainer) {
            this.maintainer = maintainer;
            return this;
        }

        public Builder setPrivacyLevel(SponsorshipPrivacyTO privacyLevel) {
            this.privacyLevel = privacyLevel;
            return this;
        }

        public Builder setSponsor(UserTO sponsor) {
            this.sponsor = sponsor;
            return this;
        }


        public SponsorshipTO build() {
            return new SponsorshipTO(createdAt, id, maintainer, privacyLevel, sponsor);
        }

    }
}
