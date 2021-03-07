package io.github.graphql.kotlin.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
enum class GitSignatureStateTO(val graphqlName: String) {

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
    VALID("VALID")
}
