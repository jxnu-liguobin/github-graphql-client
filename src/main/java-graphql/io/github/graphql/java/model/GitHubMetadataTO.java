package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GitHubMetadataTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String gitHubServicesSha;
    @javax.validation.constraints.NotNull
    private java.util.List<String> gitIpAddresses;
    @javax.validation.constraints.NotNull
    private java.util.List<String> hookIpAddresses;
    @javax.validation.constraints.NotNull
    private java.util.List<String> importerIpAddresses;
    private boolean isPasswordAuthenticationVerifiable;
    @javax.validation.constraints.NotNull
    private java.util.List<String> pagesIpAddresses;

    public GitHubMetadataTO() {
    }

    public GitHubMetadataTO(String gitHubServicesSha, java.util.List<String> gitIpAddresses, java.util.List<String> hookIpAddresses, java.util.List<String> importerIpAddresses, boolean isPasswordAuthenticationVerifiable, java.util.List<String> pagesIpAddresses) {
        this.gitHubServicesSha = gitHubServicesSha;
        this.gitIpAddresses = gitIpAddresses;
        this.hookIpAddresses = hookIpAddresses;
        this.importerIpAddresses = importerIpAddresses;
        this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
        this.pagesIpAddresses = pagesIpAddresses;
    }

    public String getGitHubServicesSha() {
        return gitHubServicesSha;
    }

    public java.util.List<String> getGitIpAddresses() {
        return gitIpAddresses;
    }

    public java.util.List<String> getHookIpAddresses() {
        return hookIpAddresses;
    }

    public java.util.List<String> getImporterIpAddresses() {
        return importerIpAddresses;
    }

    public boolean getIsPasswordAuthenticationVerifiable() {
        return isPasswordAuthenticationVerifiable;
    }

    public java.util.List<String> getPagesIpAddresses() {
        return pagesIpAddresses;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GitHubMetadataTO that = (GitHubMetadataTO) obj;
        return Objects.equals(gitHubServicesSha, that.gitHubServicesSha)
            && Objects.equals(gitIpAddresses, that.gitIpAddresses)
            && Objects.equals(hookIpAddresses, that.hookIpAddresses)
            && Objects.equals(importerIpAddresses, that.importerIpAddresses)
            && Objects.equals(isPasswordAuthenticationVerifiable, that.isPasswordAuthenticationVerifiable)
            && Objects.equals(pagesIpAddresses, that.pagesIpAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitHubServicesSha, gitIpAddresses, hookIpAddresses, importerIpAddresses, isPasswordAuthenticationVerifiable, pagesIpAddresses);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (gitHubServicesSha != null) {
            joiner.add("gitHubServicesSha: " + GraphQLRequestSerializer.getEntry(gitHubServicesSha));
        }
        if (gitIpAddresses != null) {
            joiner.add("gitIpAddresses: " + GraphQLRequestSerializer.getEntry(gitIpAddresses));
        }
        if (hookIpAddresses != null) {
            joiner.add("hookIpAddresses: " + GraphQLRequestSerializer.getEntry(hookIpAddresses));
        }
        if (importerIpAddresses != null) {
            joiner.add("importerIpAddresses: " + GraphQLRequestSerializer.getEntry(importerIpAddresses));
        }
        joiner.add("isPasswordAuthenticationVerifiable: " + GraphQLRequestSerializer.getEntry(isPasswordAuthenticationVerifiable));
        if (pagesIpAddresses != null) {
            joiner.add("pagesIpAddresses: " + GraphQLRequestSerializer.getEntry(pagesIpAddresses));
        }
        return joiner.toString();
    }

    public static GitHubMetadataTO.Builder builder() {
        return new GitHubMetadataTO.Builder();
    }

    public static class Builder {

        private String gitHubServicesSha;
        private java.util.List<String> gitIpAddresses;
        private java.util.List<String> hookIpAddresses;
        private java.util.List<String> importerIpAddresses;
        private boolean isPasswordAuthenticationVerifiable;
        private java.util.List<String> pagesIpAddresses;

        public Builder() {
        }

        public Builder setGitHubServicesSha(String gitHubServicesSha) {
            this.gitHubServicesSha = gitHubServicesSha;
            return this;
        }

        public Builder setGitIpAddresses(java.util.List<String> gitIpAddresses) {
            this.gitIpAddresses = gitIpAddresses;
            return this;
        }

        public Builder setHookIpAddresses(java.util.List<String> hookIpAddresses) {
            this.hookIpAddresses = hookIpAddresses;
            return this;
        }

        public Builder setImporterIpAddresses(java.util.List<String> importerIpAddresses) {
            this.importerIpAddresses = importerIpAddresses;
            return this;
        }

        public Builder setIsPasswordAuthenticationVerifiable(boolean isPasswordAuthenticationVerifiable) {
            this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable;
            return this;
        }

        public Builder setPagesIpAddresses(java.util.List<String> pagesIpAddresses) {
            this.pagesIpAddresses = pagesIpAddresses;
            return this;
        }


        public GitHubMetadataTO build() {
            return new GitHubMetadataTO(gitHubServicesSha, gitIpAddresses, hookIpAddresses, importerIpAddresses, isPasswordAuthenticationVerifiable, pagesIpAddresses);
        }

    }
}
