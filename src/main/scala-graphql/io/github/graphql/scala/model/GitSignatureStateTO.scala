package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object GitSignatureStateTO extends Enumeration {

    type GitSignatureStateTO = Value

    val BAD_CERT: Value = Value("BAD_CERT")
    val BAD_EMAIL: Value = Value("BAD_EMAIL")
    val EXPIRED_KEY: Value = Value("EXPIRED_KEY")
    val GPGVERIFY_ERROR: Value = Value("GPGVERIFY_ERROR")
    val GPGVERIFY_UNAVAILABLE: Value = Value("GPGVERIFY_UNAVAILABLE")
    val INVALID: Value = Value("INVALID")
    val MALFORMED_SIG: Value = Value("MALFORMED_SIG")
    val NOT_SIGNING_KEY: Value = Value("NOT_SIGNING_KEY")
    val NO_USER: Value = Value("NO_USER")
    val OCSP_ERROR: Value = Value("OCSP_ERROR")
    val OCSP_PENDING: Value = Value("OCSP_PENDING")
    val OCSP_REVOKED: Value = Value("OCSP_REVOKED")
    val UNKNOWN_KEY: Value = Value("UNKNOWN_KEY")
    val UNKNOWN_SIG_TYPE: Value = Value("UNKNOWN_SIG_TYPE")
    val UNSIGNED: Value = Value("UNSIGNED")
    val UNVERIFIED_EMAIL: Value = Value("UNVERIFIED_EMAIL")
    val VALID: Value = Value("VALID")

}

class GitSignatureStateTOTypeRefer extends TypeReference[GitSignatureStateTO.type]
