package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object UserBlockDurationTO extends Enumeration {

    type UserBlockDurationTO = Value

    val ONE_DAY: Value = Value("ONE_DAY")
    val ONE_MONTH: Value = Value("ONE_MONTH")
    val ONE_WEEK: Value = Value("ONE_WEEK")
    val PERMANENT: Value = Value("PERMANENT")
    val THREE_DAYS: Value = Value("THREE_DAYS")

}

class UserBlockDurationTOTypeRefer extends TypeReference[UserBlockDurationTO.type]
