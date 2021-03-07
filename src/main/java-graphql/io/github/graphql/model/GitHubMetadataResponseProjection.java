package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GitHubMetadata
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class GitHubMetadataResponseProjection extends GraphQLResponseProjection {

    public GitHubMetadataResponseProjection() {
    }

    @Override
    public GitHubMetadataResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GitHubMetadataResponseProjection all$(int maxDepth) {
        this.gitHubServicesSha();
        this.gitIpAddresses();
        this.hookIpAddresses();
        this.importerIpAddresses();
        this.isPasswordAuthenticationVerifiable();
        this.pagesIpAddresses();
        this.typename();
        return this;
    }

    public GitHubMetadataResponseProjection gitHubServicesSha() {
        return gitHubServicesSha(null);
    }

    public GitHubMetadataResponseProjection gitHubServicesSha(String alias) {
        fields.add(new GraphQLResponseField("gitHubServicesSha").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection gitIpAddresses() {
        return gitIpAddresses(null);
    }

    public GitHubMetadataResponseProjection gitIpAddresses(String alias) {
        fields.add(new GraphQLResponseField("gitIpAddresses").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection hookIpAddresses() {
        return hookIpAddresses(null);
    }

    public GitHubMetadataResponseProjection hookIpAddresses(String alias) {
        fields.add(new GraphQLResponseField("hookIpAddresses").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection importerIpAddresses() {
        return importerIpAddresses(null);
    }

    public GitHubMetadataResponseProjection importerIpAddresses(String alias) {
        fields.add(new GraphQLResponseField("importerIpAddresses").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection isPasswordAuthenticationVerifiable() {
        return isPasswordAuthenticationVerifiable(null);
    }

    public GitHubMetadataResponseProjection isPasswordAuthenticationVerifiable(String alias) {
        fields.add(new GraphQLResponseField("isPasswordAuthenticationVerifiable").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection pagesIpAddresses() {
        return pagesIpAddresses(null);
    }

    public GitHubMetadataResponseProjection pagesIpAddresses(String alias) {
        fields.add(new GraphQLResponseField("pagesIpAddresses").alias(alias));
        return this;
    }

    public GitHubMetadataResponseProjection typename() {
        return typename(null);
    }

    public GitHubMetadataResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
