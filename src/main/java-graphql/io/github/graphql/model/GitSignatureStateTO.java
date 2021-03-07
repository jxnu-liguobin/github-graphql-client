package io.github.graphql.model;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public enum GitSignatureStateTO {

    BAD_CERT("BAD_CERT"),
    BAD_EMAIL("BAD_EMAIL"),
    EXPIRED_KEY("EXPIRED_KEY"),
    GPGVERIFY_ERROR("GPGVERIFY_ERROR"),
    GPGVERIFY_UNAVAILABLE("GPGVERIFY_UNAVAILABLE"),
    INVALID("INVALID"),
    MALFORMED_SIG("MALFORMED_SIG"),
    NOT_SIGNING_KEY("NOT_SIGNING_KEY"),
    NO_USER("NO_USER"),
    OCSP_ERROR("OCSP_ERROR"),
    OCSP_PENDING("OCSP_PENDING"),
    OCSP_REVOKED("OCSP_REVOKED"),
    UNKNOWN_KEY("UNKNOWN_KEY"),
    UNKNOWN_SIG_TYPE("UNKNOWN_SIG_TYPE"),
    UNSIGNED("UNSIGNED"),
    UNVERIFIED_EMAIL("UNVERIFIED_EMAIL"),
    VALID("VALID");

    private final String graphqlName;

    private GitSignatureStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
